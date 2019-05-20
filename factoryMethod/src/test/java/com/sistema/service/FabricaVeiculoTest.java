package com.sistema.service;

import com.sistema.enums.CondicaoMetereologicaE;
import com.sistema.model.veiculo.Besta;
import com.sistema.model.veiculo.EscortXr3;
import com.sistema.model.veiculo.Opala;
import com.sistema.model.veiculo.TeslaRoadster;
import com.sistema.model.veiculo.Veiculo;
import com.sistema.model.veiculo.fabrica.FabricaComCriseCombustivel;
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
  public void testParaAteDuasPessoasCriarUmTeslaRoadsterEletricidade() {
    int km = 400;
    int quantidadePessoa = 2;

    VeiculoFactory fabricaVeiculo = new FabricaVeiculo();
    Veiculo veiculo = fabricaVeiculo.criar(km, quantidadePessoa, CondicaoMetereologicaE.CHUVA);

    boolean isTeslaRoadster = veiculo instanceof TeslaRoadster;

    assertTrue(isTeslaRoadster);
  }

  @Test
  public void testParaAteCincoPessoasTempoSolCriarUmEscortXr3ConversivelAlccol() {
    int km = 400;
    int quantidadePessoa = 3;

    VeiculoFactory fabricaVeiculo = new FabricaVeiculo();
    Veiculo veiculo = fabricaVeiculo.criar(km, quantidadePessoa, CondicaoMetereologicaE.SOL);

    boolean isEscortXr3 = veiculo instanceof EscortXr3;

    assertTrue(isEscortXr3);
  }

  @Test
  public void testParaAteCincoPessoasTempoChuvaCriarUmOpalaConvensionalGasolina() {
    int km = 400;
    int quantidadePessoa = 5;

    VeiculoFactory fabricaVeiculo = new FabricaVeiculo();
    Veiculo veiculo = fabricaVeiculo.criar(km, quantidadePessoa, CondicaoMetereologicaE.CHUVA);

    boolean isOpala = veiculo instanceof Opala;

    assertTrue(isOpala);
  }

  @Test
  public void testParaMaisDeCincoEMe1nosDe20PessoasBestaDiesel() {
    int km = 400;
    int quantidadePessoa = 6;

    VeiculoFactory fabricaVeiculo = new FabricaVeiculo();
    Veiculo veiculo = fabricaVeiculo.criar(km, quantidadePessoa, CondicaoMetereologicaE.CHUVA);

    boolean isBesta = veiculo instanceof Besta;

    assertTrue(isBesta);
  }

  @Test
  public void testCaminhoneiroEmGreveTodoAbastecimentoFossilFoiInterrompido() {
    int km = 400;
    int quantidadePessoa = 2;

    VeiculoFactory fabricaVeiculo = new FabricaComCriseCombustivel();
    Veiculo veiculo = fabricaVeiculo.criar(km, quantidadePessoa, CondicaoMetereologicaE.CHUVA);

    boolean isTeslaRoadster = veiculo instanceof TeslaRoadster;

    assertTrue(isTeslaRoadster);
  }

  @Test
  public void testCaminhoneiroEmGreveTodoAbastecimentoFossilFoiInterrompidoENumeroDePessoasMaiorQue2() {
    int km = 400;
    int quantidadePessoa = 3;

    VeiculoFactory fabricaVeiculo = new FabricaComCriseCombustivel();
    Veiculo veiculo = fabricaVeiculo.criar(km, quantidadePessoa, CondicaoMetereologicaE.CHUVA);

    assertNull(veiculo);
  }

  @Test
  public void testCaminhoneiroEmGreveTodoAbastecimentoFossilFoiInterrompidoParaDistanciasAte500Km() {
    int km = 501;
    int quantidadePessoa = 2;

    VeiculoFactory fabricaVeiculo = new FabricaComCriseCombustivel();
    Veiculo veiculo = fabricaVeiculo.criar(km, quantidadePessoa, CondicaoMetereologicaE.CHUVA);

    assertNull(veiculo);
  }
}