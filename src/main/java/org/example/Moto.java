package org.example;

public class Moto implements Veiculo {

    private int id;
    private String modelo;
    private int cilindradas;

    public Moto(int id, String modelo, int cilindradas) {
        this.id = id;
        this.modelo = modelo;
        this.cilindradas = cilindradas;
    }

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirMoto(this);
    }
}