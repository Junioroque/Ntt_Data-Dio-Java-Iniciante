package fundamentos_incio_java;

import java.util.Scanner;

public class For_test {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        for(;;){
            System.out.println("Digite um nome: ");
            var name = scanner.next();

            if(name.equalsIgnoreCase("exist"))break;

            System.out.println(name);
        }
    }
}
