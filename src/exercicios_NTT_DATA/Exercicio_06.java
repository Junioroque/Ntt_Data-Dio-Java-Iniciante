package exercicios_NTT_DATA;

import java.util.Scanner;

public class Exercicio_06 {

    //OrderProcessor

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double itemsValue = scanner.nextDouble(); //valor total da compra
        double shipping = scanner.nextDouble(); //valor do frete
        String firstPurchase = scanner.next(); //primeira compra do cliente

        double discount = 0;
        double discountedValue = 0;

        if (firstPurchase.equals("true") && itemsValue >= 200.0) {
            discount = itemsValue * 0.05;
            discountedValue = itemsValue - discount;
            System.out.printf("%.2f\n", discountedValue);
        } else if (firstPurchase.equals("false") && itemsValue >= 200.0) {
            ;
            discountedValue = itemsValue;
            System.out.printf("%.2f\n", discountedValue);
        } else if (firstPurchase.equals("true") && itemsValue < 200.0) {
            discount = itemsValue * 0.05;
            discountedValue = itemsValue - discount + shipping;
            System.out.printf("%.2f\n", discountedValue);
        } else {
            discountedValue = itemsValue + shipping;
            System.out.printf("%.2f\n", discountedValue);
        }
    }
}
