import java.util.ArrayList;
import java.util.Arrays;

import static javaUtils.Swap.swap;


public class HeapSort {
    public int[] HeapSort(int [] input) {
        heapSort(input,input.length);
        return input;
    }
    //调整大根堆
    public void maxHeapify(int i,int[] input,int size){
        int lchild=2*i+1;
        int rchild =2*i+2;
        int max=i;
        if(i<=size/2-1) {
            if (lchild<size&&input[lchild] > input[max])
                max = lchild;
            if (rchild<size&&input[rchild] > input[max])
                max = rchild;
            if (max != i) {
                swap(input,i,max);
                maxHeapify(max,input,size); //避免调整之后以max为父节点的子树不是堆
            }
        }
    }
    public void heapSort(int[] input,int size){
        buildHeap(input, size);
        //堆排序
        for (int i = input.length-1; i >=0; i--) {
            swap(input,0,i);
            // buildHeap(input,size-1);
            maxHeapify( 0,input,i);
        }

    }
    public void buildHeap(int[] input,int size){
        //建堆
        for (int i = size/2-1; i >=0 ; i--) {
            maxHeapify(i,input,size);
        }
    }



}