import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(" ".repeat(n-(i+1))+"*".repeat(i+1));
        }
    }
}