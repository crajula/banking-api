package com.wonderlabs.tms.service;


import com.wonderlabs.tms.dto.AddressTypeDTO;

import java.util.List;

public interface AddressTypeService {
    public void createAddressType(AddressTypeDTO addressTypeDTO);
    public AddressTypeDTO findAddressTypeById(String addressTypeId);
    public List<AddressTypeDTO> getAllAddressTypes();
    public void updateAddressType(String id, AddressTypeDTO addressTypeDTO);
    public void deleteAddressType(String id);
}
