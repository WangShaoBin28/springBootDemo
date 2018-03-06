package com.app.javaconfig;

public class UserFunctionService {
    FunctionService1 functionService1;

    public void setFunctionService1(FunctionService1 functionService1) {
        this.functionService1 = functionService1;
    }

    public String returnStr(){
        return  functionService1.returnStr();
    }


}
