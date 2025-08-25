package kr.hs.study.AccountJPA.service;

import kr.hs.study.AccountJPA.dto.MemberDto;

import java.util.List;

public interface MemberService {
    public void save(MemberDto dto);
    public MemberDto findById(Long id);
    public List<MemberDto> findAll();

    public MemberDto login(MemberDto dto);
}
