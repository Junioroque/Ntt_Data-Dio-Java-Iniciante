package exercicios_NTT_DATA;

import java.util.Scanner;

/*
Escreva um código que o usuário entre com primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar,
com isso o código deve informar todos os números pares e ímpares (de acordo com a seleção inicial) no intervalo de números informados,
incluindo os números informados e em ordem decrescente;
 */
public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int primeiro = 0;
        int segundo = 0;
        String opcao = "";
        int x = 0;

        System.out.println("Digite um numero: ");
        primeiro = leitor.nextInt();

        System.out.println("Digite outro numero maior que o primeiro: ");
        segundo = leitor.nextInt();



        if(segundo > primeiro) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Par");
            System.out.println("2 - Ímpar");
            x = leitor.nextInt();

            if (x == 1) {
                opcao = "Par";
                for (int i = segundo; i >= primeiro; i--) {
                    if (i % 2 == 0) {
                        System.out.print(i);
                        System.out.print(" ");
                    }
                }

            } else if (x == 2) {
                opcao = "Ímpar";

                for (int i = segundo; i >= primeiro; i--) {
                    if (i % 2 != 0) {
                        System.out.print(i);
                        System.out.print(" ");
                    }
                }
            } else {
                System.out.println("Opção inválida.");
                return;
            }
        } else {
            System.out.println("O segundo número deve ser maior que o primeiro.");

        }


            System.out.println();




    }


}