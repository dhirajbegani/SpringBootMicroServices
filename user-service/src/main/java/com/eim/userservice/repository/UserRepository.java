package com.eim.userservice.repository;

import com.eim.userservice.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <UserEntity, Long> {

    UserEntity getUserByUserId(Long userId);
}
