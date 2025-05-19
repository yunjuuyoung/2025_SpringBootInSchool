package kr.hs.study.MyBatisPrj.mapper;

import kr.hs.study.MyBatisPrj.dto.MemoDto;
import kr.hs.study.MyBatisPrj.dto.TodoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodoMapper {
    public void insert(TodoDto dto);
    public void update(MemoDto dto);
    public void delete(int idx);
    public List<MemoDto> selectAll();
    public TodoDto selectOne();
}
