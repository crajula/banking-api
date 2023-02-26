package com.wonderlabs.tms.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class AccountDTO {

    private long id;
    private String accountNumber;
    private AccountTypeDTO accountType;
    private double balance;
    private UserDTO userEntity;
}