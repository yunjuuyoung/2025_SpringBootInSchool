package kr.hs.study.Redirect_forward.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/forward")
    public String forward() {
        return "forward:/sub1";  // sub1의 주소로 이동
    }

    @GetMapping("/redirect")
    public String redirect() {
        return "redirect:/sub1";
    }

    @GetMapping("/sub1")
    public String sub1() {
        return "sub1";  // sub1: HTML 파일
    }
}
