package com.netflix.sistema.assinatura.plano.interfaces;

import com.netflix.sistema.assinatura.preco.interfaces.IPreco;
import com.netflix.sistema.assinatura.preparador.numerotransmissao.interfaces.IPreparadorNumeroTransmissoes;
import com.netflix.sistema.assinatura.transformer.interfaces.IContentTransformer;

public interface IFabricaPlanoAbstractyFactory {

  IPreco getPreco();

  IContentTransformer getContentTransformer();

  IPreparadorNumeroTransmissoes getPreparadorNumeroTransmissoes();
}
