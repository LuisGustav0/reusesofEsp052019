package com.netflix.sistema.assinatura.preparador.numerotransmissao;

import com.netflix.sistema.assinatura.preparador.numerotransmissao.interfaces.IPreparadorNumeroTransmissoes;

public class TransmissaoQuadupla implements IPreparadorNumeroTransmissoes {

  public int preparadorAmbienteParaTransmissoesSimultanias() {
    return 4;
  }
}
