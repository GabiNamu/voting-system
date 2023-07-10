package com.betrybe.sistemadevotacao;

/**
 * Classe abstrata Pessoa.
 */
public abstract class Pessoa {
  protected String nome;

  public String getNome() {
    return nome;
  }

  public void setNome(String newName) {
    nome = newName;
  }

}
