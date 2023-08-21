import java.util.*;

public class Main {
    public static void main(String[] args) {  
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int cnt=0; 
            for(int i=0;i<n;i++){
                int num = sc.nextInt();
                Boolean answer=true;
                if(num==1) continue;
                for(int j=2;j<num;j++){
                    if(num%j==0) answer=false;
                }
                if(answer) cnt++;
            }
            System.out.println(cnt);
        }
    }
}
