package edu.ifam.dra.chat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ifam.dra.chat.model.Contato;

public interface ContatoRepositories extends JpaRepository<Contato, Long> {

}
