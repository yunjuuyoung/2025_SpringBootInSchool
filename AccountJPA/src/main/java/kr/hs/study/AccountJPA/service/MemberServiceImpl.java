package kr.hs.study.AccountJPA.service;

import kr.hs.study.AccountJPA.dto.MemberDto;
import kr.hs.study.AccountJPA.entity.MemberEntity;
import kr.hs.study.AccountJPA.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Override
    public MemberDto login(MemberDto dto) {
        Optional<MemberEntity> memberEntity = repo.findByEmail(dto.getEmail());
        if (memberEntity.isPresent()) {
            MemberEntity memberEmail = memberEntity.get();
            if(memberEmail.getPassword().equals(dto.getPassword())) {
                MemberDto memberDto = MemberEntity.toDto(memberEmail);
                return memberDto;
            } else {
                return null;
            }
        }
        return null;
    }

    @Override
    public MemberDto findByEmail(String email) {
        Optional<MemberEntity> memberEntity = repo.findByEmail(email);
        if (memberEntity.isPresent()) {
            MemberEntity member = memberEntity.get();
                return MemberEntity.toDto(member);
            } else {
                return null;
            }
        }

    }
