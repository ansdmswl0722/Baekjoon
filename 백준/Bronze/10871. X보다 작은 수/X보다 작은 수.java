import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt(),X = s.nextInt(), arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = s.nextInt();
            System.out.print(X>arr[i]?arr[i]+" ":"");
        }
        
        
    }
}