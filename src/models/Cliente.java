package models;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Veiculo> veiculos;

    public Cliente(String nome, List<Veiculo> veiculos) {
        this.nome = nome;
        this.veiculos = new ArrayList<>(veiculos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void adicionarVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", veiculos=" + veiculos +
                '}';
    }
}

