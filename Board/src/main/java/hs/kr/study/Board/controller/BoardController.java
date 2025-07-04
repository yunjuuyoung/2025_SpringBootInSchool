package hs.kr.study.Board.controller;

import hs.kr.study.Board.dto.BoardDto;
import hs.kr.study.Board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired
    BoardService service;

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable("id") int id, Model model) {
        BoardDto dto = service.selectOne(id);
        model.addAttribute("posts", dto);
        return "posts_edit";
    }

    @PostMapping("/edit")
    public String edit(BoardDto dto, Model model) {
        BoardDto existingData = service.selectOne(dto.getId());

        if (existingData.getBoardPass().equals(dto.getBoardPass())) {
            service.update(dto);
            return "redirect:/board/" + dto.getId();
        }

        model.addAttribute("message", "게시글 수정에 실피하였습니다.");
        return "redirect:/board/" + dto.getId() + "/edit";
    }

    @GetMapping("/save")
    public String save() {
        return "board_save";
    }

    @PostMapping("/save")
    public String saveBoard(BoardDto dto) {
        service.insert(dto);
        System.out.println(dto.getBoardContents());
        return "index";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable("id") int id, Model model) {
        service.count(id);
        BoardDto dto = service.selectOne(id);
        model.addAttribute("posts", dto);
        return "posts_delete";
    }

    @PostMapping("/delete")
    public String delete(BoardDto dto){
        BoardDto existingPosts = service.selectOne(dto.getId());

        if(dto.getBoardPass().equals(existingPosts.getBoardPass())) {
            service.delete(dto.getId());
            return "redirect:/board";
        }

        return "redirect:/board/" + dto.getId() + "/delete";
    }

    @GetMapping("/{id}")
    public String board(@PathVariable("id") int id, Model model) {
        service.count(id);
        BoardDto dto = service.selectOne(id);
        model.addAttribute("posts", dto);
        return "posts";
    }

    @GetMapping()
    public String board(Model model) {
        List<BoardDto> board = service.selectAll();
        model.addAttribute("board", board);
        return "board";
    }
}
