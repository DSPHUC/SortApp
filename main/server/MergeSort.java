//package main.server;
//
//import main.utils.SortAlgorithm;
//
//public class MergeSort extends SortAlgorithm {
//
//    @Override
//    public int[] sort(int[] arr, int choose) {
//        return new int[0];
//    }
//
//    public static void mergeSortUp(int[] arr, int left, int right) {
//        if (left < right) {
//            int mid = (left + right) / 2;
//            mergeSortUp(arr, left, mid);
//            mergeSortUp(arr, mid + 1, right);
//            mergeUp(arr, left, mid, right);
//        }
//    }
//
//    public static void mergeUp(int[] arr, int left, int mid, int right) {
//        int leftLength = mid - left + 1;
//        int rightLength = right - mid;
//        int[] arrLeft = new int[leftLength];
//        int[] arrRight = new int[rightLength];
//        for (int i = 0; i < leftLength; i++) {
//            arrLeft[i] = arr[left + i];
//        }
//        for (int i = 0; i < rightLength; i++) {
//            arrRight[i] = arr[mid + 1 + i];
//        }
//        int i = 0;// vị trí phần tử đầu tiên của mảng trái
//        int j = 0;// vị trí phần tử đầu tiên của mảng phải
//        int k = left;
//        while (i < leftLength && j < rightLength) {
//            if (arrLeft[i] < arrRight[j]) {
//                arr[k] = arrLeft[i];
//                i++;
//            } else {
//                arr[k] = arrRight[j];
//                j++;
//            }
//            k++;
//        }
//        while (i < leftLength) {
//            arr[k] = arrLeft[i];
//            i++;
//            k++;
//        }
//        while (j < rightLength) {
//            arr[k] = arrRight[j];
//            j++;
//            k++;
//        }
//    }
//
//    public static void mergeSortDown(int[] arr, int left, int right) {
//        if (left < right) {
//            int mid = (left + right) / 2;
//            mergeSortDown(arr, left, mid);
//            mergeSortDown(arr, mid + 1, right);
//            mergeUpDown(arr, left, mid, right);
//        }
//    }
//
//    public static void mergeUpDown(int[] arr, int left, int mid, int right) {
//        int leftLength = mid - left + 1;
//        int rightLength = right - mid;
//        int[] arrLeft = new int[leftLength];
//        int[] arrRight = new int[rightLength];
//        for (int i = 0; i < leftLength; i++) {
//            arrLeft[i] = arr[left + i];
//        }
//        for (int i = 0; i < rightLength; i++) {
//            arrRight[i] = arr[mid + 1 + i];
//        }
//        int i = 0;// vị trí phần tử đầu tiên của mảng trái
//        int j = 0;// vị trí phần tử đầu tiên của mảng phải
//        int k = left;
//        while (i < leftLength && j < rightLength) {
//            if (arrLeft[i] < arrRight[j]) {
//                arr[k] = arrLeft[i];
//                i++;
//            } else {
//                arr[k] = arrRight[j];
//                j++;
//            }
//            k++;
//        }
//        while (i < leftLength) {
//            arr[k] = arrLeft[i];
//            i++;
//            k++;
//        }
//        while (j < rightLength) {
//            arr[k] = arrRight[j];
//            j++;
//            k++;
//        }
//    }
//}
