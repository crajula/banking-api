package com.wonderlabs.tms.repository;

import com.wonderlabs.tms.entity.TransactionDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionDetailsRepository extends JpaRepository<TransactionDetailsEntity, Long> {
}