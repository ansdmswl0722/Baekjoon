import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
             String[] commend =bf.readLine().split(" ");
             if(commend[0].equals("1")){
                stack.push(Integer.parseInt(commend[1]));
            }
            if(commend[0].equals("2")){
                if(stack.empty()) bw.write(-1+"\n");
                else bw.write(stack.pop()+"\n");
            }
            if(commend[0].equals("3")){
                bw.write(stack.size()+"\n");
            }
            if(commend[0].equals("4")){
               if(stack.empty()) bw.write(1+"\n");
               else bw.write(0+"\n");
            }
            if(commend[0].equals("5")){
                if(stack.empty()) bw.write(-1+"\n");
                else bw.write(stack.peek()+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}