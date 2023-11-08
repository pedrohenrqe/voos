package br.senai.sp.jandira.model;

import java.util.Set;

abstract class Voo {
    private String comphanias, destino, origem, horarioSaida, dataSaida;
    private int passageiros, numeroVoo;

    public Voo(String comphanias, String destino, String origem, String horarioSaida, String dataSaida, Integer passageiros, Integer numeroVoo) {
        this.comphanias = comphanias;
        this.destino = destino;
        this.origem = origem;
        this.horarioSaida =horarioSaida;
        this.dataSaida = dataSaida;
        this.passageiros = passageiros;
        this.numeroVoo = numeroVoo;
    }

    public String print() {
        return "Companhia: " + comphanias +
                "Destino: " + destino +
                "Origem: " + origem +
                "Horário de Saída: " + horarioSaida +
                "Data de Saída: " + dataSaida +
                "Passageiros: " + passageiros +
                "Identificação do Voo: " + numeroVoo;
    }

    public String getComphanias() {
        return comphanias;
    }

    public void setComphanias(String comphanias) {
        this.comphanias = comphanias;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getHorarioSaida() {
        return horarioSaida;
    }

    public void setHorarioSaida(String horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }
}
