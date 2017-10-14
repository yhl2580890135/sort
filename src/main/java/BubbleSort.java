import static javaUtils.Swap.swap;

public class BubbleSort {
    int countOfCompare=0;
    int countOfMove=0;
    public int[] BubbleSort(int [] array){
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = 0; j <array.length-i-1 ; j++) {
                countOfCompare++;
                if(array[j]>array[j+1]) {
                    countOfMove++;
                   swap(array,j,j+1);
                }
            }
}
  return array;
    }
}
