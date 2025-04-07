package kr.hs.study.LoginTest.controller;

import kr.hs.study.LoginTest.dto.LoginDTO;
import org.springframework.stereotype.Controller;
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
    public String login(LoginDTO dto) {

        System.out.println(dto.getEmail() + " " + dto.getPassword());

        if (dto.getEmail().equals("lay") && (dto.getPassword()).equals("1111")) {
            System.out.println("login!!");
        } else {
            System.out.println("not login");
            return "login";
        }

        return "result";
    }
}
