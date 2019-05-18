package com.sistema.model;

import java.math.BigDecimal;

public class PratoExecutivo implements Prato {

  @Override
  public BigDecimal getPreco() {
    return new BigDecimal(12);
  }
}
