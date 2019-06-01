package com.sistema.model;

import com.sistema.observer.Observer;

public class CampoUniversitario implements Observer {

  private Estacao estacao;

  public CampoUniversitario(Estacao estacao) {
    this.estacao = estacao;
  }

  @Override
  public void update() {
    System.out.println(estacao);
  }
}
