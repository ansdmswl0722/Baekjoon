import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = "";
            while((str = br.readLine()) != null)
            {
                String past = str;
                StringBuilder sb = new StringBuilder(str);
                if(str.equals("0")){
                	System.out.println("");
                }
                else if(past.equals(sb.reverse().toString())) {
                	System.out.println("yes");
                }
                else{
                	System.out.println("no");
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
	}

}