package com.example.hhsone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hhsController {


    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
