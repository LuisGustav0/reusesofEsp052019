package com.netflix.sistema.assinatura.preco;

import com.netflix.sistema.assinatura.preco.interfaces.IPreco;

import java.math.BigDecimal;

public class PrecoBasico implements IPreco {

  public BigDecimal getCalculaPreco() {
    return new BigDecimal(21.90);
  }
}
