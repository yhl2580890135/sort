import static javaUtils.Swap.swap;

public class SelectSort {
    public int[] SelectSort(int [] array){
        int k;
        for (int i = 0; i <array.length-1 ; i++) {
            k=i;
            for (int j = i+1; j <array.length ; j++) {
                if(array[j]<array[k])
                    k=j;
            }
           if(k!=i)
           {
             swap(array,k,i);
           }
        }

        return array;
        }
}
