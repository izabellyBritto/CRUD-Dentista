package br.com.dentista.dentista.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.dentista.dentista.entity.Especialidade;

public interface EspecialidadeRepository extends JpaRepository<Especialidade, Integer> {
} 