package com.wonderlabs.tms.service;


import com.wonderlabs.tms.dto.AccountDTO;
import com.wonderlabs.tms.dto.UserDTO;

import java.util.List;

public interface AccountService {
    public void createAccount(AccountDTO accountDTO);
    public UserDTO findAccountById(String accountId);
    public void updateAccount(String id, AccountDTO accountDTO);
    public void deleteAccount(String id);
}
