package br.com.dentista.dentista.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.dentista.dentista.entity.Dentista;

public interface DentistaRepository extends JpaRepository<Dentista, Integer> {
} 