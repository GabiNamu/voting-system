package com.betrybe.sistemadevotacao;

/**
 * Classe abstrata Pessoa.
 */
public abstract class Pessoa {
  protected String nome;

  public String getNome() {
    return this.nome;
  }

  public void setNome(String newName) {
    this.nome = newName;
  }

}
