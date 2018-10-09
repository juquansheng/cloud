package com.malaxiaoyugan.sericefeign.service;

import com.malaxiaoyugan.sericefeign.service.hystric.SchedualServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient(value = "service-message",fallback = SchedualServiceHystric.class)
public interface SchedualService {

    @RequestMapping(value = "/mailmessage/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
