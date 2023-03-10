package com.wonderlabs.tms.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
@AllArgsConstructor
@Builder
@Data
public class TransactionTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "txn_type_id")
    private long transactionTypeId;

    @Column(name = "txn_type_description")
    private String transactionTypeName;
}