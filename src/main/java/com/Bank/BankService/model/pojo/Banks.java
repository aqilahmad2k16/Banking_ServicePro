package com.Bank.BankService.model.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Banks {
    private String bankName;
    private Long numberOfBranch;
    private String facilityProvide;
    private String uniqueCode;
    private Boolean isGovt;
    private String headOffice;
}
