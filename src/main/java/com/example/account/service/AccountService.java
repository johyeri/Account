package com.example.account.service;

import com.example.account.domain.Account;
import com.example.account.domain.AccountStatus;
import com.example.account.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor //꼭 필요한 argument가 들어간 생성자만을 불러올 때 사용함
public class AccountService {
    private final AccountRepository accountRepository;

    @Transactional //모든 작업이 성공해야만 최종적으로 데이터베이스에 반영하도록 하는 어노테이션
    public void createAccount() {
        Account account = Account.builder()
                .accountNumber("40000")
                .accountStatus(AccountStatus.IN_USE)
                .build();
        accountRepository.save(account);
    }

    @Transactional
    public Account getAccount(Long id) {
        return accountRepository.findById(id).get();
    }
}
