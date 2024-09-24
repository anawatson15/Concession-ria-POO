package models;

public class Carro extends Veiculo {
    private boolean temSeguro;

    public Carro(String marca, String modelo, double preco, boolean temSeguro) {
        super(marca, modelo, preco);
        this.temSeguro = temSeguro;
    }

    public Carro(String marca, String modelo, double preco) {
        super(marca, modelo, preco);
        this.temSeguro = false;
    }

    @Override
    public double calculaValor() {
        return calcularValorComSeguro();
    }

    public boolean isTemSeguro() {
        return temSeguro;
    }

    public void setTemSeguro(boolean temSeguro) {
        this.temSeguro = temSeguro;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "temSeguro=" + temSeguro +
                '}';
    }
}

