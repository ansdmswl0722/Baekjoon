import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            int money = Integer.parseInt(bf.readLine());
            if(money!= 0) stack.add(money);
            else stack.pop();
        }
        int sum=0;
        for(int num: stack){
            sum+=num;
        }
        System.out.println(sum);
    }
}