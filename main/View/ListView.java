package main.View;

import java.util.Arrays;
import java.util.List;

public class ListView {
    public static List<String> upDownList = Arrays.asList("\nWelcome to App"
            , "1. Sort up ascending", "2. Sort down ascending");
    public static List<String> sortList = Arrays.asList("\nMenu Sort",
            "1.  Sắp xếp nổi bọt (Bubble Sort)", "2.  Sắp xếp chọn (Selection Sort)",
            "3.  Sắp xếp chèn (Insertion Sort)", "4.  Sắp xếp trộn (Merge Sort)",
            "5.  Sắp xếp nhanh (Quick Sort)", "6.  Sắp xếp Shell (Shell Sort)",
            "7.  Sắp xếp Radix (Radix Sort)", "8.  Sắp xếp Bucket (Bucket Sort)",
            "9.  Sắp xếp Counting (Counting Sort)", "10. Sắp xếp Tim (Tim Sort)",
            "11. Sắp xếp Flash (Flash Sort)", "12. Sắp xếp Bogo (Bogo Sort)",
            "13. Sắp xếp Cocktail (Cocktail Sort)", "14. Sắp xếp Comb (Comb Sort)"
    );

    public static void printMenu(List<String> menu) {
        for (String str : menu) {
            System.out.println(str);
        }
    }
}
