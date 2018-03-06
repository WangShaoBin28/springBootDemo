package com.app.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);

        FunctionService bean = context.getBean(FunctionService.class);

        System.out.println(bean.returnStr());
        context.close();
    }
}
