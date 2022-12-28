import java.util.Scanner;

public class Main {
	public int newOperator(int a,int b,int c,int d,int e){
		int answer =(a*a)+(b*b)+(c*c)+(d*d)+(e*e);
		return answer%10;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		Main T = new Main();
		System.out.println(T.newOperator(a,b,c,d,e));
		
	}

}
