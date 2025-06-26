package hs.kr.study.Board.service;

import hs.kr.study.Board.dto.BoardDto;

import java.util.List;

public interface BoardService {
    public void insert(BoardDto dto);
    public void update(BoardDto dto);
    public void delete(int id);
    public List<BoardDto> selectAll();
    public BoardDto selectOne(int id);

    // count ++
    public void count(int id);
}
