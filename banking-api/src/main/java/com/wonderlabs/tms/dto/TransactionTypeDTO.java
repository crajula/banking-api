package com.wonderlabs.tms.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class TransactionTypeDTO {
    private long transactionTypeId;
    private String transactionTypeName;
}