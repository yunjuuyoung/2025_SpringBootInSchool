package kr.hs.study.MyBatisPrj.service;

import kr.hs.study.MyBatisPrj.dto.MemoDto;
import kr.hs.study.MyBatisPrj.dto.TodoDto;

import java.util.List;

public interface TodoService {
    public void insert(TodoDto dto);
    public void update(TodoDto dto);
    public void delete(int idx);
    public List<TodoDto> selectAll();
    public TodoDto selectOne(int idx);
    public void conplete(int idx);
}
