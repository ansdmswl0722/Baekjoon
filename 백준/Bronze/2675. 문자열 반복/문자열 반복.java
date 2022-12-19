import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++) {
        	st = new StringTokenizer(br.readLine());
        	int n = Integer.parseInt(st.nextToken());
        	String str = st.nextToken();
        	for(char x:str.toCharArray()) {
        	for(int j=0;j<n;j++) bw.write(x +"");
        	}
        	bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}