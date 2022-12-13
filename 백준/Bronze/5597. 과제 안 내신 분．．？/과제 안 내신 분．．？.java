import java.util.*;
import java.io.*;
import java.util.stream.IntStream;
public class Main{
    public static int i=0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int submit[] = new int[28];
        for(int i=0;i<28;i++) submit[i] = Integer.parseInt(br.readLine());
        for(i=1;i<=30;i++){
         if(!IntStream.of(submit).anyMatch(x -> x == i)){System.out.println(i);}
    }
  }
}