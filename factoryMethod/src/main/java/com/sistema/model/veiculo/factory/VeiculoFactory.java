package com.sistema.model.veiculo.factory;

import com.sistema.enums.CondicaoMetereologicaE;
import com.sistema.model.veiculo.Veiculo;

public interface VeiculoFactory {

  Veiculo criarVeiculo(int km, int quantidadePessoa, CondicaoMetereologicaE condicaoMetereologicaE);
}
