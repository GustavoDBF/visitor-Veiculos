package org.example;

public class VeiculoVisitor implements Visitor {

    public String exibir(Veiculo veiculo) {
        return veiculo.aceitar(this);
    }

    @Override
    public String exibirCarro(Carro carro) {
        return "Carro{" +
                "id=" + carro.getId() +
                ", modelo='" + carro.getModelo() + '\'' +
                ", marca=" + carro.getNomeMarca() +
                '}';
    }

    @Override
    public String exibirMoto(Moto moto) {
        return "Moto{" +
                "id=" + moto.getId() +
                ", modelo='" + moto.getModelo() + '\'' +
                ", cilindradas=" + moto.getCilindradas() +
                '}';
    }

    @Override
    public String exibirCaminhao(Caminhao caminhao) {
        return "Caminhao{" +
                "codigo=" + caminhao.getCodigo() +
                ", modelo='" + caminhao.getModelo() + '\'' +
                ", capacidadeCarga=" + caminhao.getCapacidadeCarga() +
                '}';
    }
}