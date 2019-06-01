package com.netflix.sistema.assinatura.preco;

import com.netflix.sistema.assinatura.preco.interfaces.IPreco;

import java.math.BigDecimal;

public class PrecoPadrao implements IPreco {

  public BigDecimal getCalculaPreco() {
    return new BigDecimal(32.90);
  }
}
