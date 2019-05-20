package com.sistema.model.veiculo.fabrica;

import com.sistema.enums.CondicaoMetereologicaE;
import com.sistema.enums.TipoCombustivelE;
import com.sistema.model.veiculo.TeslaRoadster;
import com.sistema.model.veiculo.Veiculo;
import com.sistema.model.veiculo.factory.VeiculoFactory;

public class FabricaComCriseCombustivel implements VeiculoFactory {

  @Override
  public Veiculo criar(int km, int quantidadePessoa, CondicaoMetereologicaE condicaoMetereologicaE) {
    if (km > 500 || (quantidadePessoa <= 0 || quantidadePessoa > 2)) {
      return null;
    }

    return new TeslaRoadster(km, quantidadePessoa, TipoCombustivelE.ELETRICIDADE);
  }
}
