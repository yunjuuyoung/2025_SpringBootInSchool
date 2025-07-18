package hs.kr.study.Board.service;

import hs.kr.study.Board.dao.CommentDao;
import hs.kr.study.Board.dto.CommentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{
    @Autowired
    CommentDao dao;

    @Override
    public void insert(CommentDto dto) {
        dao.insert(dto);
    }

    @Override
    public void update(CommentDto dto) {
        dao.update(dto);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }

    @Override
    public List<CommentDto> selectByBoardId(int boardId) {
        return dao.selectByBoardId(boardId);
    }

    @Override
    public List<CommentDto> selectAll() {
        return dao.selectAll();
    }

    @Override
    public CommentDto selectOne(int id) {
        return dao.selectOne(id);
    }
}
