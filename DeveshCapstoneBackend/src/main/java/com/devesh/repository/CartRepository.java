package com.devesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devesh.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
