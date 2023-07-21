package main.server;

import main.utils.AppUtils;
import main.utils.SortAlgorithm;

import java.util.Arrays;

public class BubbleSort extends SortAlgorithm {
    @Override
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                if(compare( arr[j], arr[j -1])){
                    AppUtils.swap(arr, j, j - 1);
                }
            }
        }
        return arr;
    }
}
