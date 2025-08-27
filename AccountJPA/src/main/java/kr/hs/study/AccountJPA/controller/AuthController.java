package kr.hs.study.AccountJPA.controller;

import jakarta.servlet.http.HttpSession;
import kr.hs.study.AccountJPA.dto.MemberDto;
import kr.hs.study.AccountJPA.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {
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

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }

    @PostMapping("/login")
    public String login(MemberDto dto, HttpSession session) {
        MemberDto member = service.login(dto);
        if (member != null) {
            session.setAttribute("loginEmail", member.getEmail());
            return "main";
        } else {
            return "login";
        }
    }
}
