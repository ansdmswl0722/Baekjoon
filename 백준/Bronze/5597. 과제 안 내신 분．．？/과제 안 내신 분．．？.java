import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean submit[] = new boolean[31]; int num =0;
        for(int i=0;i<28;i++) { 
        	num = Integer.parseInt(br.readLine());
        	submit[num] = true;
        }
        for(int i=1;i<submit.length;i++) {
        	if(!submit[i]) System.out.println(i);
        }
  }
}