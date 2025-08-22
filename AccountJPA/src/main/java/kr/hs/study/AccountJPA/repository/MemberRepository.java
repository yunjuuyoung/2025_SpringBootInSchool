package kr.hs.study.AccountJPA.repository;

import kr.hs.study.AccountJPA.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
}
