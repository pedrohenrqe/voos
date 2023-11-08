package br.senai.sp.jandira.model;

public class VooEmirates extends Voo{
    public VooEmirates(String companhia, String destino, String origem, String horaSaida, String dataSaida, int numeroVoo, int qtdePassageiros) {
        super(companhia, destino, origem, horaSaida, dataSaida, numeroVoo, qtdePassageiros);
    }

    @Override
    public String print() {
        return "Voo Emirates\n" +
                "Companhia: " + super.getComphanias() + "\n" +
                "Origem: " + super.getOrigem() + "\n" +
                "Destino: " + super.getDestino() + "\n" +
                "Hora de Partida: " + super.getHorarioSaida() + "\n" +
                "Data de Partida: " + super.getDataSaida() + "\n" +
                "Número do Voo: " + super.getNumeroVoo() + "\n" +
                "Quantidade de Passageiros: " + super.getPassageiros();
    }
}
