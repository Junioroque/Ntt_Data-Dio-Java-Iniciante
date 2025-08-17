package fundamentos_incio_java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);


        
        System.out.println("Informe o primeiro numero: ");
        var number = scanner.nextInt();

        while (true) {
            System.out.println("Inforne o numero para verificar");

            var toVerify = scanner.nextInt();
            if(toVerify < number) {
                System.out.printf("Informe um numero maior que %s", number);
                continue;
            }
            
        }

    }
}