package com.example.mvc.demo;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * MVCController
 */
@Controller
public class MVCController {

    @RequestMapping(produces=MediaType.TEXT_PLAIN_VALUE,value="/home")
    @ResponseBody
    public String home(){
        return "Wellcome home page";
    }
    
}