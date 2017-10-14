import static javaUtils.Swap.swap;

public class InsertSort {
    public int[] InsertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int temp = array[i];
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            if (j != i - 1)
                array[j + 1] = temp;
        }
        return array;
    }
}
