package kr.hs.study.AccountJPA.controller;

import kr.hs.study.AccountJPA.dto.MemberDto;
import kr.hs.study.AccountJPA.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {
    @Autowired
    private MemberService service;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String register(MemberDto dto) {
        service.save(dto);
        return "redirect:/";
    }
}
