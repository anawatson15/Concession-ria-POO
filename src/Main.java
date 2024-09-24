import models.*;
import services.Concessionaria;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Criando veículos
        Motocicleta moto1 = new Motocicleta("Harley-Davidson", "Breakout", 120000);
        Motocicleta moto2 = new Motocicleta("Honda", "POP-100", 9000, true);

        Carro carro1 = new Carro("Mitsubishi", "Lancer", 75000, true);
        Carro carro2 = new Carro("Volkswagen", "Fusca", 35000);

        // Adicionando seguro ao carro que não tem seguro
        Seguro seguroCarro1 = new Seguro("Básico", 3000);
        carro1.contratarSeguro(seguroCarro1);

        Seguro seguroMoto2 = new Seguro("Básico", 1000);
        moto2.contratarSeguro(seguroMoto2);

        // Criando lista de veículos
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(moto1);
        veiculos.add(moto2);
        veiculos.add(carro1);
        veiculos.add(carro2);

        Cliente cliente = new Cliente("Olavo", veiculos);

        // Dados do cliente
        System.out.println("Cliente: " + cliente.getNome());
        for (Veiculo veiculo : cliente.getVeiculos()) {
            System.out.println(veiculo);
        }

        // Média dos preços
        double mediaPrecos = Concessionaria.calcularMediaPrecos(cliente.getVeiculos());
        System.out.println("Preço médio de veículos: " + mediaPrecos);

        // Busca por modelo
        String modeloBuscado = "Fusca";
        Veiculo veiculoBuscado = Concessionaria.buscarVeiculoPorModelo(cliente.getVeiculos(), modeloBuscado);

        if (veiculoBuscado != null) {
            System.out.println("Veículo encontrado: " + veiculoBuscado);
        } else {
            System.out.println("Veículo não encontrado: " + modeloBuscado);
        }
    }
}