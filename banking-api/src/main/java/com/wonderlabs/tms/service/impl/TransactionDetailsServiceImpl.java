package com.wonderlabs.tms.service.impl;


import com.wonderlabs.tms.dto.TransactionDetailsDTO;
import com.wonderlabs.tms.entity.TransactionDetailsEntity;
import com.wonderlabs.tms.repository.TransactionDetailsRepository;
import com.wonderlabs.tms.service.TransactionDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionDetailsServiceImpl implements TransactionDetailsService {

   /* @Autowired
    private MapStructMapper mapstructMapper;*/

    private TransactionDetailsRepository transactionDetailsRepository;

    @Autowired
    public TransactionDetailsServiceImpl(TransactionDetailsRepository transactionDetailsRepository ){
       // this.mapstructMapper = mapstructMapper;
        this.transactionDetailsRepository = transactionDetailsRepository;
    }

    @Override
    public void createTransactionDetails(TransactionDetailsDTO transactionDetailsDTO) {
       // TransactionDetailsEntity TransactionDetailsEntity = TransactionDetailsEntityToTransactionDetailsDto(TransactionDetailsDTO);
       // TransactionDetailsRepository.save(TransactionDetailsEntity);
    }

    @Override
    public TransactionDetailsDTO findTransactionDetailsById(String transactionDetailsId) {
        return null;
    }

    @Override
    public List<TransactionDetailsDTO> getAllTransactionDetailss() {
        return null;
    }

    @Override
    public void updateTransactionDetails(String id, TransactionDetailsDTO transactionDetailsDTO) {
           Optional<TransactionDetailsEntity> transactionDetailsEntity =  transactionDetailsRepository.findById(Long.valueOf(id));
           TransactionDetailsEntity transactionDetailsEntity1 = transactionDetailsEntity.get();
         //  TransactionDetailsEntity1.setTransactionDetailsId(transactionDetailsDTO.getTransactionDetailsId());// Add all other properties
           transactionDetailsRepository.save(transactionDetailsEntity1);
    }


    @Override
    public void deleteTransactionDetails(String id) {
        transactionDetailsRepository.deleteById(Long.valueOf(id));
    }
}
