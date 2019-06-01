package com.sistema.model;

import com.sistema.observer.Observable;
import com.sistema.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Estacao implements Observable {
  private List<Observer> listaObserver = new ArrayList();

  private int temperatura;
  private int pressao;
  private int umidade;

  public int getTemperatura() {
    return temperatura;
  }

  public void setTemperatura(int temperatura) {
    this.temperatura = temperatura;
  }

  public int getPressao() {
    return pressao;
  }

  public void setPressao(int pressao) {
    this.pressao = pressao;
  }

  public int getUmidade() {
    return umidade;
  }

  public void setUmidade(int umidade) {
    this.umidade = umidade;
  }

  public void attach(Observer observer) {
    this.listaObserver.add(observer);
  }

  public void detach(Observer observer) {
    this.listaObserver.remove(observer);
  }

  public void notifyObservers() {
    for (Observer observer : listaObserver) {
      observer.update();
    }
  }
}
