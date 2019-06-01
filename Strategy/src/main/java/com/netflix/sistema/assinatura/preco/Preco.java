package com.netflix.sistema.assinatura.preco;

import com.netflix.sistema.assinatura.preco.interfaces.IPreco;

import java.math.BigDecimal;

public class Preco implements IPreco {

  public BigDecimal getCalculaPreco() {
    return new BigDecimal(45.90);
  }
}
