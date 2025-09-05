package com.ashish.Account_Service.repository;

import com.ashish.Account_Service.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long>{
    List<Account> findByUserId(Long userId);
    Optional<Account> findByAccountNumber(String accountNumber);


}
