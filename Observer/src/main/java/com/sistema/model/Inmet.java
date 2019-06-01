package com.sistema.model;

import com.sistema.observer.Observer;

public class Inmet implements Observer {

  private Estacao estacao;

  public Inmet(Estacao estacao) {
    this.estacao = estacao;
  }

  @Override
  public void update() {
    System.out.println(estacao);
  }
}
