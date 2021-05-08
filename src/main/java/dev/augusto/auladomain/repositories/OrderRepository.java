package dev.augusto.auladomain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.augusto.auladomain.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
