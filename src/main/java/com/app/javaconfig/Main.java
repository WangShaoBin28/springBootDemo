package com.app.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UserFunctionService bean = context.getBean(UserFunctionService.class);
        System.out.println(bean.returnStr());
    }
}
