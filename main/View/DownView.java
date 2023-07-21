package main.View;

import main.server.*;
import main.utils.*;

import static main.View.UpDownView.upDownMenu;


public class DownView {
    public static void downMenu(int choose) {
        try {
            int[] arr = AppUtils.createArr();
            AppUtils.printArr(arr);
            ListView.printMenu(ListView.sortList);
            int choice = AppUtils.getIntWithBound("Input choice", 0, 14);
            SortAlgorithm sorter = null;
            switch (choice) {
                case 1:
                    System.out.println("Thuật toán sắp xếp nổi bọt ");
                    sorter = new BubbleSort();
                    sorter.sort(new int[]{});

                    break;
                case 2:
                    System.out.println("Thuật toán sắp xếp chọn ");
                    sorter = new InsertionSort();
                    sorter.sort(new int[]{});

                    break;
                case 3:
                    System.out.println("Thuật toán sắp xếp chèn  ");
//                    sorter = new SelectionSort();
                    sorter.sort(new int[]{});

                    break;
                case 4:
                    System.out.println("Thuật toán sắp xếp trộn  ");
                    sorter = new MergeSort();
                    sorter.sort(new int[]{});

                    break;
                case 5:
                    System.out.println("Thuật toán sắp xếp nhanh  ");
                    sorter.sort(new int[]{});
                    sorter = new QuickSort();
                    break;
                case 6:
                    System.out.println("Thuật toán sắp xếp Shell  ");
                    //                  sorter = new   ShellSortUp();
                    sorter.sort(new int[]{});

                    break;
                case 7:
                    System.out.println("Thuật toán sắp xếp Radix  ");
                    //                  sorter = new   RadixSortUp();
                    sorter.sort(new int[]{});

                    break;
                case 8:
                    System.out.println("Thuật toán sắp xếp Bucket  ");
                    //                  sorter = new   BucketSortUp();
                    sorter.sort(new int[]{});

                    break;
                case 9:
                    System.out.println("Thuật toán sắp xếp Counting  ");
                    //                  sorter = new   CountingSortUp();
                    sorter.sort(new int[]{});

                    break;
                case 10:
                    System.out.println("Thuật toán sắp xếp Tim  ");
                    sorter.sort(new int[]{});
//                  sorter = new   TimSortUp();
                    break;
                case 11:
                    System.out.println("Thuật toán sắp xếp Flash  ");
                    //                  sorter = new   FlashSortUp();
                    sorter.sort(new int[]{});

                    break;
                case 12:
                    System.out.println("Thuật toán sắp xếp Bogo  ");
                    //                   sorter = new  BogoSortUp();
                    sorter.sort(new int[]{});

                    break;
                case 13:
                    System.out.println("Thuật toán sắp xếp Cocktail   ");
                    //                   sorter = new  CocktailSortUp();
                    sorter.sort(new int[]{});

                    break;
                case 14:
                    System.out.println("Thuật toán sắp xếp Cocktail  ");
                    sorter.sort(new int[]{});
//                   sorter = new  CombSortUp();
                    break;
                case 0:
                    upDownMenu();
                    break;
            }
            int sortTypeValue = (choice == 2) ? 2 : -1;
//            sorter.sortDescending(arr);
            sorter.sort(arr);
            System.out.println("Mảng sau khi sắp xếp:");
            for (int number : arr) {
                System.out.print(number + " ");
            }
            upDownMenu();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            downMenu(choose);
        }
    }


}
