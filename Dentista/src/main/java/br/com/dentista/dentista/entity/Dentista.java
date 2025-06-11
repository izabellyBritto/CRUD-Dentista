package br.com.dentista.dentista.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Dentista {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false, length = 40)
    private String nome;

    @Column(nullable = false, length = 15)
    private String telefone;

    @Column(nullable = false, length = 60)
    private String endereco;

    @Column(nullable = false, length = 10)
    private String cro;

    @ManyToOne
    @JoinColumn(name = "id_especialidade")
    private Especialidade especialidade;
} 