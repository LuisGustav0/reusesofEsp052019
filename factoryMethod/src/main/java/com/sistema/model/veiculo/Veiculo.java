package com.sistema.model.veiculo;

import com.sistema.enums.CondicaoMetereologicaE;
import com.sistema.enums.TipoCombustivelE;
import com.sistema.enums.TipoVeiculoE;

public abstract class Veiculo {
  private TipoCombustivelE tipoCombustivelE;
  private TipoVeiculoE tipoVeiculoE;
  private CondicaoMetereologicaE condicaoMetereologicaE;

  public TipoCombustivelE getTipoCombustivelE() {
    return tipoCombustivelE;
  }

  public void setTipoCombustivelE(TipoCombustivelE tipoCombustivelE) {
    this.tipoCombustivelE = tipoCombustivelE;
  }

  public TipoVeiculoE getTipoVeiculoE() {
    return tipoVeiculoE;
  }

  public void setTipoVeiculoE(TipoVeiculoE tipoVeiculoE) {
    this.tipoVeiculoE = tipoVeiculoE;
  }

  public CondicaoMetereologicaE getCondicaoMetereologicaE() {
    return condicaoMetereologicaE;
  }

  public void setCondicaoMetereologicaE(CondicaoMetereologicaE condicaoMetereologicaE) {
    this.condicaoMetereologicaE = condicaoMetereologicaE;
  }
}
