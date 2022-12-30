import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] isDigit = new int[10]; 
		long sum = 1;
		for(int i=0;i<3;i++) {
			sum *= Integer.parseInt(br.readLine());
		}
		int num=0;
		while(sum>0) {
			num = (int) (sum%10);
			isDigit[num]++;
			sum/=10;
		}
		for(int i=0;i<isDigit.length;i++) {
			System.out.println(isDigit[i]);
		}
    }
}