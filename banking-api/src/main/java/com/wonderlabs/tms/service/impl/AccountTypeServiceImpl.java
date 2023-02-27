package com.wonderlabs.tms.service.impl;


import com.wonderlabs.tms.dto.AccountTypeDTO;
import com.wonderlabs.tms.entity.AccountTypeEntity;
import com.wonderlabs.tms.repository.AccountTypeRepository;
import com.wonderlabs.tms.service.AccountTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountTypeServiceImpl implements AccountTypeService {

   /* @Autowired
    private MapStructMapper mapstructMapper;*/

    private AccountTypeRepository accountTypeRepository;

    @Autowired
    public AccountTypeServiceImpl(AccountTypeRepository AccountTypeRepository ){
       // this.mapstructMapper = mapstructMapper;
        this.accountTypeRepository = accountTypeRepository;
    }

    @Override
    public void createAccountType(AccountTypeDTO AccountTypeDTO) {
       // AccountTypeEntity AccountTypeEntity = AccountTypeEntityToAccountTypeDto(AccountTypeDTO);
       // AccountTypeRepository.save(AccountTypeEntity);
    }

    @Override
    public AccountTypeDTO findAccountTypeById(String AccountTypeId) {
        return null;
    }


    @Override
    public void updateAccountType(String id, AccountTypeDTO AccountTypeDTO) {
           Optional<AccountTypeEntity> accountTypeEntity =  accountTypeRepository.findById(Long.valueOf(id));
           AccountTypeEntity accountTypeEntity1 = accountTypeEntity.get();
           //AccountTypeEntity1.setAccountTypeId(AccountTypeDTO.getAccountTypeId());// Add all other properties
           accountTypeRepository.save(accountTypeEntity1);
    }


    @Override
    public void deleteAccountType(String id) {
        accountTypeRepository.deleteById(Long.valueOf(id));
    }
}
