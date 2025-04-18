package kr.hs.study.MyBatisPrj.mapper;

import kr.hs.study.MyBatisPrj.dto.MemoDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface MemoMapper {
    // crud
    public void insert(MemoDto dto);
    public void update(int idx);
    public void delete(int idx);
    public List<MemoDto> listAll();
}
