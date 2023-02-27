package com.wonderlabs.tms.service;


import com.wonderlabs.tms.dto.AccountDTO;
import com.wonderlabs.tms.dto.AccountTypeDTO;
import com.wonderlabs.tms.dto.AccountTypeDTO;

import java.util.List;

public interface AccountTypeService {
    public void createAccountType(AccountTypeDTO accountTypeDTO);
    public AccountTypeDTO findAccountTypeById(String accountTypeId);
    public void updateAccountType(String id, AccountTypeDTO accountTypeDTO);
    public void deleteAccountType(String id);
}
