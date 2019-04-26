package com.ws.base.transfer.car.manage.sys.config;

import com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.CUXCARMANAGESYSPKGPortType;
import com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.CUXCARMANAGESYSPKGService;
import com.ws.base.transfer.car.manage.sys.CarClientHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.util.ArrayList;
import java.util.List;


@Configuration
public class CarManageSysConfig {

    private static final String USER_NAME = "soa_p";
    private static final String PASS_WORD = "000000";
    private static final String namespaceURI = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/";
    private static final String localPart = "CUX_CAR_MANAGE_SYS_PKG_Port";

    @Bean
    public CUXCARMANAGESYSPKGPortType webCarManageSysService() {

//        QName name = new QName("http://service.demo.example.com/", "StudentServiceImplPort");
        CUXCARMANAGESYSPKGService impl = new CUXCARMANAGESYSPKGService();
        impl.setHandlerResolver(new HandlerResolver() {
            @Override
            public List<Handler> getHandlerChain(PortInfo portInfo) {
                List<Handler> handlerList = new ArrayList<Handler>();
                handlerList.add(new CarClientHandler(namespaceURI, localPart, USER_NAME, PASS_WORD));
                return handlerList;
            }
        });
        return impl.getCUXCARMANAGESYSPKGPort();
    }
}
