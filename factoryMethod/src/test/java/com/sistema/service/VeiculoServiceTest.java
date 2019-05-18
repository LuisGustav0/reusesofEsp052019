package com.sistema.service;

import com.sistema.enums.CondicaoMetereologicaE;
import com.sistema.model.veiculo.Veiculo;
import com.sistema.model.veiculo.factory.FabricaVeiculo;
import com.sistema.model.veiculo.factory.VeiculoFactory;
import org.junit.Assert;
import org.junit.Test;

public class VeiculoServiceTest {

  @Test
  public void testSoCriaObjetoParaDistanciasAte500Km() {
    int km = 600;
    int quantidadePessoa = 10;

    VeiculoFactory fabricaVeiculo = new FabricaVeiculo();
    Veiculo veiculo = fabricaVeiculo.criarVeiculo(km, quantidadePessoa, CondicaoMetereologicaE.CHUVA);

    Assert.assertNull(veiculo);
  }
}
