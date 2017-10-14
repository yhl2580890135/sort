public class ShellSort {
    public int[] ShellSort(int [] array){
        int d=array.length/2;
        while (d>=1) {
            ShellInsert(array,d);
            d = d / 2;
        }
        return array;
    }
    public void  ShellInsert(int[] array,int d) {
        for (int i = d; i < array.length; i++) {
            int j = i - d;
            int temp = array[i];
            while (j >= 0 && array[j] > temp) {
                array[j + d] = array[j];
                j-=d;
            }
            if (j != i - d)
                array[j + d] = temp;
        }
    }
}
