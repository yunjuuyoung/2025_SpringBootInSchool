package kr.hs.study.MyBatisPrj.controller;

import kr.hs.study.MyBatisPrj.dto.LoginDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginConrollter {
    @GetMapping()
    public String login() {
        return "login";
    }

    @PostMapping()
    public String login(LoginDto dto, Model model) {
        String result;

        if (dto.getId().equals("juyoung") && dto.getPassword().equals("0509")) {
            result = "로그인 성공!";
        } else {
            result = "로그인 실패..";
        }

        model.addAttribute("list", result);

        return "result";
    }
}
