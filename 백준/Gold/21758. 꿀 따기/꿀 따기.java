import java.io.*;
import java.util.*;
public class Main {
    static int honey;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
    
        int[] place = new int[n];
        int[] rvs_place = new int[n];
        
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++,tokenizer.hasMoreTokens()) {
            place[i] = Integer.parseInt(tokenizer.nextToken());
            rvs_place[n - i - 1] = place[i];
            honey += place[i];
        }

        int sum=0;
        int b=place[0];
        for(int i=1;i<n;i++){
            int a = honey - place[0]- place[i];
            b += place[i];
            sum = Math.max(sum,a+honey-b);
        }

        for(int i=1;i<n-1;i++){
            int a = honey - place[0]-place[n-1]+ place[i];
            sum= Math.max(sum,a);
        }

        b = rvs_place[0];
        for(int i=1;i<n;i++){
            int a = honey - rvs_place[0]- rvs_place[i];
            b += rvs_place[i];
            sum = Math.max(sum,a+honey-b);
        }
        bw.write(sum+ "");
        bw.flush();
        br.close();
        bw.close();
    }
}
