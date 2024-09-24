package models;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private double preco;
    private Seguro seguro;

    public Veiculo(String marca, String modelo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.seguro = null;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void contratarSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    public double calcularValorComSeguro() {
        if (seguro != null) {
            return preco + seguro.getValor();
        }
        return preco;
    }

    public abstract double calculaValor();

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", preco=" + preco +
                ", seguro=" + seguro +
                '}';
    }
}



