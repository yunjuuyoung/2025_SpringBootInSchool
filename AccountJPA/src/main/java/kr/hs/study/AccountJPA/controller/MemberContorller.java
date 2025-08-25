package kr.hs.study.AccountJPA.controller;

import jakarta.servlet.http.HttpSession;
import kr.hs.study.AccountJPA.dto.MemberDto;
import kr.hs.study.AccountJPA.service.MemberService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/member")
public class MemberContorller {
    @Autowired
    private MemberService service;

    @PostMapping("/update")
    public String update(MemberDto dto) {

        return "redirect:/member/update";
    }

    @GetMapping("/update")
    public String update(HttpSession session, Model model) {
        String email = (String)session.getAttribute("loginEmail");
        MemberDto member = service.findByEmail(email);
        model.addAttribute("member", member);
        return "member_update";
    }

    @GetMapping()
    public String member(Model model) {
        List<MemberDto> members = service.findAll();
        model.addAttribute("members", members);
        return "member_list";
    }
}
