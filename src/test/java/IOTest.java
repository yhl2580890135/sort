import java.io.*;

public class IOTest {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("./f.txt"), "GBK"));
        for (int i = 0; i < 100; i++) {
            bw.write(i);
        }
        bw.close();
        BufferedReader br = new BufferedReader(new FileReader("./f.txt"));
        System.out.println(br.read());

    }




}
