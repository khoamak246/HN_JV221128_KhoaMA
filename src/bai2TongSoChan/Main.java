package bai2TongSoChan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your number: ");
        while (true) {
            int inputNumber = sc.nextInt();
            int totalEven = 0;
            if (inputNumber > 0) {
                for (int i = 1; i < inputNumber; i++) {
                    if (i % 2 == 0) {
                        // Print even number to check
                        // System.out.println(i);
                        totalEven += i;
                    }
                }
                System.out.println("Tong cac so chan trong khoang tu 0 den " + inputNumber + " la: " + totalEven);
                return;
            } else {
                System.out.println("Please input again: ");
            }
        }
    }
}
