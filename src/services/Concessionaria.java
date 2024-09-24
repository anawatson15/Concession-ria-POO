package services;
import models.Veiculo;
import java.util.List;

public class Concessionaria {

    public static double calcularMediaPrecos(List<Veiculo> veiculos) {
        double soma = 0;
        for (Veiculo veiculo : veiculos) {
            soma += veiculo.calculaValor();
        }
        return soma / veiculos.size();
    }

    public static Veiculo buscarVeiculoPorModelo(List<Veiculo> veiculos, String modelo) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getModelo().equalsIgnoreCase(modelo)) {
                return veiculo;
            }
        }
        return null;
    }
}

