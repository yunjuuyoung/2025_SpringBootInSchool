package kr.hs.study.MyBatisPrj.controller;

import kr.hs.study.MyBatisPrj.dto.TodoDto;
import kr.hs.study.MyBatisPrj.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {
    @Autowired
    private TodoService service;

    @GetMapping()
    public String todo() {
        return "todo";
    }

    @PostMapping()
    public String addTodo(TodoDto dto) {
        service.insert(dto);
        System.out.println(dto.getContent());
        return "redirect:/todo";
    }
}