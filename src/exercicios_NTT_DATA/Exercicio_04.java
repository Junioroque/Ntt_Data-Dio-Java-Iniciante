package exercicios_NTT_DATA;

import java.util.Scanner;

/*
Escreva um código onde o usúario informa um número inicial,
posteriormente irá informar outros N números, a execução do
código irá continuar até que o número informado dividido pelo
primeiro número tenha resto diferente de 0 na divisão, números
menores que o primeiro número devem ser ignorados.
 */
public class Exercicio_04 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número: ");
        var number = leitor.nextInt();

        while(true) {
            System.out.println("Informe o número para verificar: ");
            var toVerify = leitor.nextInt();

            if(toVerify < number) {
                System.out.printf("Informe um número maior que %s: ", number);
                continue;
            }
            var result = toVerify % number;
            System.out.printf("%s %% %s = %s  \n", toVerify, number, result);
            if(result != 0) break;
        }
    }
}
