import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		int[] alphaCnt = new int[26]; 
		for(char x : str.toCharArray()) {
			int n = x-65;
			alphaCnt[n]++;
		}
		int max=0;
		for(int i=0;i<alphaCnt.length;i++) {
			if(max<alphaCnt[i]) max = alphaCnt[i];
		}
		int more = 0;
		for(int n : alphaCnt) {
			if(n==max) more++;
		}
		if(more>1) System.out.println("?");
		else {
			for(int i=0;i<alphaCnt.length;i++) {
				if(alphaCnt[i]==max) System.out.println((char)(i+65));
			}
		}
    }
}