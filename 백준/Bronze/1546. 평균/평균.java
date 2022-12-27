import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),arr[] = new int[n],max=1;
        double newsum=0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            max = max>arr[i]?max:arr[i];
            }
        for(int i :arr) {newsum+= (double)i*100/max;}
        System.out.println(newsum/n);
    }
}