package exercicios_NTT_DATA.exercicios_Desafio;
import java.util.Scanner;
import java.util.Locale;

public class controleGastosDiarioEmUmCommerce {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Entre com um número de quantidade de compras: ");
        int purchaseCount = scanner.nextInt();

        if (purchaseCount == 0) {
            System.out.println("Nenhuma compra registrada.");
        } else {
            double totalSpent = 0.0;
            int i = 0;
            double media = 0.0;

            // TODO: Leia os valores das compras e calcule a média
            while(i < purchaseCount){
                double valor = scanner.nextDouble();
                totalSpent += valor;
                i++;
            }

            media = totalSpent / purchaseCount;

            System.out.printf("%.2f%n", totalSpent);
            System.out.printf("%.2f%n", media); // TODO: Imprima a média

        }

        scanner.close();
    }

}
