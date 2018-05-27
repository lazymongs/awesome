package com.lazymong.member;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long> {

	List<Member> findAll();
	
	Member save(Member member);
}
