package com.sistema.model;

import java.math.BigDecimal;

public abstract class PratoDecorator implements Prato {

  private Prato prato;

  public PratoDecorator(Prato prato) {
    this.prato = prato;
  }

  @Override
  public BigDecimal getPreco() {
    return this.prato.getPreco();
  }
}