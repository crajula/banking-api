package com.wonderlabs.tms.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
@AllArgsConstructor
@Builder
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long userId;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "mobileNumber")
    private String mobileNumber;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy="userEntity")
    private List<AddressEntity> addressEntity;

    @OneToMany(mappedBy="userEntity")
    private List<AccountEntity> accountEntity;

}