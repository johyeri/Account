package com.example.account.repository;

import com.example.account.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //테이블에 접속하기 위한 인터페이스
public interface AccountRepository extends JpaRepository<Account, Long> { //extends => 확장
}
