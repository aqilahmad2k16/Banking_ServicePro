package com.Bank.BankService.model.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="bank_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bank {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long bankId;

    @Column(name="bankname")
    private String bankName;
    @Column(name="numberOfBranch")
    private Long numberOfBranch;
    @Column(name="facilityProvide")
    private String facilityProvide;
    @Column(name="uniquecode")
    private String uniqueCode;
    @Column(name="isGovt")
    private Boolean isGovt;
    @Column(name="headoffice")
    private String headOffice;
}


