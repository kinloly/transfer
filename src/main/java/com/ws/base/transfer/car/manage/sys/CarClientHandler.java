package com.ws.base.transfer.car.manage.sys;


import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Set;

public class CarClientHandler implements SOAPHandler<SOAPMessageContext> {
    private String username;
    private String password;
    private String namespaceURI;
    private String localPart;

    public CarClientHandler(String namespaceURI, String localPart, String username, String password) {
        this.namespaceURI = namespaceURI;
        this.localPart = localPart;
        this.username = username;
        this.password = password;
    }

    public boolean handleMessage(SOAPMessageContext ctx) {

        //出站，即客户端发出请求前，添加表头信息
        Boolean request_p = (Boolean) ctx.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (request_p) {
            try {
                SOAPMessage msg = ctx.getMessage();
                SOAPEnvelope env = msg.getSOAPPart().getEnvelope();
                SOAPHeader hdr = env.getHeader();
                if (hdr == null) hdr = env.addHeader();

                //添加认证信息头
//                QName name = new QName("http://service.demo.example.com/", "StudentServiceImplPort");
                QName name = new QName(namespaceURI, localPart);
                SOAPHeaderElement header = hdr.addHeaderElement(name);

//                SOAPElement userElement = header.addChildElement("username");
//                userElement.addTextNode(username);
//                SOAPElement passElement = header.addChildElement("password");
//                passElement.addTextNode(password);

                // 开始安全信息
                String AUTH_PREFIX = "wsse";
                String AUTH_NS = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
                SOAPFactory soapFactory = SOAPFactory.newInstance();
                SOAPElement wsSecHeaderElm = soapFactory.createElement("Security", AUTH_PREFIX, AUTH_NS);
                SOAPElement userNameTokenElm = soapFactory.createElement("UsernameToken", AUTH_PREFIX, AUTH_NS);
                SOAPElement userNameElm = soapFactory.createElement("Username", AUTH_PREFIX, AUTH_NS);
                SOAPElement passwdElm = soapFactory.createElement("Password", AUTH_PREFIX, AUTH_NS);
                passwdElm.setAttribute("type",
                        "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");

                userNameElm.addTextNode("soa_p");
                passwdElm.addTextNode("000000");

                userNameTokenElm.addChildElement(userNameElm);
                userNameTokenElm.addChildElement(passwdElm);
                wsSecHeaderElm.addChildElement(userNameTokenElm);

                hdr.addChildElement(wsSecHeaderElm);
                header.setMustUnderstand(true);
                msg.saveChanges();

                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void close(MessageContext context) {
        // TODO Auto-generated method stub
    }

    @Override
    public Set<QName> getHeaders() {
        // TODO Auto-generated method stub
        return null;
    }
}
