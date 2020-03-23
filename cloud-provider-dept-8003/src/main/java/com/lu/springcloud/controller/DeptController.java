package com.lu.springcloud.controller;

import com.lu.springcloud.entities.Dept;
import com.lu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;
    @RequestMapping(value = "/dept/add",method =RequestMethod.POST)
    public boolean add(@RequestParam Dept dept){
        return deptService.add(dept);
    }
    @RequestMapping(value = "/dept/get/{Did}",method = RequestMethod.GET)
    public Dept findById(@PathVariable("Did") Long id){
        return deptService.get(id);
    }
    @RequestMapping(value = "/dept/list",method =RequestMethod.GET)
    public List<Dept> list(){
        return deptService.list();
    }
}
