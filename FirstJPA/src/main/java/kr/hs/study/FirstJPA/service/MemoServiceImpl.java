package kr.hs.study.FirstJPA.service;

import kr.hs.study.FirstJPA.entity.MemoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemoServiceImpl implements MemoService{
    @Autowired

    @Override
    public void save(MemoEntity memo) {

    }
}
