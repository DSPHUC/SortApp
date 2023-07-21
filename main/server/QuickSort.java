//package main.server;
//
//import main.utils.AppUtils;
//import main.utils.SortAlgorithm;
//
//
//public class QuickSort extends SortAlgorithm {
//    @Override
//    public int[] sort(int[] arr,int choose) {
//
//        return arr;
//    }
//
//
//    public static void quickSortUp(int[] arr, int left, int right) {
//        if (left < right) {
//            int partitionUp = partitionUp(arr, left, right);
//            quickSortUp(arr, left, partitionUp - 1);// mảng trái pivot(các phần tử nhỏ hơn pivot)
//            quickSortUp(arr, partitionUp + 1, right);// mảng phải pivot(các phần tử lớn hơn pivot)
//        }
//    }
//
//    public static int partitionUp(int[] arr, int left, int right) {
//        int pivot = arr[right];// chọn pivot ở vị trí cuối của mảng
//        int result = left - 1;
//        for (int i = left; i < right; i++) {
//            if (arr[i] <= pivot) {
//                result++;
//                AppUtils.swap(arr, result, i);
//            }
//        }
//        AppUtils.swap(arr, result + 1, right);
//        return result + 1;
//    }
//
//    public static void quickSortDown(int[] arr, int left, int right) {
//        if (left < right) {
//            int partitionDown = partitionDown(arr, left, right);
//            quickSortDown(arr, left, partitionDown - 1);// mảng trái pivot(các phần tử nhỏ hơn pivot)
//            quickSortDown(arr, partitionDown + 1, right);// mảng phải pivot(các phần tử lớn hơn pivot)
//        }
//    }
//    public static int partitionDown(int[] arr, int left, int right) {
//        int pivot = arr[right]; // chọn pivot ở vị trí cuối của mảng
//        int result = left - 1;
//        for (int i = left; i < right; i++) {
//            if (arr[i] <= pivot) {
//                result++;
//                AppUtils.swap(arr, result, i);
//            }
//        }
//        AppUtils.swap(arr, result + 1, right);
//        return result + 1;
//    }
//}