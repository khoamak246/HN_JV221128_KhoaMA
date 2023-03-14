package bai3ThaoTacRandomInputArr;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] rndIntArr = new int[50];
        for (int i = 0; i < rndIntArr.length; i++) {
            rndIntArr[i] = (int) Math.floor(new Random().nextInt(100));
        }
        printRange("PRINT ARR");
        System.out.println("Mang cua ban la: ");
        System.out.println(Arrays.toString(rndIntArr));

        // Min Max
        printRange("PRINT MAX AND MIN");
        System.out.println("So lon nhat trong mang la : " + Arrays.stream(rndIntArr).max().getAsInt());
        System.out.println("So be nhat trong mang la: " + Arrays.stream(rndIntArr).min().getAsInt());

        // Sort Arr
        printRange("PRINT SORT ARR");
        System.out.println("Mang cua ban sau khi sap xep tang dan la:");
        Arrays.sort(rndIntArr);
        System.out.println(Arrays.toString(rndIntArr));

        // Prime Number in arr
        printRange("PRINT COUNT PRIME NUMBER");
        int count = 0;
        for (int i = 0; i < rndIntArr.length; i++) {
            if (rndIntArr[i] == 2) {
                count++;
                i++;
            } else if (rndIntArr[i] > 0) {
                boolean check = true;
                for (int j = 2; j < rndIntArr[i]; j++) {
                    if (rndIntArr[i] % j == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    // Print prime number to check
                    // System.out.println(rndIntArr[i]);
                    count++;
                }
            }

        }

        System.out.println("So luong so nguyen to xuat hien trong mang cua ban la: " + count);
    }

    public static void printRange(String value) {
        System.out.println();
        System.out.println("--------------| " + value + " |--------------");
        System.out.println();
    }
}
