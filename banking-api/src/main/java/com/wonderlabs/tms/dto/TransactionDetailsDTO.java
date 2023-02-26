package com.wonderlabs.tms.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class TransactionDetailsDTO {
    private long id;
    private String txnReferenceNumber;
    private String txnAmount;
    private boolean txnType;
    private String fromAccount;
    private String toAccount;
    private String fromUser;
    private String toUser;
    private String status;
    private String reason;
}