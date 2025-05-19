package kr.hs.study.MyBatisPrj.controller;

import kr.hs.study.MyBatisPrj.dto.MemoDto;
import kr.hs.study.MyBatisPrj.service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/memo")
public class MemoController {
    @Autowired
    private MemoService service;

    @GetMapping()
    public String memo() { ;
        return "redirect:/memo/list";
    }

    @PostMapping()
    public String insert(MemoDto dto) {
        service.insert(dto);
        return "redirect:/memo";
    }

    @GetMapping("/list")
    public String listAll(Model model) {
        List<MemoDto> memoList = service.listAll();
        model.addAttribute("memoList", memoList);
        return "memo";
    }

    @GetMapping("/{idx}")
    public String edit_from(@PathVariable("idx") int idx, Model model) {
        MemoDto dto = service.selectMemo(idx);
        model.addAttribute("memo", dto);
        return "edit_form";
    }

    @PostMapping("/edit")
    public String edit(MemoDto dto, Model model) {
        service.update(dto);
        return "redirect:/memo";
    }

    @GetMapping("/delete/{idx}")
    public String delete_form(@PathVariable("idx") int idx, Model model) {
        service.delete(idx);
        return "redirect:/memo";
    }
}
