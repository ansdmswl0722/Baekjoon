import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
        	st = new StringTokenizer(br.readLine());
        	int n = Integer.parseInt(st.nextToken());
        	double sum=0,avg=0; int[] arr = new int[n]; 
        	for(int j=0;j<n;j++) {
        		arr[j]= Integer.valueOf(st.nextToken());
        		sum += arr[j];
        	}
        	for(int k : arr) {
        		if(k>(double)sum/n) avg++;
        	}
        	
        	bw.write(String.format("%.3f",(double)avg*100/n)+"%\n");
        }
        bw.flush();
        bw.close();
    }
}