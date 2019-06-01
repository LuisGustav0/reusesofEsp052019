package com.netflix.sistema.assinatura.transformer;

import com.netflix.sistema.assinatura.transformer.interfaces.IContentTransformer;

public class Simples implements IContentTransformer {

  public byte[] converterQualidade() {
    return new byte[0];
  }
}
