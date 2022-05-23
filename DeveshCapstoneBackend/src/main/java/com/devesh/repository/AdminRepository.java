package com.devesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devesh.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, String>{

	Admin findByusername(String username);

}
