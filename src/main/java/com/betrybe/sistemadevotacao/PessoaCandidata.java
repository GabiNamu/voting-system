package com.betrybe.sistemadevotacao;

/**
 * Classe PessoaCandidata.
 */
public class PessoaCandidata extends Pessoa {
  private int numero;
  private int votos;

  /**
   * Construtor.
   */
  public PessoaCandidata(String name, int number) {
    super.nome = name;
    this.numero = number;
    this.votos = 0;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String newName) {
    this.nome = newName;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int newNumber) {
    this.numero = newNumber;
  }

  public int getVotos() {
    return this.votos;
  }

  public void setVotos(int newValue) {
    this.votos = newValue;
  }

  public void receberVoto() {
    this.votos += 1;
  }

}
