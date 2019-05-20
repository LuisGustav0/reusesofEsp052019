package com.sistema.model.veiculo.fabrica;

import com.sistema.enums.CondicaoMetereologicaE;
import com.sistema.enums.TipoCombustivelE;
import com.sistema.enums.TipoVeiculoE;
import com.sistema.model.veiculo.Besta;
import com.sistema.model.veiculo.EscortXr3;
import com.sistema.model.veiculo.Opala;
import com.sistema.model.veiculo.TeslaRoadster;
import com.sistema.model.veiculo.Veiculo;
import com.sistema.model.veiculo.factory.VeiculoFactory;

public class FabricaVeiculo implements VeiculoFactory {

  public Veiculo criar(int km, int quantidadePessoa, CondicaoMetereologicaE condicaoMetereologicaE) {
    if (km > 500 || (quantidadePessoa <= 0 || quantidadePessoa > 20)) {
      return null;
    }

    if (quantidadePessoa <= 2) {
      return new TeslaRoadster(km, quantidadePessoa, TipoCombustivelE.ELETRICIDADE);
    }

    if (quantidadePessoa <= 5 && condicaoMetereologicaE == CondicaoMetereologicaE.SOL) {
      return new EscortXr3(km, quantidadePessoa, condicaoMetereologicaE, TipoCombustivelE.ALCOOL, TipoVeiculoE.CONVERSIVEL);
    }

    if (quantidadePessoa <= 5 && condicaoMetereologicaE == CondicaoMetereologicaE.CHUVA) {
      return new Opala(km, quantidadePessoa, condicaoMetereologicaE, TipoCombustivelE.GASOLINA, TipoVeiculoE.CONVENSIONAL);
    }

    if (quantidadePessoa > 5) {
      return new Besta(km, quantidadePessoa, TipoCombustivelE.DIESEL);
    }

    return null;
  }
}
