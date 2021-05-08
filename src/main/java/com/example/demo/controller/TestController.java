package com.example.demo.controller;

import com.example.demo.contract.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试c层
 */
@Controller
@RequestMapping("/test")
@Slf4j
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/testCon")
    @ResponseBody
    public String testCon(@RequestParam(value = "param") String param){
        return testService.testService(param);
    }

}
