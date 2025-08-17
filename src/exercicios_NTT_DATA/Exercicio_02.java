package exercicios_NTT_DATA;

import java.util.Scanner;

/*
Escreva um código onde o usuário entra com sua altura e peso,
seja feito o calculo do seu IMC(Formula: IMC = peso/(altura * altura)),
e seja exibida a mensagem de acordo com o resultado:
-Se for menor ou igual a 18,5 "Abaixo do peso";
-Se for entre 18,6 e 24,9 "Peso ideal";
-Se for entre 25,0 e 29,9 "Levemente acima do peso";
-Se for entre 30,0 e 34,9 "Obesidade Grau I";
-Se for entre 35,0 e 39,9 "Obesidade Grau II";
-Se for maior que 40,0 "Obesiade III(Mórbida)";
 */
public class Exercicio_02 {
    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu peso: ");
        double peso = leitor.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = leitor.nextDouble();

        double imc = peso/(altura * altura);

        if(imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if(imc > 18.5 && imc < 25) {
            System.out.println("Peso ideal");
        } else if(imc > 24.9 && imc < 30) {
            System.out.println("Levemente acima do peso");
        } else if(imc > 29.9 && imc < 35) {
            System.out.println("Obesidade Grau I");
        } else if(imc > 34.9 && imc > 40) {
            System.out.println("Obesidade Grau II");
        } else {
            System.out.println("Obesidade III (Mórbida");
        }

        System.out.printf("Seu IMC é: %.2f\n", imc);
    }
}
