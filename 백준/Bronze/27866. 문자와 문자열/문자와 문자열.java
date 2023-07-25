import java.util.*;
public class Main {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            int n = sc.nextInt();
            char answer = str.charAt(n-1);
            System.out.print(answer);
        }
    }
}
