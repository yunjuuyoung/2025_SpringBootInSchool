package hs.kr.study.Board.controller;

import hs.kr.study.Board.dto.CommentDto;
import hs.kr.study.Board.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    CommentService service;

    @PostMapping("/add")
    public String add(CommentDto dto, Model model) {
        service.insert(dto);
        return "redirect:/board/" + dto.getBoardId();
    }
}
