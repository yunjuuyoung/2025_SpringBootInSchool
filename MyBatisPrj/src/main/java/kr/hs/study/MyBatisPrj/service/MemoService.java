package kr.hs.study.MyBatisPrj.service;

import kr.hs.study.MyBatisPrj.dto.MemoDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MemoService {
    // crud
    public void insert(MemoDto dto);
    public void update(MemoDto dto);
    public void delete(int idx);
    public List<MemoDto> listAll();
}
