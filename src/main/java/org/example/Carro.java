package org.example;

public class Carro implements Veiculo {

    private int id;
    private String modelo;
    private Marca marca;

    public Carro(int id, String modelo, Marca marca) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNomeMarca() {
        return this.marca.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirCarro(this);
    }
}