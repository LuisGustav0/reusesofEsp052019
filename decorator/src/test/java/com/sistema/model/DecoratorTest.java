package com.sistema.model;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class DecoratorTest {

  @Test
  public void testPratoNormalAdicionarDoisOvosEUmaCebola() {
    Prato prato = new PratoNormal();
    prato = new AdicionalOvo(prato);
    prato = new AdicionalOvo(prato);
    prato = new AdicionalCebola(prato);

    assertEquals(prato.getPreco(), new BigDecimal("14.0"));
  }

  @Test
  public void testPratoExecutivoSemAdicional() {
    Prato prato = new PratoExecutivo();

    assertEquals(prato.getPreco(), new BigDecimal(12.0));
  }
}
