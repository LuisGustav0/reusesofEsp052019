package com.netflix.sistema.assinatura;

import com.netflix.sistema.assinatura.preco.interfaces.IPreco;
import com.netflix.sistema.assinatura.preparador.numerotransmissao.interfaces.IPreparadorNumeroTransmissoes;
import com.netflix.sistema.assinatura.transformer.interfaces.IContentTransformer;

import java.math.BigDecimal;

public class Assinatura {

  private IPreco ipreco;
  private IContentTransformer iContentTransformer;
  private IPreparadorNumeroTransmissoes iPreparadorNumeroTransmissoes;

  public Assinatura(IPreco ipreco,
                    IContentTransformer iContentTransformer,
                    IPreparadorNumeroTransmissoes iPreparadorNumeroTransmissoes) {
    this.ipreco = ipreco;
    this.iContentTransformer = iContentTransformer;
    this.iPreparadorNumeroTransmissoes = iPreparadorNumeroTransmissoes;
  }

  public BigDecimal getPreco() {
    return ipreco.getCalculaPreco();
  }

  public byte[] disponibilizarConteudo() {
    return iContentTransformer.converterQualidade();
  }

  public void preparadorAmbienteParaTransmissoesSimultanias() {

  }
}
