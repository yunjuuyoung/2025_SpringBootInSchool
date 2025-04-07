package kr.hs.study.LoginTest.controller;

import kr.hs.study.LoginTest.dto.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
    @GetMapping()
    public String login() {
        return "login";
    }

    @PostMapping()
    public String login(LoginDTO dto, Model model) {
        String result;

        if (dto.getEmail().equals("lay") && dto.getEmail().equals("1111")) {
            result = "로그인되었습니다.";
            System.out.println("login!!");
        } else {
            result = "아이디나 비밀번호가 올바르지 않습니다.";
        }

        model.addAttribute("re", dto);  // key value 형식

        return "result";
    }
}
