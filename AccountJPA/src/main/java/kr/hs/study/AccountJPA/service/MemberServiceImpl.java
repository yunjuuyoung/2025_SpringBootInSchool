package kr.hs.study.AccountJPA.service;

import kr.hs.study.AccountJPA.dto.MemberDto;
import kr.hs.study.AccountJPA.entity.MemberEntity;
import kr.hs.study.AccountJPA.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{
    @Autowired
    private MemberRepository repo;

    @Override
    public void save(MemberDto dto) {
        repo.save(MemberDto.toEntity(dto));
    }

    @Override
    public MemberDto findById(Long id) {
        return MemberEntity.toDto(repo.getReferenceById(id));
    }

    @Override
    public List<MemberDto> findAll() {
        List<MemberEntity> entityList = repo.findAll();
        List<MemberDto> dtoList = new ArrayList<>();
        for(MemberEntity member : entityList) {
            dtoList.add(MemberEntity.toDto(member));
        }
        return dtoList;

    }

}
