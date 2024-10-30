package org.zeorck.swaggertest.repository;


import org.zeorck.swaggertest.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
