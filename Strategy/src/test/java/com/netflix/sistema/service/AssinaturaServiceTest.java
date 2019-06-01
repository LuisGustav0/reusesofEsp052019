package com.netflix.sistema.service;

import com.netflix.sistema.assinatura.Assinatura;
import com.netflix.sistema.assinatura.preco.Preco;
import com.netflix.sistema.assinatura.preco.interfaces.IPreco;
import com.netflix.sistema.assinatura.preparador.numerotransmissao.TransmissaoQuadupla;
import com.netflix.sistema.assinatura.preparador.numerotransmissao.interfaces.IPreparadorNumeroTransmissoes;
import com.netflix.sistema.assinatura.transformer.UltraHD;
import com.netflix.sistema.assinatura.transformer.interfaces.IContentTransformer;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AssinaturaServiceTest {

  @Test
  public void testAssinatura() {
    IPreco ipreco = new Preco();
    IContentTransformer iContentTransformer = new UltraHD();
    IPreparadorNumeroTransmissoes iPreparadorNumeroTransmissoes = new TransmissaoQuadupla();

    assertTrue(iContentTransformer instanceof UltraHD);
    assertTrue(iPreparadorNumeroTransmissoes instanceof TransmissaoQuadupla);

    Assinatura assinatura = new Assinatura(ipreco, iContentTransformer, iPreparadorNumeroTransmissoes);

    assertEquals(assinatura.getPreco(), new BigDecimal(45.90));
  }
}
