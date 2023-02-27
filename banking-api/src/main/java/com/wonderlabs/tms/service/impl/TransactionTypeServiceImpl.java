package com.wonderlabs.tms.service.impl;


import com.wonderlabs.tms.dto.TransactionTypeDTO;
import com.wonderlabs.tms.entity.TransactionTypeEntity;
import com.wonderlabs.tms.repository.TransactionTypeRepository;
import com.wonderlabs.tms.service.TransactionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionTypeServiceImpl implements TransactionTypeService {

   /* @Autowired
    private MapStructMapper mapstructMapper;*/

    private TransactionTypeRepository TransactionTypeRepository;

    @Autowired
    public TransactionTypeServiceImpl(TransactionTypeRepository TransactionTypeRepository ){
       // this.mapstructMapper = mapstructMapper;
        this.TransactionTypeRepository = TransactionTypeRepository;
    }

    @Override
    public void createTransactionType(TransactionTypeDTO TransactionTypeDTO) {
       // TransactionTypeEntity TransactionTypeEntity = TransactionTypeEntityToTransactionTypeDto(TransactionTypeDTO);
       // TransactionTypeRepository.save(TransactionTypeEntity);
    }

    @Override
    public TransactionTypeDTO findTransactionTypeById(String TransactionTypeId) {
        return null;
    }

    @Override
    public List<TransactionTypeDTO> getAllTransactionTypes() {
        return null;
    }

    @Override
    public void updateTransactionType(String id, TransactionTypeDTO TransactionTypeDTO) {
           Optional<TransactionTypeEntity> TransactionTypeEntity =  TransactionTypeRepository.findById(Long.valueOf(id));
           TransactionTypeEntity TransactionTypeEntity1 = TransactionTypeEntity.get();
           TransactionTypeEntity1.setTransactionTypeId(TransactionTypeDTO.getTransactionTypeId());// Add all other properties
           TransactionTypeRepository.save(TransactionTypeEntity1);
    }


    @Override
    public void deleteTransactionType(String id) {
        TransactionTypeRepository.deleteById(Long.valueOf(id));
    }
}
