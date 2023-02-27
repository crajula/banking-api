package com.wonderlabs.tms.service.impl;


import com.wonderlabs.tms.dto.TransactionReasonDTO;
import com.wonderlabs.tms.entity.TransactionReasonEntity;
import com.wonderlabs.tms.repository.TransactionReasonRepository;
import com.wonderlabs.tms.service.TransactionReasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionReasonServiceImpl implements TransactionReasonService {

   /* @Autowired
    private MapStructMapper mapstructMapper;*/

    private TransactionReasonRepository TransactionReasonRepository;

    @Autowired
    public TransactionReasonServiceImpl(TransactionReasonRepository TransactionReasonRepository ){
       // this.mapstructMapper = mapstructMapper;
        this.TransactionReasonRepository = TransactionReasonRepository;
    }

    @Override
    public void createTransactionReason(TransactionReasonDTO TransactionReasonDTO) {
       // TransactionReasonEntity TransactionReasonEntity = TransactionReasonEntityToTransactionReasonDto(TransactionReasonDTO);
       // TransactionReasonRepository.save(TransactionReasonEntity);
    }

    @Override
    public TransactionReasonDTO findTransactionReasonById(String TransactionReasonId) {
        return null;
    }

    @Override
    public List<TransactionReasonDTO> getAllTransactionReasons() {
        return null;
    }

    @Override
    public void updateTransactionReason(String id, TransactionReasonDTO TransactionReasonDTO) {
           Optional<TransactionReasonEntity> TransactionReasonEntity =  TransactionReasonRepository.findById(Long.valueOf(id));
           TransactionReasonEntity TransactionReasonEntity1 = TransactionReasonEntity.get();
           TransactionReasonEntity1.setTransactionReasonId(TransactionReasonDTO.getTransactionReasonId());// Add all other properties
           TransactionReasonRepository.save(TransactionReasonEntity1);
    }


    @Override
    public void deleteTransactionReason(String id) {
        TransactionReasonRepository.deleteById(Long.valueOf(id));
    }
}
