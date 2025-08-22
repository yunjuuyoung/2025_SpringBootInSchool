package kr.hs.study.AccountJPA.controller;

import kr.hs.study.AccountJPA.dto.MemberDto;
import kr.hs.study.AccountJPA.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/member")
public class MemberContorller {
    @Autowired
    private MemberService service;

    @GetMapping()
    public String member(Model model) {
        List<MemberDto> members = service.findAll();
        model.addAttribute("members", members);
        return "member_list";
    }
}
