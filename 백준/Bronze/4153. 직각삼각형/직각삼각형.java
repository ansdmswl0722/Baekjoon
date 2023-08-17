import java.util.*;

public class Main {
    public static void main(String[] args) {  
        try (Scanner sc = new Scanner(System.in)) {
           while(true){
               int a = sc.nextInt();
               int b = sc.nextInt();
               int c = sc.nextInt();
               String answer = "wrong";
               if(a==0 && b==0 && c==0) break;
               if(a*a+b*b==c*c) answer="right";
               if(b*b+c*c==a*a) answer="right";
               if(a*a+c*c==b*b) answer="right";
               System.out.println(answer);
           }
        }
    }
}
