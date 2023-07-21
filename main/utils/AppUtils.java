package main.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class AppUtils {
    private static Scanner sc;

    static {
        sc = new Scanner(System.in);
    }

    public static String getString(String str) {
        System.out.println(str);
        return sc.nextLine();
    }

    public static int getInt(String str) {
        try {
            return Integer.parseInt(getString(str));
        } catch (Exception e) {
            System.out.println("Input invalid");
            return getInt(str);
        }
    }
    public static int getIntWithBound(String str, int begin, int end) {
        try {
            int number = getInt(str);
            if (number < begin || number > end) {
                throw new NumberFormatException(String.format("Please input number between %d and %d", begin, end));
            }
            return number;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return getIntWithBound(str, begin, end);
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int[] createArr(){
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        Random random = new Random();
        HashSet<Integer> uniqueValues = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int randomNumber;
            do {
                randomNumber = random.nextInt(100);
            } while (!uniqueValues.add(randomNumber));
            arr[i] = randomNumber;
        }
        return arr;
    }
    public static void printArr(int [] arr ){
        System.out.println("Mảng ban đầu: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
