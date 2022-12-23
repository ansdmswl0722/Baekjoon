import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> submit = new ArrayList<Integer>();
		for(int i=0;i<28;i++) submit.add(Integer.parseInt(br.readLine()));
		for(int i=1;i<=30;i++){
			 if(!submit.contains(i)) {System.out.println(i);}
		}
  }
}