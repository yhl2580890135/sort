import static javaUtils.Swap.swap;

public class MergeSort {
    public int[] MergeSort(int [] array,int low,int high){
        int point=(low+high)/2;
        if(low<high)
        {
            MergeSort(array,low,point);
            MergeSort(array,point+1,high);
            Merge(array,low,point,high);
        }

      return array;
    }
    public void Merge(int []array ,int low,int point,int high){
        int[] temp=new int[high-low+1];
        int i=low;
        int j=point+1;
        int k=0;
        while (i<=point&&j<=high){
            if(array[i]<array[j])
                temp[k++]=array[i++];
            else
                temp[k++]=array[j++];
        }
        while (i<=point)
        {
            temp[k++]=array[i++];
        }
        while (j<=high)
        {
            temp[k++]=array[j++];
        }
        for (int l = 0; l <temp.length ; l++) {
            array[l+low]=temp[l];//合并完的有序数组放回原位置
        }
    }
}
