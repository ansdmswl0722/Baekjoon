import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[10],num=0; HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<10;i++){
            arr[i] = Integer.parseInt(br.readLine())%42;
            set.add(arr[i]);    
        }
        System.out.println(set.size());
        
    }
}