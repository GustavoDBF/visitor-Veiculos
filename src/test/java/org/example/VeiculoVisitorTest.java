package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoVisitorTest {

    @Test
    void deveExibirCarro() {
        Carro carro = new Carro(1, "Civic", new Marca("Honda"));

        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("Carro{id=1, modelo='Civic', marca=Honda}", visitor.exibir(carro));
    }

    @Test
    void deveExibirMoto() {
        Moto moto = new Moto(1, "CB 500", 500);

        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("Moto{id=1, modelo='CB 500', cilindradas=500}", visitor.exibir(moto));
    }

    @Test
    void deveExibirCaminhao() {
        Caminhao caminhao = new Caminhao(1, "FH 540", 10000.0f);

        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("Caminhao{codigo=1, modelo='FH 540', capacidadeCarga=10000.0}", visitor.exibir(caminhao));
    }
}