package com.wonderlabs.tms.repository;

import com.wonderlabs.tms.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}