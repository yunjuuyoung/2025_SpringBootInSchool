package kr.hs.school.GetParameter.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class TestController {
    @GetMapping("/test1")
    public String test1(WebRequest req) {
        String str1 = req.getParameter("data1");
        String str2 = req.getParameter("data2");
        System.out.println("data1 : " + str1);
        System.out.println("data2 : " + str2);
        return "result";
    }
}
