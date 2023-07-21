package main;

import main.utils.AppUtils;

import java.util.Arrays;

public class Test {
    public static void quickSortUp(int[] arr, int left, int right) {
        if (left < right) {
            int partitionUp = partitionUp(arr, left, right);
            quickSortUp(arr, left, partitionUp - 1);// mảng trái pivot(các phần tử nhỏ hơn pivot)
            quickSortUp(arr, partitionUp + 1, right);// mảng phải pivot(các phần tử lớn hơn pivot)
        }
    }

    public static int partitionUp(int[] arr, int left, int right) {
        int pivot = arr[right];// chọn pivot ở vị trí cuối của mảng
        int result = left - 1;
        for (int i = left; i < right; i++) {
            if (arr[i] <= pivot) {
                result++;
                AppUtils.swap(arr, result, i);
            }
        }
        AppUtils.swap(arr, result + 1, right);
        return result + 1;
    }

    public static void main(String[] args) {
         long startTime = System.nanoTime();
        int[] arr = {5, 3, 2, 4, 1, 8, 7};
        quickSortUp(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        long endTime = System.nanoTime();
        long runTime = endTime - startTime;
        System.out.println("Thời gian chạy tính bằng nano giây: " + runTime);


    }
}