import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int i=0,j=0,arr[]= new int[9],max = 0; 
      for(;i<9;i++){arr[i]=Integer.parseInt(br.readLine());max=max>arr[i]?max:arr[i];}
      for(int n : arr) {j++;if(n==max)break;} 
      System.out.print(max +"\n" + j);
    }
}