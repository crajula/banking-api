package com.wonderlabs.tms.service;


import com.wonderlabs.tms.dto.TransactionTypeDTO;

import java.util.List;

public interface TransactionTypeService {
    public void createTransactionType(TransactionTypeDTO TransactionTypeDTO);
    public TransactionTypeDTO findTransactionTypeById(String TransactionTypeId);
    public List<TransactionTypeDTO> getAllTransactionTypes();
    public void updateTransactionType(String id, TransactionTypeDTO TransactionTypeDTO);
    public void deleteTransactionType(String id);
}
