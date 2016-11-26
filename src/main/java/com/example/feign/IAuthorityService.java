package com.example.feign;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(serviceId = "权限服务")
public interface IAuthorityService {
    @RequestMapping(value = "hasAuthority", method = RequestMethod.GET)
    Map hasAuthority(@RequestParam("username") String username);
}
