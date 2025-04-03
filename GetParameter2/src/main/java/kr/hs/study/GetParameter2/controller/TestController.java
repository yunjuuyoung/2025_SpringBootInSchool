package kr.hs.study.GetParameter2.controller;

import kr.hs.study.GetParameter2.dto.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
    @GetMapping("/login")
    public String login() {
        return "login";
    }

//    @PostMapping("/test1")
//    public String login(@RequestParam("userID") String userId,
//                        @RequestParam("userPW") String userPw) {
//        System.out.println("ID : " + userId);
//        System.out.println("PW : " + userPw);
//
//        return "result";
//    }

    @PostMapping("/login")
    public String login(@ModelAttribute LoginDTO dto) {
        System.out.println("ID : " + dto.getUserId());
        System.out.println("PW : " + dto.getUserPw());

        return "result";
    }
}
