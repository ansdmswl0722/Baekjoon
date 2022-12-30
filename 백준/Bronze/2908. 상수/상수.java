import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		
		int A= sc.nextInt();
		int B= sc.nextInt();
			
		int newA =0;
		int newB =0;
		
		for(int i=0;i<3;i++) {
			newA = newA*10 + A%10;
			A/=10;
			newB = newB*10 + B%10;
			B/=10;
		}
		System.out.println(newA>newB?newA:newB);
    }
}