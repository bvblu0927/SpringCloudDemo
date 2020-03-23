package com.lu.springcloud.controller;

import com.lu.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController_Consumer {

    public static final String PREFIX_REMOTE_URL="http://localhost:8001";
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping(value = "/consumer/dept/get/{id}",method = RequestMethod.GET)
    public Dept findById(@PathVariable("id") Long id){
        return restTemplate.getForObject(PREFIX_REMOTE_URL+"/dept/get/"+id,Dept.class);
    }
    @RequestMapping(value = "/consumer/dept/list",method = RequestMethod.GET)
    public List<Dept> list(){
        return restTemplate.getForObject(PREFIX_REMOTE_URL+"/dept/list",List.class);
    }
    @RequestMapping(value = "/consumer/dept/add",method = RequestMethod.POST)
    public boolean add(@RequestParam Dept dept){
        return restTemplate.postForObject(PREFIX_REMOTE_URL+"/dept/add",dept,Boolean.class);
    }
}
