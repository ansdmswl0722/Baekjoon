import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(),m= sc.nextInt(),A[][] = new int[n][m],B[][] = new int[n][m];
        double newsum=0;
        for(int i=0;i<n;i++){
        	for(int j=0;j<m;j++)A[i][j] = sc.nextInt();
            }
        for(int i=0;i<n;i++){
        	for(int j=0;j<m;j++)B[i][j] = sc.nextInt();
            }
        for(int i=0;i<n;i++){
        	for(int j=0;j<m;j++)
        		System.out.print(A[i][j]+B[i][j]+" ");
        	System.out.println("");
            }
    }
}