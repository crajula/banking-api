package com.wonderlabs.tms.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class AddressDTO {

    private long id;
    private String houseNo;
    private String building_name;
    private String address_line1;
    private String address_line2;
    private String city;
    private String state;
    private String country;
    private String pin;
    private UserDTO userEntity;
}