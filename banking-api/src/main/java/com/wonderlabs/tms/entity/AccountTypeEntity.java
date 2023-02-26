package com.wonderlabs.tms.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "account_type")
@AllArgsConstructor
@Builder
@Data
public class AccountTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @OneToOne(mappedBy = "accountType")
    private long id;

    @Column(name = "acc_type_name")
    private String name;
}