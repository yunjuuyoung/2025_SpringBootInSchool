package hs.kr.study.Board.service;


import hs.kr.study.Board.dto.CommentDto;

import java.util.List;

public interface CommentService {
    public void insert(CommentDto dto);
    public void update(CommentDto dto);
    public void delete(int id);
    public List<CommentDto> selectByBoardId(int boardId);
    public List<CommentDto> selectAll();
    public CommentDto selectOne(int id);
}
