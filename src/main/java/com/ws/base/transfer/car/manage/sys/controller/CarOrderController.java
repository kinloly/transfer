package com.ws.base.transfer.car.manage.sys.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.request.ArrayOfString;
import com.example.demo.request.IpAddressSearchWebServiceSoap;
import com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.CUXCARMANAGESYSPKGPortType;
import com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.CUXCARMANAGESYSPKGService;
import com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.SOAHeader;
import com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.get_car_order_list.APPSCUXCARMANAGESX1699609X1X4;
import com.ws.base.transfer.car.manage.sys.CarClientHandler;
import com.ws.base.transfer.car.manage.sys.base.PageResult;
import com.ws.base.transfer.car.manage.sys.entity.CarHead;
import com.ws.base.transfer.car.manage.sys.util.ComUtil;
import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import javax.xml.ws.soap.SOAPFaultException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/car_order")
public class CarOrderController {

    @Autowired
    private CUXCARMANAGESYSPKGPortType soap;


    private SOAHeader getSOAHeader() {
        SOAHeader soaHeader = new SOAHeader();

        String Responsibility = "CUX_SOA_ACCESS_RESP";
        String RespApplication = "CUX";
        String SecurityGroup = "STANDARD";
        String NLSLanguage = "AMERICAN";
        String Org_Id = "110";
        soaHeader.setNLSLanguage(NLSLanguage);
        soaHeader.setOrgId(Org_Id);
        soaHeader.setRespApplication(RespApplication);
        soaHeader.setSecurityGroup(SecurityGroup);
        soaHeader.setResponsibility(Responsibility);

        return soaHeader;
    }



    /**
     * 192.168.118.216:8088/car_order/list
     * <p>
     * {
     * "PN_SERIAL_NO":null,
     * "PV_BILL_NO":"",
     * "PV_LOAD_STATUS":"0",
     * "PN_PAGE_NUM":"1",
     * "PN_PAGE_ROWS":"20"
     * <p>
     * }
     *
     * @return
     */
    @RequestMapping("/list")
    public PageResult<CarHead> list(@RequestBody JSONObject requestJson) {

        BigDecimal PN_SERIAL_NO = requestJson.getBigDecimal("PN_SERIAL_NO");
        String PV_BILL_NO = requestJson.getString("PV_BILL_NO");
        String PV_LOAD_STATUS = requestJson.getString("PV_LOAD_STATUS");
        Integer PN_PAGE_NUM = requestJson.getInteger("PN_PAGE_NUM");
        Integer PN_PAGE_ROWS = requestJson.getInteger("PN_PAGE_ROWS");

        System.out.println(PN_SERIAL_NO);
        System.out.println(PV_BILL_NO);
        System.out.println(PV_LOAD_STATUS);
        System.out.println(PN_PAGE_NUM);
        System.out.println(PN_PAGE_ROWS);

        com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.get_car_order_list.ObjectFactory objFac = new com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.get_car_order_list.ObjectFactory();
        com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.get_car_order_list.InputParameters inputParameters = new com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.get_car_order_list.InputParameters();

        inputParameters.setPVLOADSTATUS(objFac.createInputParametersPVLOADSTATUS(PV_LOAD_STATUS));
        inputParameters.setPVBILLNO(objFac.createInputParametersPVBILLNO(PV_BILL_NO));
        if (ComUtil.isEmpty(PN_SERIAL_NO)) {
            inputParameters.setPNSERIALNO(null);
        } else {
            inputParameters.setPNSERIALNO(objFac.createInputParametersPNSERIALNO(PN_SERIAL_NO));
        }

        inputParameters.setPNPAGENUM(objFac.createInputParametersPNPAGENUM(PN_PAGE_NUM));
        inputParameters.setPNPAGEROWS(objFac.createInputParametersPNPAGEROWS(PN_PAGE_ROWS));


//        String localPart = "CUX_CAR_MANAGE_SYS_PKG_Port";
////        QName name = new QName("http://service.demo.example.com/", "StudentServiceImplPort");
//        //方式二：通过wsimport生成客户端代码
//        CUXCARMANAGESYSPKGService impl = new CUXCARMANAGESYSPKGService();
//        impl.setHandlerResolver(new HandlerResolver() {
//            @Override
//            public List<Handler> getHandlerChain(PortInfo portInfo) {
//                List<Handler> handlerList = new ArrayList<Handler>();
//                handlerList.add(new CarClientHandler(namespaceURI, localPart, USER_NAME, PASS_WORD));
//                return handlerList;
//            }
//        });
        try {


            com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.get_car_order_list.OutputParameters result_1 = soap.getCARORDERLIST(getSOAHeader(), inputParameters);

            System.out.println("result_1  " + result_1.toString());
            System.out.println("pnpagecount " + result_1.getPNPAGECOUNT().getValue());
            System.out.println("xrheaddata " + result_1.getXRHEADDATA().getValue().getXRHEADDATAITEM().size());
            System.out.println("xverrorcode " + result_1.getXVERRORCODE().getValue());
            System.out.println("xverrorcode " + result_1.getXVERRORMESSAGE().getValue());


            List<APPSCUXCARMANAGESX1699609X1X4> list = result_1.getXRHEADDATA().getValue().getXRHEADDATAITEM();

            List<CarHead> carHeads = new ArrayList<>();
            for (APPSCUXCARMANAGESX1699609X1X4 item : list) {
                CarHead carHead = new CarHead();

                String ORG_ID = item.getORGID().getValue() + "";
                String ORG_NAME = item.getORGNAME().getValue() + "";
                String BILL_TYPE = item.getBILLTYPE().getValue();
                String BILL_NO = item.getBILLNO().getValue();
                String ITEM_CODE = item.getITEMCODE().getValue();
                String ITEM_NAME = item.getITEMNAME().getValue();
                String DEL_FLAG = item.getDELFLAG().getValue();
                String ERROR_MSG = item.getERRORMSG().getValue();
                String BILL_LINE_ID = item.getBILLLINEID().getValue() + "";
                String UNLOAD_PLACE = item.getUNLOADPLACE().getValue();
                String LOAD_STATUS = item.getLOADSTATUS().getValue();

                carHead.setORG_ID(ORG_ID);
                carHead.setORG_NAME(ORG_NAME);
                carHead.setBILL_TYPE(BILL_TYPE);
                carHead.setBILL_NO(BILL_NO);
                carHead.setITEM_CODE(ITEM_CODE);
                carHead.setITEM_NAME(ITEM_NAME);
                carHead.setDEL_FLAG(DEL_FLAG);
                carHead.setERROR_MSG(ERROR_MSG);
                carHead.setBILL_LINE_ID(BILL_LINE_ID);
                carHead.setUNLOAD_PLACE(UNLOAD_PLACE);
                carHead.setLOAD_STATUS(LOAD_STATUS);


                String CREATED_USER;
                String LAST_UPDATE_USER;
                String SERIAL_NO;
                String CREATION_DATE;
                String CREATED_BY;
                String LAST_UPDATE_BY;
                String LAST_UPDATE_DATE;
                String LAST_UPDATE_LOGIN;
                String STATUS;
                String DELIVERY_PLACE;

                carHeads.add(carHead);
            }

            PageResult<CarHead> pageResult = new PageResult();
            pageResult.setList(carHeads);
            pageResult.setPageSize(PN_PAGE_ROWS);
            pageResult.setPageIndex(PN_PAGE_NUM);

            return pageResult;

        } catch (SOAPFaultException e) {
        }
        return null;
    }

}
