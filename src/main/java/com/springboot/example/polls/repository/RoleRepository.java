package com.springboot.example.polls.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.example.polls.model.Role;
import com.springboot.example.polls.model.RoleName;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	
    Optional<Role> findByName(RoleName roleName);
}
