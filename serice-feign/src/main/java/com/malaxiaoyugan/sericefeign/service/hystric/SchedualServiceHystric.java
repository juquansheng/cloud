package com.malaxiaoyugan.sericefeign.service.hystric;

import com.malaxiaoyugan.sericefeign.service.SchedualService;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHystric implements SchedualService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
