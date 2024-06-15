package com.educandoweb2.course2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb2.course2.entities.OrderItem;
import com.educandoweb2.course2.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
