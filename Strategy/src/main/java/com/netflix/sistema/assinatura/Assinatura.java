package com.netflix.sistema.assinatura;

import com.netflix.sistema.assinatura.preco.interfaces.IPreco;
import com.netflix.sistema.assinatura.preparador.numerotransmissao.interfaces.IPreparadorNumeroTransmissoes;
import com.netflix.sistema.assinatura.transformer.interfaces.IContentTransformer;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Assinatura {

  private NumberFormat formatter = new DecimalFormat("#0.00");

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
    BigDecimal preco = ipreco.getCalculaPreco();

    System.out.println("Assinatura -> getPreco: " + formatter.format(preco));

    return preco;
  }

  public byte[] disponibilizarConteudo() {
    byte[] bytes = iContentTransformer.converterQualidade();

    System.out.println("Assinatura -> disponibilizarConteudo: " + iContentTransformer.getClass().getSimpleName());

    return bytes;
  }

  public void preparadorAmbienteParaTransmissoesSimultanias() {
    System.out.println("Assinatura -> preparadorAmbienteParaTransmissoesSimultanias: " +
        iPreparadorNumeroTransmissoes.preparadorAmbienteParaTransmissoesSimultanias());
  }
}
