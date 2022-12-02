import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while(true){
            int a=s.nextInt();int b=s.nextInt();
            String re = a>b?"Yes":"No";
            if(a==0&&b==0) break;
            System.out.println(re);
        }
    }
}