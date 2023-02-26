package com.wonderlabs.tms.repository;

import com.wonderlabs.tms.entity.TransactionReasonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionReasonRepository extends JpaRepository<TransactionReasonEntity, Long> {
}