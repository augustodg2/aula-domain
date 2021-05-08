package dev.augusto.auladomain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.augusto.auladomain.entites.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
