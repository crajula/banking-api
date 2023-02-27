package com.wonderlabs.tms.service.impl;


import com.wonderlabs.tms.dto.AccountDTO;
import com.wonderlabs.tms.dto.UserDTO;
import com.wonderlabs.tms.entity.AccountEntity;
import com.wonderlabs.tms.repository.AccountRepository;
import com.wonderlabs.tms.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

   /* @Autowired
    private MapStructMapper mapstructMapper;*/

    private AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository ){
       // this.mapstructMapper = mapstructMapper;
        this.accountRepository = accountRepository;
    }

    @Override
    public void createAccount(AccountDTO accountDTO) {
       // AccountEntity AccountEntity = AccountEntityToAccountDto(AccountDTO);
       // AccountRepository.save(AccountEntity);
    }

    @Override
    public UserDTO findAccountById(String accountId) {
        return null;
    }

    @Override
    public void updateAccount(String id, AccountDTO accountDTO) {
           Optional<AccountEntity> accountEntity =  accountRepository.findById(Long.valueOf(id));
           AccountEntity accountEntity1 = accountEntity.get();
           //accountEntity1.setAccount(accountDTO.getAccountId());// Add all other properties
            accountRepository.save(accountEntity1);
    }


    @Override
    public void deleteAccount(String id) {
        accountRepository.deleteById(Long.valueOf(id));
    }
}
