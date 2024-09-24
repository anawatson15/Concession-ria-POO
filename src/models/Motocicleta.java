package models;

public class Motocicleta extends Veiculo {
    private boolean comSeguro;

    public Motocicleta(String marca, String modelo, double preco, boolean comSeguro) {
        super(marca, modelo, preco);
        this.comSeguro = comSeguro;
    }

    public Motocicleta(String marca, String modelo, double preco) {
        super(marca, modelo, preco);
        this.comSeguro = false;
    }

    @Override
    public double calculaValor() {
        return calcularValorComSeguro();
    }

    public boolean isComSeguro() {
        return comSeguro;
    }

    public void setComSeguro(boolean comSeguro) {
        this.comSeguro = comSeguro;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "comSeguro=" + comSeguro +
                '}';
    }
}

