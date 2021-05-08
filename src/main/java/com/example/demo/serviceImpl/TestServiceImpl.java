package com.example.demo.serviceImpl;

import com.example.demo.contract.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String testService(String param) {
        return "hello,"+param;
    }
}
