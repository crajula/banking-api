package com.wonderlabs.tms.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "transaction_status")
@AllArgsConstructor
@Builder
@Data
public class TransactionStatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "txn_status_id")
    private long txnStatusId;

    @Column(name = "txn_status_description")
    private String txnStatusDescription;
}