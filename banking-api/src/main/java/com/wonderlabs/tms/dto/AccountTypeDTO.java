package com.wonderlabs.tms.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@AllArgsConstructor
@Builder
@Data
public class AccountTypeDTO {
    private long id;
    private String name;
}