import org.junit.Assert;

import java.io.*;
import java.util.Arrays;
import java.util.Random;


public class Test {

    public static void main(String[] args) throws IOException {
        int j=0;
        int dataScale=100;
        int [] array=new int[dataScale];
        int [] result=new int[dataScale];
        File f=new File("F:/data.txt");
        FileOutputStream fout =new FileOutputStream(f);
       // BufferedOutputStream bos = new BufferedOutputStream(fout);
       DataOutputStream dataOutputStream=new DataOutputStream(fout);
        //BufferedWriter bw =new BufferedWriter();
        Random random= new Random();
            for (int i = 0; i <dataScale ; i++)
                dataOutputStream.write(random.nextInt(100));
        fout.close();
        //bos.close();
        DataInputStream dataInputStream =new DataInputStream(new FileInputStream(f));
        FileInputStream fileInputStream=new FileInputStream(f);
       // BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
        while(dataInputStream.available()>0)
         {
             array[j]=dataInputStream.read();
             j++;
        }
        dataInputStream.close();
        result=array.clone();
        Arrays.sort(result);
        Assert.assertArrayEquals(result,new BubbleSort().BubbleSort(array));
        Assert.assertArrayEquals(result,new SelectSort().SelectSort(array));
        Assert.assertArrayEquals(result,new HeapSort().HeapSort(array));
        Assert.assertArrayEquals(result,new InsertSort().InsertSort(array));
        Assert.assertArrayEquals(result,new MergeSort().MergeSort(array,0,array.length-1));
        Assert.assertArrayEquals(result,new ShellSort().ShellSort(array));

        File f1=new File("F:/dataaftersort.txt");
        FileOutputStream fout1 =new FileOutputStream(f1);
        DataOutputStream dataOutputStream1=new DataOutputStream(fout1);
        for (int i = 0; i <dataScale ; i++) {
            dataOutputStream1.write(result[i]);
       }
        dataOutputStream1.close();
    }
    }

