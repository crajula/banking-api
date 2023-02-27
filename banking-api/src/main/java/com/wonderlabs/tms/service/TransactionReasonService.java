package com.wonderlabs.tms.service;


import com.wonderlabs.tms.dto.TransactionReasonDTO;

import java.util.List;

public interface TransactionReasonService {
    public void createTransactionReason(TransactionReasonDTO transactionReasonDTO);
    public TransactionReasonDTO findTransactionReasonById(String transactionReasonId);
    public List<TransactionReasonDTO> getAllTransactionReasons();
    public void updateTransactionReason(String id, TransactionReasonDTO transactionReasonDTO);
    public void deleteTransactionReason(String id);
}
