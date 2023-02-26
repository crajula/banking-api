package com.wonderlabs.tms.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;


@AllArgsConstructor
@Builder
@Data
public class UserDTO {

    @JsonProperty("userId")
    private long userId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("surname")
    private String surname;

    @JsonProperty("surname")
    private String mobileNumber;

    @JsonProperty("surname")
    private String email;

    @JsonProperty("address")
    private List<AddressDTO> addressEntity;

    @JsonProperty("accounts")
    private List<AccountDTO> accountEntity;

}