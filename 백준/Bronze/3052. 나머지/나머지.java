import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=0; HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<10;i++){
            num = Integer.parseInt(br.readLine())%42;
            set.add(num);    
        }
        System.out.println(set.size());
        
    }
}