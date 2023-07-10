package com.betrybe.sistemadevotacao;

/**
 * Classe PessoaEleitora.
 */
public class PessoaEleitora extends Pessoa {
  private String cpf;

  /**
   * Construtor.
   */
  public PessoaEleitora(String name, String newCpf) {
    this.nome = name;
    this.cpf = newCpf;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String newName) {
    this.nome = newName;
  }

  public String getCpf() {
    return this.cpf;
  }

  public void setCpf(String newCpf) {
    this.cpf = newCpf;
  }
}
