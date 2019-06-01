package com.sistema.service;

import com.sistema.model.ClimaTempo;
import com.sistema.model.Estacao;
import org.junit.Test;

public class EstacaoServiceTest {

  @Test
  public void testComClimaTempo() {
    Estacao estacao = new Estacao();

    ClimaTempo climaTempo = new ClimaTempo(estacao);
    estacao.attach(climaTempo);

    estacao.setTemperatura(120);
    estacao.setPressao(20);
    estacao.setUmidade(5);
  }
}
