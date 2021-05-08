package dev.augusto.auladomain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.augusto.auladomain.entites.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
