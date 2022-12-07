import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int r = sc.nextInt();int t=0;
        for(int a: arr){
            if(a == r) {t+=1;}
        }System.out.print(t);
    }
}