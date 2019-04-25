package com.ws.base.transfer.studenttest;


import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Set;

public class ClientHandler implements SOAPHandler<SOAPMessageContext> {
    private String username;
    private String password;

    public ClientHandler(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean handleMessage(SOAPMessageContext ctx) {

        //出站，即客户端发出请求前，添加表头信息
        Boolean request_p = (Boolean)ctx.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (request_p) {
            try {
                SOAPMessage msg = ctx.getMessage();
                SOAPEnvelope env = msg.getSOAPPart().getEnvelope();
                SOAPHeader hdr = env.getHeader();
                if (hdr == null) hdr = env.addHeader();

                //添加认证信息头
                QName name = new QName("http://service.wsdemo.example.com/", "StudentServiceImplPort");
                SOAPHeaderElement header = hdr.addHeaderElement(name);

                SOAPElement userElement = header.addChildElement("username");
                userElement.addTextNode(username);
                SOAPElement passElement = header.addChildElement("password");
                passElement.addTextNode(password);
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
