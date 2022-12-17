import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = sc.next();
        for(int i=97;i<=122;i++) {
        	char a = (char)i;
        	bw.write(str.indexOf(a) + " ");
        }
        bw.flush();
        bw.close();
    }
}