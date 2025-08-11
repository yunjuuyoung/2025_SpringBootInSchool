package kr.hs.study.FirstJPA.controller;

import kr.hs.study.FirstJPA.dto.MemoDto;
import kr.hs.study.FirstJPA.service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/memo")
public class MemoController {
    @Autowired
    private MemoService service;

    @GetMapping()
    public String input() {
        return "input_form";
    }

    @PostMapping()
    public String memo(MemoDto dto) {
        service.save(MemoDto.toEntity(dto));
        return "index";
    }
}
