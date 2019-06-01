package com.netflix.sistema.service;

import com.netflix.sistema.assinatura.Assinatura;
import com.netflix.sistema.assinatura.plano.fabrica.FabricaPlanoBasico;
import com.netflix.sistema.assinatura.plano.fabrica.FabricaPlanoPadrao;
import com.netflix.sistema.assinatura.plano.fabrica.FabricaPlanoPremium;
import com.netflix.sistema.assinatura.plano.interfaces.IFabricaPlanoAbstractyFactory;
import org.junit.Test;

public class AssinaturaServiceTest {

  @Test
  public void testAssinaturaBasica() {
    IFabricaPlanoAbstractyFactory fabricaPlano = new FabricaPlanoBasico();

    Assinatura assinatura = new Assinatura(fabricaPlano.getPreco(), fabricaPlano.getContentTransformer(), fabricaPlano.getPreparadorNumeroTransmissoes());
    assinatura.getPreco();
    assinatura.disponibilizarConteudo();
    assinatura.preparadorAmbienteParaTransmissoesSimultanias();
  }

  @Test
  public void testAssinaturaPadrao() {
    IFabricaPlanoAbstractyFactory fabricaPlano = new FabricaPlanoPadrao();

    Assinatura assinatura = new Assinatura(fabricaPlano.getPreco(), fabricaPlano.getContentTransformer(), fabricaPlano.getPreparadorNumeroTransmissoes());
    assinatura.getPreco();
    assinatura.disponibilizarConteudo();
    assinatura.preparadorAmbienteParaTransmissoesSimultanias();
  }

  @Test
  public void testAssinaturaPremium() {
    IFabricaPlanoAbstractyFactory fabricaPlano = new FabricaPlanoPremium();

    Assinatura assinatura = new Assinatura(fabricaPlano.getPreco(), fabricaPlano.getContentTransformer(), fabricaPlano.getPreparadorNumeroTransmissoes());
    assinatura.getPreco();
    assinatura.disponibilizarConteudo();
    assinatura.preparadorAmbienteParaTransmissoesSimultanias();
  }
}
