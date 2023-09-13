import java.util.*;

public class Main {
    public static void main(String[] args) {  
        try (Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt(); 
            for(int i=0;i<T;i++){
                int h = sc.nextInt();
                int w = sc.nextInt();
                int n = sc.nextInt();

                int room=0;
                int floor=0;
                
                if(n%h==0){
                    room = n/h;
                    floor = h;
                }else{
                    room = n/h +1;
                    floor = n%h;
                }
                System.out.println(floor*100+room);
            }
        }
    }
}
