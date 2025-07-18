package hs.kr.study.Board.dao;

import hs.kr.study.Board.dto.CommentDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentDao {
    public void insert(CommentDto dto);
    public void update(CommentDto dto);
    public void delete(int id);
    public List<CommentDto> selectAll();
    public List<CommentDto> selectByBoardId(int boardId);
    public CommentDto selectOne(int id);
}
