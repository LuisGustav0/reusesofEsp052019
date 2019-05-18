package com.sistema.model;

import java.math.BigDecimal;

public class AdicionalOvo extends PratoDecorator {

  public AdicionalOvo(Prato prato) {
    super(prato);
  }

  @Override
  public BigDecimal getPreco() {
    BigDecimal valor = super.getPreco();

    return valor.add(BigDecimal.valueOf(1.50));
  }
}
