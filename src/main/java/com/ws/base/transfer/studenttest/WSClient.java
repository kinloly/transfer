package com.ws.base.transfer.studenttest;

import com.example.wsdemo.service.Student;
import com.example.wsdemo.service.StudentService;
import com.example.wsdemo.service.StudentServiceImplService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import javax.xml.ws.soap.SOAPFaultException;
import java.util.ArrayList;
import java.util.List;

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
public class WSClient {
    private static final Logger LOG = LoggerFactory.getLogger(WSClient.class);

    private static final String USER_NAME = "admin";
    private static final String PASS_WORD = "pass";

    public static void main(String[] args) {

        //方式二：通过wsimport生成客户端代码
        StudentServiceImplService impl = new StudentServiceImplService();
        impl.setHandlerResolver(new HandlerResolver() {
            @Override
            public List<Handler> getHandlerChain(PortInfo portInfo) {
                List<Handler> handlerList = new ArrayList<Handler>();
                handlerList.add(new ClientHandler(USER_NAME, PASS_WORD));
                return handlerList;
            }
        });
        try {
            StudentService layoutService = impl.getStudentServiceImplPort();
            Student result_1 = layoutService.getStudent();
            System.out.println("result_1  " + result_1.getName());
//            LOG.debug("[2]sayHello:" + result_1);
//            OperationResult result_2 = layoutService.addLayout("name", "content");
//            LOG.debug("[2]addLayout result_succeed:" + result_2.isSucceed());
//            LOG.debug("[2]addLayout result_msg:" + result_2.getMsg());
        } catch (SOAPFaultException e) {
            LOG.error("SOAPFaultException occurs:{}", e.getMessage());
        }
    }
}

