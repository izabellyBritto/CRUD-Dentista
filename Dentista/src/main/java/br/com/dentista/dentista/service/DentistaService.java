package br.com.dentista.dentista.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.dentista.dentista.entity.Dentista;
import br.com.dentista.dentista.repository.DentistaRepository;

@Service
public class DentistaService {
    @Autowired
    private DentistaRepository dentistaRepository;

    public List<Dentista> findAll() {
        return dentistaRepository.findAll();
    }

    public Dentista save(Dentista dentista) {
        return dentistaRepository.save(dentista);
    }

    public void deleteById(Integer id) {
        dentistaRepository.deleteById(id);
    }

    public Dentista findById(Integer id) {
        return dentistaRepository.findById(id).orElse(null);
    }
} 