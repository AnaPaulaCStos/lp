package br.igor.Restaurante.model;

import br.igor.Restaurante.dto.FuncionarioRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "funcionarios")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private String nome;
    
    @Column
    private String cargo;

    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL)
    private List<Pedido> pedidos;

    public Funcionario(FuncionarioRequestDTO funcionarioRequestDTO) {
        this.nome = funcionarioRequestDTO.getNome();
        this.cargo = funcionarioRequestDTO.getCargo();
    }
}
