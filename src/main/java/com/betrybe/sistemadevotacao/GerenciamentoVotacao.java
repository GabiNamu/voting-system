package com.betrybe.sistemadevotacao;

import java.util.ArrayList;
import java.util.Objects;

public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();
  private ArrayList<String> cpfsComputados = new ArrayList<String>();

  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (int i = 0; i < pessoasCandidatas.toArray().length; i++) {
      if (pessoasCandidatas.get(i).getNumero() == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
        return;
      }
    }
    pessoasCandidatas.add(new PessoaCandidata(nome, numero));
  }

  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (int i = 0; i < pessoasEleitoras.toArray().length; i++) {
      if (pessoasEleitoras.get(i).getCpf() == cpf) {
        System.out.println("Pessoa eleitora já cadastrada!");
        return;
      }
    }
    pessoasEleitoras.add(new PessoaEleitora(nome, cpf));
  }

  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    for (int i = 0; i < cpfsComputados.toArray().length; i++) {
      if (Objects.equals(cpfsComputados.get(i), cpfPessoaEleitora)) {
        System.out.println("Pessoa eleitora já votou!");
        return;
      }
    }
    for (int i = 0; i < pessoasCandidatas.toArray().length; i++) {
      if (pessoasCandidatas.get(i).getNumero() == numeroPessoaCandidata) {
        PessoaCandidata pessoaCandidata = pessoasCandidatas.get(i);
        pessoaCandidata.receberVoto();
        cpfsComputados.add(cpfPessoaEleitora);
      }
    }
  }

  public void mostrarResultado() {
    if (cpfsComputados.toArray().length <= 0) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
    }
    int total = cpfsComputados.toArray().length;
    for (int i = 0; i < pessoasCandidatas.toArray().length; i++) {
      double votos = pessoasCandidatas.get(i).getVotos();
      double porcentagem = votos / total * 100;
      System.out.println("Nome: " + pessoasCandidatas.get(i).getNome() + " - "
          + votos + " votos" + " ( " + Math.round((porcentagem)));
    }
    System.out.println("Total de votos: " + total);


  }

}
