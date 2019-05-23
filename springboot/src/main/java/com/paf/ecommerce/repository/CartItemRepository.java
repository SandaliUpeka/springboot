package com.paf.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paf.ecommerce.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long>  {

}
