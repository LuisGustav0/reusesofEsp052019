package com.sistema.service;

import com.sistema.enums.CondicaoMetereologicaE;
import com.sistema.model.veiculo.TeslaRoadster;
import com.sistema.model.veiculo.Veiculo;
import com.sistema.model.veiculo.fabrica.FabricaVeiculo;
import com.sistema.model.veiculo.factory.VeiculoFactory;
import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class FabricaVeiculoTest {

  @Test
  public void testSoCriaObjetoParaDistanciasAte500Km() {
    int km = 600;
    int quantidadePessoa = 10;

    VeiculoFactory fabricaVeiculo = new FabricaVeiculo();
    Veiculo veiculo = fabricaVeiculo.criar(km, quantidadePessoa, CondicaoMetereologicaE.CHUVA);

    assertNull(veiculo);
  }

  @Test
  public void testParaAte2PessoasCriarUmTeslaRoadsterEletricidade() {
    int km = 400;
    int quantidadePessoa = 2;

    VeiculoFactory fabricaVeiculo = new FabricaVeiculo();
    Veiculo veiculo = fabricaVeiculo.criar(km, quantidadePessoa, CondicaoMetereologicaE.CHUVA);

    boolean isTeslaRoadster = veiculo instanceof TeslaRoadster;

    assertTrue(isTeslaRoadster);
  }
}
