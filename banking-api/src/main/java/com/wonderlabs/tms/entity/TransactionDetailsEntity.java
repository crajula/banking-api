package com.wonderlabs.tms.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "transaction_details")
@AllArgsConstructor
@Builder
@Data
public class TransactionDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "txn_id")
    private long id;

    @Column(name = "txn_reference_number")
    private String txnReferenceNumber;

    @Column(name = "txn_amount")
    private String txnAmount;

    @Column(name = "txnType")
    private boolean txnType;

    @Column(name = "fromAccount")
    private String fromAccount;

    @Column(name = "toAccount")
    private String toAccount;

    @Column(name = "fromUser")
    private String fromUser;

    @Column(name = "toUser")
    private String toUser;

    @Column(name = "txn_status")
    private String status;

    @Column(name = "txn_status")
    private String reason;
}