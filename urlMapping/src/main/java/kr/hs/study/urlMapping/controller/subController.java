package kr.hs.study.urlMapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller()
@RequestMapping("/sub1")
public class subController {
    @RequestMapping(value = "/test3", method = RequestMethod.GET)
    public String test3() {
        return "test3";
    }

    @RequestMapping(value = "/test4", method = RequestMethod.GET)
    public String test4() {
        return "test4";
    }

    @RequestMapping(value = "/test5", method = RequestMethod.GET)
    public String test5() {
        return "test5";
    }
}
