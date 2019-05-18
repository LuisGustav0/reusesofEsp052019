package com.sistema.model;

import java.math.BigDecimal;

public class PratoNormal implements Prato {

  @Override
  public BigDecimal getPreco() {
    return new BigDecimal(10);
  }
}
