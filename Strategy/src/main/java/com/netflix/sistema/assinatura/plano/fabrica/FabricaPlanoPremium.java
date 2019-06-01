package com.netflix.sistema.assinatura.plano.fabrica;

import com.netflix.sistema.assinatura.plano.interfaces.IFabricaPlanoAbstractyFactory;
import com.netflix.sistema.assinatura.preco.PrecoBasico;
import com.netflix.sistema.assinatura.preco.PrecoPremium;
import com.netflix.sistema.assinatura.preco.interfaces.IPreco;
import com.netflix.sistema.assinatura.preparador.numerotransmissao.TransmissaoQuadupla;
import com.netflix.sistema.assinatura.preparador.numerotransmissao.TransmissaoUnica;
import com.netflix.sistema.assinatura.preparador.numerotransmissao.interfaces.IPreparadorNumeroTransmissoes;
import com.netflix.sistema.assinatura.transformer.Simples;
import com.netflix.sistema.assinatura.transformer.UltraHD;
import com.netflix.sistema.assinatura.transformer.interfaces.IContentTransformer;

public class FabricaPlanoPremium implements IFabricaPlanoAbstractyFactory{

  public IPreco getPreco() {
    return new PrecoPremium();
  }

  public IContentTransformer getContentTransformer() {
    return new UltraHD();
  }

  public IPreparadorNumeroTransmissoes getPreparadorNumeroTransmissoes() {
    return new TransmissaoQuadupla();
  }
}
