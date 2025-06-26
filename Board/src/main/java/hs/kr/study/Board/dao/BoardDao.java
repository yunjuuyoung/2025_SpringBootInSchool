package hs.kr.study.Board.dao;

import hs.kr.study.Board.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardDao {
    public void insert(BoardDto dto);
    public void update(BoardDto dto);
    public void delete(int id);
    public List<BoardDto> selectAll();
    public BoardDto selectOne(int id);
    public void count(int id);
}
