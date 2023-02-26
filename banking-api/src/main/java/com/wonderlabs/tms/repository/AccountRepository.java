package com.wonderlabs.tms.repository;

import com.wonderlabs.tms.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountEntity, Long> {

}