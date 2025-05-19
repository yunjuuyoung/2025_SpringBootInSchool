package kr.hs.study.MyBatisPrj.service;

import kr.hs.study.MyBatisPrj.dto.MemoDto;
import kr.hs.study.MyBatisPrj.dto.TodoDto;

import java.util.List;

public interface TodoService {
    public void insert(TodoDto dto);
    public void update(TodoDto dto);
    public void delete(int idx);
    public List<MemoDto> selectAll();
    public MemoDto selectOne(int idx);
}
