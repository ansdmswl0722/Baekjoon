import java.util.Scanner;
public class Test {
    long sum(int[] a) {
		long answer =0;
		for(int i=0;i<a.length;i++) {
			answer+= a[i];
		}
		return answer;
    }


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		Test T = new Test();
		System.out.println(T.sum(a));
		
    }

}