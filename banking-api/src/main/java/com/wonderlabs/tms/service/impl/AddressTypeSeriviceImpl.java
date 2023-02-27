package com.wonderlabs.tms.service.impl;


import com.wonderlabs.tms.dto.AddressTypeDTO;
import com.wonderlabs.tms.entity.AddressTypeEntity;
import com.wonderlabs.tms.repository.AddressTypeRepository;
import com.wonderlabs.tms.service.AddressTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressTypeSeriviceImpl implements AddressTypeService {

   /* @Autowired
    private MapStructMapper mapstructMapper;*/

    private AddressTypeRepository addressTypeRepository;

    @Autowired
    public AddressTypeSeriviceImpl(AddressTypeRepository addressTypeRepository ){
       // this.mapstructMapper = mapstructMapper;
        this.addressTypeRepository = addressTypeRepository;
    }

    @Override
    public void createAddressType(AddressTypeDTO AddressTypeDTO) {
       // AddressTypeEntity AddressTypeEntity = AddressTypeEntityToAddressTypeDto(AddressTypeDTO);
       // AddressTypeRepository.save(AddressTypeEntity);
    }

    @Override
    public AddressTypeDTO findAddressTypeById(String AddressTypeId) {
        return null;
    }

    @Override
    public List<AddressTypeDTO> getAllAddressTypes() {
        return null;
    }

    @Override
    public void updateAddressType(String id, AddressTypeDTO AddressTypeDTO) {
           Optional<AddressTypeEntity> addressTypeEntity =  addressTypeRepository.findById(Long.valueOf(id));
           AddressTypeEntity addressTypeEntity1 = addressTypeEntity.get();
          // AddressTypeEntity1.setAddressTypeId(AddressTypeDTO.getAddressTypeId());// Add all other properties
           addressTypeRepository.save(addressTypeEntity1);
    }


    @Override
    public void deleteAddressType(String id) {
        addressTypeRepository.deleteById(Long.valueOf(id));
    }
}
