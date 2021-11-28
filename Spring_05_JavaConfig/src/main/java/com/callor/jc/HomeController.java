package com.callor.jc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @ResponseBody
    @RequestMapping(value = "/",
            method = RequestMethod.GET,
            produces = "text/html;charset=UTF-8")
    public String home(){
        return "반갑습니다";
    }
}
