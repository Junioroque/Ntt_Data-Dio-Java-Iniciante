package exercicios_NTT_DATA;
/*
Escreva um código onde o usuário entra com
um número e seja gerada a tabuada de 1 até 10 desse número;
 */
import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para gera a tabuada de 1 á 10: ");
        int number = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            int resultado = number * i;
            System.out.println(number + " x " + i + " = " + resultado );

        }

    }
}
