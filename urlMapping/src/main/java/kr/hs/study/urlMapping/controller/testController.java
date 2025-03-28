package kr.hs.study.urlMapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class testController {
    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public String test1() {
        return "test1";
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public String test2() {
        return "test2";
    }

    @PostMapping("/test6")
    public String test6() {
        return "test6";
    }
}
