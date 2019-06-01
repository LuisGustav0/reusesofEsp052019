package com.sistema.model;

import com.sistema.observer.Observer;

public class ClimaTempo implements Observer {

  private Estacao estacao;

  public ClimaTempo(Estacao estacao) {
    this.estacao = estacao;
  }

  @Override
  public void update() {
    System.out.println(String.format("Temperatura: %s \nPressao: %s \nUmidade: %s",
        this.estacao.getTemperatura(), this.estacao.getPressao(), this.estacao.getUmidade()));
  }
}
