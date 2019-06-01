package com.netflix.sistema.assinatura.plano.fabrica;

import com.netflix.sistema.assinatura.plano.interfaces.IFabricaPlanoAbstractyFactory;
import com.netflix.sistema.assinatura.preco.PrecoBasico;
import com.netflix.sistema.assinatura.preco.PrecoPadrao;
import com.netflix.sistema.assinatura.preco.interfaces.IPreco;
import com.netflix.sistema.assinatura.preparador.numerotransmissao.TransmissaoDupla;
import com.netflix.sistema.assinatura.preparador.numerotransmissao.TransmissaoUnica;
import com.netflix.sistema.assinatura.preparador.numerotransmissao.interfaces.IPreparadorNumeroTransmissoes;
import com.netflix.sistema.assinatura.transformer.HD;
import com.netflix.sistema.assinatura.transformer.Simples;
import com.netflix.sistema.assinatura.transformer.interfaces.IContentTransformer;

public class FabricaPlanoPadrao implements IFabricaPlanoAbstractyFactory{

  public IPreco getPreco() {
    return new PrecoPadrao();
  }

  public IContentTransformer getContentTransformer() {
    return new HD();
  }

  public IPreparadorNumeroTransmissoes getPreparadorNumeroTransmissoes() {
    return new TransmissaoDupla();
  }
}
