package main.server;

import main.utils.SortAlgorithm;

public class InsertionSort extends SortAlgorithm {
    @Override
    public int[] sort(int[] arr-) {
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int pos = i;
            switch (choose) {
                case 1:
                    while (pos > 0 && x < arr[pos - 1]) {
                        arr[pos] = arr[pos - 1];
                        pos--;
                    }
                    break;
                case 2:
                    while (pos > 0 && x > arr[pos - 1]) {
                        arr[pos] = arr[pos - 1];
                        pos--;
                    }
                    break;
            }
            arr[pos] = x;
        }
        return arr;
    }
}
