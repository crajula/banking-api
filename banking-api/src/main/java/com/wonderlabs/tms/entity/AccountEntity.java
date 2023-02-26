package com.wonderlabs.tms.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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
    @OneToOne
    @JoinColumn(name = "acc_type_id", referencedColumnName = "id")
    private AccountTypeEntity accountType;

    @Column(name = "balance")
    private double balance;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private UserEntity userEntity;
}