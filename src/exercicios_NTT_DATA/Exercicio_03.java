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

        while (segundo > primeiro) {

            for (int i = segundo; i >= primeiro; i--) {
                if (opcao.equalsIgnoreCase("Par")) {
                    if(i % 2 == 0) {
                        System.out.println(i);
                    } else if (opcao.equalsIgnoreCase("Impar")) {
                        if(i % 2 != 0) {
                            System.out.println(i);
                        }
                    } else {
                        System.out.println("Opção inválida. Digite 'Par' ou 'Impar'.");
                        break;
                    }

                }
            }

            x++;
        }


    }
}
