import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),sum=0; String s = sc.next();
        for(int i=0;i<n;i++) {
        	char c=s.charAt(i);
        	sum += c-48;
        }
        System.out.println(sum);
            
    }
}