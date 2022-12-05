import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        long x=s.nextLong(); int n=s.nextInt();long sum=0;
        for(int i=0;i<n;i++){
            int a = s.nextInt();int b = s.nextInt();
            sum += a*b;
        }
        System.out.print(x==sum?"Yes":"No");
        
    }
}