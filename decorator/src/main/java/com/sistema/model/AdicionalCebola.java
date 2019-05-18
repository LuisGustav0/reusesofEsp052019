package com.sistema.model;

import java.math.BigDecimal;

public class AdicionalCebola extends PratoDecorator {

  public AdicionalCebola(Prato prato) {
    super(prato);
  }

  @Override
  public BigDecimal getPreco() {
    return super.getPreco().add(BigDecimal.valueOf(1));
  }
}
