package com.app.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig { //java配置
    @Bean
    public FunctionService1 functionService1(){
        return new FunctionService1();
    }
    @Bean
    public UserFunctionService userFunctionService(){
        UserFunctionService userFunctionService = new UserFunctionService();
        userFunctionService.setFunctionService1(functionService1());
        return  userFunctionService;
    }
//    @Bean
//    public UserFunctionService userFunctionService(FunctionService1 functionService1){
//        UserFunctionService userFunctionService = new UserFunctionService();
//    }

}
