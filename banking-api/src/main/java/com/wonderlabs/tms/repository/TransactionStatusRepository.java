package com.wonderlabs.tms.repository;

import com.wonderlabs.tms.entity.TransactionStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionStatusRepository extends JpaRepository<TransactionStatusEntity, Long> {
}