package com.wonderlabs.tms.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "transaction_reason")
@AllArgsConstructor
@Builder
@Data
public class TransactionReasonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "txn_reason_id")
    private long txnReasonId;

    @Column(name = "txn_reason_description")
    private String txnReasonDescription;
}