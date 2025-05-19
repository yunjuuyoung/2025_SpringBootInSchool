package kr.hs.study.MyBatisPrj.service;

import kr.hs.study.MyBatisPrj.dto.MemoDto;
import kr.hs.study.MyBatisPrj.dto.TodoDto;
import kr.hs.study.MyBatisPrj.mapper.TodoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService{
    @Autowired
    private TodoMapper mapper;

    @Override
    public void insert(TodoDto dto) {
        mapper.insert(dto);
    }

    @Override
    public void update(TodoDto dto) {

    }

    @Override
    public void delete(int idx) {

    }

    @Override
    public List<MemoDto> selectAll() {
        return List.of();
    }

    @Override
    public MemoDto selectOne(int idx) {
        return null;
    }
}
