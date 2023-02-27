package com.wonderlabs.tms.service;


import com.wonderlabs.tms.dto.TransactionStatusDTO;

import java.util.List;

public interface TransactionStatusService {
    public void createTransactionStatus(TransactionStatusDTO transactionStatusDTO);
    public TransactionStatusDTO findTransactionStatusById(String transactionStatusId);
    public List<TransactionStatusDTO> getAllTransactionStatus();
    public void updateTransactionStatus(String id, TransactionStatusDTO transactionStatusDTO);
    public void deleteTransactionStatus(String id);
}
