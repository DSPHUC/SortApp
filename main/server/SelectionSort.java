//package main.server;
//
//import main.utils.AppUtils;
//import main.utils.SortAlgorithm;
//
//public class SelectionSort extends SortAlgorithm {
//    @Override
//    public int[] sort(int[] arr, int choose) {
//        for (int i = 0; i < arr.length; i++) {
//            int check = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                switch (choose) {
//                    case 1://tăng dần
//                        if (arr[check] > arr[j]) {
//                            check = j;
//                        }
//                        break;
//                    case 2://giảm dần
//                        if (arr[check] < arr[j]) {
//                            check = j;
//                        }
//                        break;
//                }
//            }
//            AppUtils.swap(arr, i, check);
//        }
//        return arr;
//    }
//}
//
