import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();int m=0;
        for(int i=1;i<n+1;i++){m+=i;}
        System.out.print(m);
    }
}