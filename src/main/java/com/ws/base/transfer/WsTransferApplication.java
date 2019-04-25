package com.ws.base.transfer;


import com.example.demo.request.ArrayOfString;
import com.example.demo.request.IpAddressSearchWebServiceSoap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/soap")
public class WsTransferApplication {
    @Autowired
    private IpAddressSearchWebServiceSoap soap;


    public static void main(String[] args) {
        SpringApplication.run(WsTransferApplication.class, args);
    }


    /**
     * http://localhost:8088/soap/16.230.168.186
     * {"string":["16.230.168.186","美国 Digital"]}
     * <p>
     * http://localhost:8088/soap/120.192.59.188
     * {"string":["120.192.59.188","山东省 移动"]}
     *
     * @param ip
     * @return
     */
    @RequestMapping("/{ip}")
    public ArrayOfString searchIp(@PathVariable("ip") String ip) {
        ArrayOfString response = soap.getCountryCityByIp(ip);
        return response;
    }

}
