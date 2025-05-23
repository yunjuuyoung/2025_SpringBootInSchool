package kr.hs.study.MyBatisPrj.controller;

import kr.hs.study.MyBatisPrj.dto.TodoDto;
import kr.hs.study.MyBatisPrj.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {
    @Autowired
    private TodoService service;

    @GetMapping()
    public String todo(Model model) {
        List<TodoDto> todos = service.selectAll();
        model.addAttribute("todoList", todos);
        return "todo";
    }

    @PostMapping()
    public String addTodo(TodoDto dto) {
        service.insert(dto);
        return "redirect:/todo";
    }

    @GetMapping("/{idx}")
    public String edit_todo(@PathVariable("idx") int idx, Model model) {
        TodoDto todo = service.selectOne(idx);
        model.addAttribute("todo", todo);
        return "edit_todo";
    }

    @PostMapping("/edit")
    public String edit_todo(TodoDto dto, Model model) {
        TodoDto todo = service.selectOne(dto.getIdx());
        if (dto.getPassword().equals(todo.getPassword())) {
            service.update(dto);
            return "redirect:/todo";
        }
        return "redirect:/todo/" + dto.getIdx();  // 비밀번호가 틀렸을 시, edit page로 이동
    }

    @GetMapping("/{idx}/done")
    public String complete(@PathVariable("idx") int idx) {
        service.conplete(idx);
        return "redirect:/todo";
    }

    @GetMapping("/{idx}/delete")
    public String delete(@PathVariable("idx") int idx) {
        service.delete(idx);
        return "redirect:/todo";
    }
}