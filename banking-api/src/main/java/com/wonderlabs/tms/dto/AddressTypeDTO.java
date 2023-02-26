package com.wonderlabs.tms.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@AllArgsConstructor
@Builder
@Data
public class AddressTypeDTO {
    private long id;
    private String type;
}