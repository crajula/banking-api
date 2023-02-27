package com.wonderlabs.tms.service;


import com.wonderlabs.tms.dto.TransactionDetailsDTO;

import java.util.List;

public interface TransactionDetailsService {
    public void createTransactionDetails(TransactionDetailsDTO transactionDetailsDTO);
    public TransactionDetailsDTO findTransactionDetailsById(String transactionDetailsId);
    public List<TransactionDetailsDTO> getAllTransactionDetailss();
    public void updateTransactionDetails(String id, TransactionDetailsDTO transactionDetailsDTO);
    public void deleteTransactionDetails(String id);
}
