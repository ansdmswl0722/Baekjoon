import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{  
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(bf.readLine()); 
            ArrayList<String[]> commend = new ArrayList<>();
            for(int i=0;i<N;i++){
                String[] word = bf.readLine().split(" ");
                commend.add(word);
            }
            Stack<String> arr = new Stack<>();
            for(String[] word : commend){
                if(word[0].equals("push")){
                    arr.push(word[1]);
                }
                if(word[0].equals("top")){
                    if(arr.isEmpty()) System.out.println(-1);
                    else System.out.println( arr.peek()); 
                }
                if(word[0].equals("pop")){
                    if(arr.isEmpty()) System.out.println(-1);
                    else System.out.println(arr.pop()); 
                }
                if(word[0].equals("size")){
                     System.out.println(arr.size());
                }
                if(word[0].equals("empty")){
                     if(arr.empty())  System.out.println(1);
                     else  System.out.println(0);
                }  
            }
        }
    }
}
