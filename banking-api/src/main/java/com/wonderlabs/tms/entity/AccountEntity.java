package com.wonderlabs.tms.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "account")
@AllArgsConstructor
@Builder
@Data
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "acc_number")
    private String accountNumber;

    @Column(name = "acc_type")
    private String accountType;

    @Column(name = "balance")
    private double balance;
}