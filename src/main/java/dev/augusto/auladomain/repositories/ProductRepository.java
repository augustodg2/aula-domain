package dev.augusto.auladomain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.augusto.auladomain.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
