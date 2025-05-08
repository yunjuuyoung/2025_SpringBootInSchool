package kr.hs.study.MyBatisPrj.service;

import kr.hs.study.MyBatisPrj.dto.MemoDto;
import kr.hs.study.MyBatisPrj.mapper.MemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemoServiceImpl implements MemoService {
    @Autowired
    private MemoMapper mapper;

    @Override
    public void insert(MemoDto dto) {
        mapper.insert(dto);
    }

    @Override
    public void update(MemoDto dto) {

    }

    @Override
    public void delete(int idx) {

    }

    @Override
    public List<MemoDto> listAll() {
        return mapper.listAll();
    }
}
