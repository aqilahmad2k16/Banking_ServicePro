package com.Bank.BankService.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Bank.BankService.model.entity.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {
    
}
