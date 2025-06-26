package hs.kr.study.Board.service;

import hs.kr.study.Board.dao.BoardDao;
import hs.kr.study.Board.dto.BoardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {
    @Autowired
    BoardDao dao;

    @Override
    public void insert(BoardDto dto) {
        dao.insert(dto);
    }

    @Override
    public void update(BoardDto dto) {
        dao.update(dto);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }

    @Override
    public List<BoardDto> selectAll() {
        return dao.selectAll();
    }

    @Override
    public BoardDto selectOne(int id) {
        return dao.selectOne(id);
    }

    @Override
    public void count(int id) {
        dao.count(id);
    }
}
