import java.util.Scanner;

public class Main {
	public long newOperator(long a,long b){
		long answer =(a+b)*(a-b);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		Main T = new Main();
		System.out.println(T.newOperator(a,b));
		
	}

}