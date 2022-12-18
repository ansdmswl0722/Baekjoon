import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
        	String xo = br.readLine()+" "; int sum=0,n=1;;
        	for(int j=0;j<xo.length()-1;j++) {
        		if(xo.charAt(j)=='O') {
        			sum += n; 
        			if(xo.charAt(j+1)=='O') {n++;}
        			else {n=1;}
        		}
        	} 
        	bw.write(sum+"\n");
        	bw.flush();
        }
        bw.close();
    }
}