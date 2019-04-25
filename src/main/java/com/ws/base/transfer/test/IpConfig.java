package com.ws.base.transfer.test;

import com.example.demo.request.IpAddressSearchWebService;
import com.example.demo.request.IpAddressSearchWebServiceSoap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 1.使用jdk自带的webservice工具wsimport生成相关类
 * 测试wsdl
 * http://www.webxml.com.cn/WebServices/IpAddressSearchWebService.asmx?wsdl
 * wsimport -s d:\wsdl -p com.example.demo.request -encoding utf-8 http://www.webxml.com.cn/WebServices/IpAddressSearchWebService.asmx?wsdl
 * 2.构建相关的配置类及测试方法
 */
@Configuration
public class IpConfig {
    @Bean
    public IpAddressSearchWebServiceSoap webService(){
        return new IpAddressSearchWebService().getIpAddressSearchWebServiceSoap();
    }
}
