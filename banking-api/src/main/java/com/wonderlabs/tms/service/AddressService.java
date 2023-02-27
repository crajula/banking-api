package com.wonderlabs.tms.service;


import com.wonderlabs.tms.dto.AddressDTO;

import java.util.List;

public interface AddressService {
    public void createAddress(AddressDTO addressDTO);
    public AddressDTO findAddressById(String addressId);
    public List<AddressDTO> getAllAddress();
    public void updateAddress(String id, AddressDTO addressDTO);
    public void deleteAddress(String id);
}
