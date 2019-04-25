package com.ws.base.transfer.cartest;

//import com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_system_pkg.CUXCARMANAGESYSTEMPKGPortType;
//import com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_system_pkg.CUXCARMANAGESYSTEMPKGService;
//import com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_system_pkg.SOAHeader;
//import com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_system_pkg.get_car_order_list.InputParameters;
//import com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_system_pkg.get_car_order_list.ObjectFactory;
//import com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_system_pkg.get_car_order_list.OutputParameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import javax.xml.ws.handler.Handler;
//import javax.xml.ws.handler.HandlerResolver;
//import javax.xml.ws.handler.PortInfo;
//import javax.xml.ws.soap.SOAPFaultException;
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.List;

/**
 * wsimport  -encoding utf-8 -keep -s d:/wsdl -keep http://develop.china-fuhai.net:8005/webservices/SOAProvider/plsql/cux_car_manage_system_pkg/?wsdl
 * wsimport  -encoding utf-8 -keep -s d:/wsdl -keep http://localhost:8080/service/student?wsdl
 * wsimport -encoding utf-8 -keep -s D:\temp -p com.lawyer.user -verbose http://服务地址?wsdl
 * -encoding : 指定编码格式
 * -keep：是否生成java源文件
 * -d：指定.class文件的输出目录
 * -s：指定.java文件的输出目录
 * -p：定义生成类的包名，不定义的话有默认包名
 * -verbose：在控制台显示输出信息
 * -b：指定jaxws/jaxb绑定文件或额外的schemas
 * -extension：使用扩展来支持SOAP1.2
 * <p>
 * <p>
 * https://www.cnblogs.com/lichmama/p/8728262.html
 * https://blog.csdn.net/fengrunche/article/details/53524173
 */
public class WSCarClient {
    private static final Logger LOG = LoggerFactory.getLogger(WSCarClient.class);

    private static final String USER_NAME = "soa_p";
    private static final String PASS_WORD = "000000";
    private static final String namespaceURI = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_system_pkg/";

    public static void main(String[] args) {
//        String localPart = "CUX_CAR_MANAGE_SYSTEM_PKG_Port";
////        QName name = new QName("http://service.demo.example.com/", "StudentServiceImplPort");
//        //方式二：通过wsimport生成客户端代码
//        CUXCARMANAGESYSTEMPKGService impl = new CUXCARMANAGESYSTEMPKGService();
//        impl.setHandlerResolver(new HandlerResolver() {
//            @Override
//            public List<Handler> getHandlerChain(PortInfo portInfo) {
//                List<Handler> handlerList = new ArrayList<Handler>();
//                handlerList.add(new CarClientHandler(namespaceURI, localPart, USER_NAME, PASS_WORD));
//                return handlerList;
//            }
//        });
//        try {
//
//
//            SOAHeader soaHeader = new SOAHeader();
//
//            String Responsibility = "CUX_SOA_ACCESS_RESP";
//            String RespApplication = "CUX";
//            String SecurityGroup = "STANDARD";
//            String NLSLanguage = "AMERICAN";
//            String Org_Id = "110";
//            soaHeader.setNLSLanguage(NLSLanguage);
//            soaHeader.setOrgId(Org_Id);
//            soaHeader.setRespApplication(RespApplication);
//            soaHeader.setSecurityGroup(SecurityGroup);
//            soaHeader.setResponsibility(Responsibility);
//
//            BigDecimal PN_SERIAL_NO = new BigDecimal(10000381);
//            String PV_BILL_NO = "FHLHYL201707043";
//            String PV_LOAD_STATUS = "0";
//            Integer PN_PAGE_NUM = 1;
//            Integer PN_PAGE_LINES = 20;
//
//            ObjectFactory objFac = new ObjectFactory();
//            InputParameters inputParameters = new InputParameters();
//            inputParameters.setPVLOADSTATUS(objFac.createInputParametersPVLOADSTATUS(PV_LOAD_STATUS));
//            inputParameters.setPVBILLNO(objFac.createInputParametersPVBILLNO(PV_BILL_NO));
//            inputParameters.setPNSERIALNO(objFac.createInputParametersPNSERIALNO(PN_SERIAL_NO));
//            inputParameters.setPNPAGENUM(objFac.createInputParametersPNPAGENUM(PN_PAGE_NUM));
//            inputParameters.setPNPAGELINES(objFac.createInputParametersPNPAGELINES(PN_PAGE_LINES));
//
//
//            CUXCARMANAGESYSTEMPKGPortType layoutService = impl.getCUXCARMANAGESYSTEMPKGPort();
//            OutputParameters result_1 = layoutService.getCARORDERLIST(soaHeader, inputParameters);
//            System.out.println("result_1  " + result_1.toString());
////            LOG.debug("[2]sayHello:" + result_1);
////            OperationResult result_2 = layoutService.addLayout("name", "content");
////            LOG.debug("[2]addLayout result_succeed:" + result_2.isSucceed());
////            LOG.debug("[2]addLayout result_msg:" + result_2.getMsg());
//        } catch (SOAPFaultException e) {
//            LOG.error("SOAPFaultException occurs:{}", e.getMessage());
//        }
    }
}

