package main.utils;

public abstract class SortAlgorithm {
     ESort sortBy;
     public void setSortBy( int choose) {
         if(choose == 1) {
             sortBy = ESort.ASC;
         } else{
             sortBy = ESort.DESC;
         }

     }
    public abstract int[] sort(int[] arr);

    protected boolean compare( int num1, int num2){
        if(sortBy == ESort.ASC){
            return num1 < num2;
        }
        return num1 >=num2;
    }
    protected boolean compare2()
}
