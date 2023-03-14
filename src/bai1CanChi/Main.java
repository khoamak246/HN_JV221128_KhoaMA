package bai1CanChi;

import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] can = {"Canh", "Tân", "Nhâm", "Quý", "Giáp", "Ất", "Bính", "Đinh", "Mậu", "Kỷ"};
        String[] chi = {"Thân", "Dậu", "Tuất", "Hợi", "Tý", "Sửu", "Dần", "Mẹo", "Thìn", "Tỵ", "Ngọ", "Mùi"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your age: ");
        while (true) {
            int inputAge = sc.nextInt();
            int currentYear = Year.now().getValue();
            int birthYear = currentYear - inputAge;
            if (inputAge > 0) {
                System.out.println("Can chi cua ban la: " + can[birthYear % 10] + " " + chi[birthYear % 12]);
                return;
            } else {
                System.out.println("Please input again: ");
            }
        }
    }
}
