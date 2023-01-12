import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            String str = "";

            while((str = br.readLine()) != null)
            {
                String past = str;
                if(str.equals("0")){
                	break;
                }

                boolean palindrome = true;
                for(int i=0;i<str.length()/2+1;i++) {
                	if(str.charAt(i)!=str.charAt(str.length()-i-1)) palindrome = false;
                }
                if(palindrome) sb.append("yes").append("\n");
                else sb.append("no").append("\n");
                
            }
            System.out.println(sb);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
	}

}