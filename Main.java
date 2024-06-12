import java.util.Scanner;
import java.util.Random; //VAI AJUDAR COM NUMEROS ALEATORIOS

class Main {
  public static void main(String[] args) {

    // AULA DE ESTRUTURA CONDICIONAL SIMPLES 01/06
    // int a, b;
    // a = 4;
    // b = 8;
    // System.out.println(a > b);
    // System.out.println(a > b && b == 8);
    // System.out.println(a > b || b == 8);

    // AULA DE ESTRUTURA CONDICIONAL 02/06 (SIMPLES)
    // int nota = 2;//PODE DEFINIR UM VALOR PARA A VARIAVEL NA DECLARAÇÃO DELA
    // if(nota >= 5){
    // System.out.println("Aprovado");
    // }else {
    // System.out.println("Reprovado");
    // }

    // AULA DE ESTRUTURA CONDICIONAL 03/06 (COMPOSTA)
    // int nota = 2;
    // if(nota >= 5){
    // System.out.println("Aprovado");
    // }else {
    // System.out.println("Reprovado");
    // }

    // AULA DE ESTRUTURA CONDICIONAL 04/06 (ANINHADA)
    // int nota = 6;
    // if(nota >= 5){
    // System.out.println("Aprovado");
    // }else if(nota >= 3 && nota < 5){
    // System.out.println("Recuperação");
    // }else {
    // System.out.println("Reprovado");
    // }

    // ESTRUTURA DE MULTIPLA ESCOLHA 05/06
    // Scanner entrada = new Scanner(System.in);
    // System.out.println("Digite uma opção: ");
    // System.out.println("1 - Cadastrar aluno");
    // System.out.println("2 - Cadastrar notas");
    // System.out.println("3 - Listar alunos e notas");

    // int numero = entrada.nextInt();

    // switch (numero){
    // case 1:
    // System.out.println("Vamos cadastrar aluno");
    // break;
    // case 2:
    // System.out.println("Vamos cadastrar notas");
    // break;
    // case 3:
    // System.out.println("Listar alunos e notas");
    // break;
    // default:
    // System.out.println("Opção inválida");
    // break;
    // }

    // AULA DE ESTRUTURA CONDICIONAL 06/06 - EXEMPLO PRÁTICO - JOGO ADIVINHAÇÃO
    // Random gerador = new Random();
    // int x = gerador.nextInt(100);//DEFININDO O RANGE QUE O NUMERO ALEATORIO PODE
    // SER

    // Scanner entrada = new Scanner(System.in);
    // System.out.println("Adivinhe o número que estou pensando");
    // int numero = entrada.nextInt();
    // if (numero == x) {
    // System.out.println("Parabéns, você acertou!");
    // } else {
    // System.out.println("Você errou! Eu pensei no " + x);
    // }
    // entrada.close();

    // DESAFIO 02 - FAZER UMA JOGO DE ADIVINHAÇÃO COM 3 NÍVEIS DE DIFICULDADE
    // (FACIL, MÉDIO E DIFÍCIL)
    // Random gerador = new Random();
    // Scanner entrada = new Scanner(System.in);

    // int x = 0;
    // System.out.println("Digite uma dificuldade: ");
    // System.out.println("1 - Fácil");
    // System.out.println("2 - Médio");
    // System.out.println("3 - Difícil");
    // System.out.println("4 - Super-difícil");
    // System.out.println("5 - Deus");

    // int dificuldade = entrada.nextInt();

    // System.out.print("Adivinhe o número que estou pensando: ");
    // int numero = entrada.nextInt();
    // switch (dificuldade) {
    //   case 1:
    //     x = gerador.nextInt(10);
    //     break;
    //   case 2:
    //     x = gerador.nextInt(30);
    //     break;
    //   case 3:
    //     x = gerador.nextInt(100);
    //     break;
    //   case 4:
    //     x = gerador.nextInt(500);
    //     break;
    //   case 5:
    //     x = gerador.nextInt(1000);
    //     break;
    //   default:
    //     System.out.println("Opção inválida");
    //     break;
    // }

    // if (numero == x) {
    //   System.out.println("Parabéns, você acertou!");
    // } else {
    //   System.out.println("Você errou! Eu pensei no " + x);
    // }
    // entrada.close();
  }
}