package com.example;


import com.example.feign.IAuthorityService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Main implements InitializingBean {
    @Autowired
    private IAuthorityService authorityService;


    @Override
    public void afterPropertiesSet() throws Exception {
        Map result = authorityService.hasAuthority("Simon");
        System.out.println(result);
    }
}
