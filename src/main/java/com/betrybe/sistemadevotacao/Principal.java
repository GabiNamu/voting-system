package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * Classe Principal.
 */
public class Principal {
  /**
   * metodo main.
   */
  public static void main(String[] args) {
    GerenciamentoVotacao g1 = new GerenciamentoVotacao();
    Scanner scanner = new Scanner(System.in);
    int chosenNumber = 0;
    do {
      System.out.println("Cadastrar pessoa candidata?\n"
          +
          "1 - Sim\n"
          +
          "2 - Não\n"
          +
          "Entre com o número correspondente à opção desejada:");
      chosenNumber = Integer.parseInt(scanner.nextLine());
      if (chosenNumber == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String name = scanner.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        int candidateNumber = Integer.parseInt(scanner.nextLine());
        g1.cadastrarPessoaCandidata(name, candidateNumber);
      }
    } while (chosenNumber == 1);

    do {
      System.out.println("Cadastrar pessoa eleitora?\n"
          +
          "1 - Sim\n"
          +
          "2 - Não\n"
          +
          "Entre com o número correspondente à opção desejada:");
      chosenNumber = Integer.parseInt(scanner.nextLine());
      if (chosenNumber == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String name = scanner.nextLine();
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String candidateCpf = scanner.nextLine();
        g1.cadastrarPessoaEleitora(name, candidateCpf);
      }
    } while (chosenNumber == 1);

    do {
      System.out.println(" Entre com o número correspondente à opção desejada:\n"
          +
          " 1 - Votar\n"
          +
          " 2 - Resultado Parcial\n"
          +
          " 3 - Finalizar Votação");
      chosenNumber = Integer.parseInt(scanner.nextLine());
      if (chosenNumber == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scanner.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        int candidateNumber = Integer.parseInt(scanner.nextLine());
        g1.votar(cpf, candidateNumber);
      }
      if (chosenNumber == 2) {
        g1.mostrarResultado();
        chosenNumber = 1;
      }
      if (chosenNumber == 3) {
        g1.mostrarResultado();
      }
    } while (chosenNumber == 1);


  }

}
