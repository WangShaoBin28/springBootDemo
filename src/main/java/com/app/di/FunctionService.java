package com.app.di;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FunctionService {

    @Autowired
    private UserService userService;

    public String returnStr() {

        return userService.returnStr();
    }
}
