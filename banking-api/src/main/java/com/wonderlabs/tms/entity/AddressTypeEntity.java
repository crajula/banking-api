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
public class AddressTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "addr_type_id")
    private long id;

    @Column(name = "addr_type_name")
    private String type;
}