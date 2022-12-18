import java.util.*;
public class Main{
    public static void main(String[] args){
        		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(int i=0;i<str.length();i++) {
			if(Character.isLowerCase(str.charAt(i))) System.out.print(Character.toUpperCase(str.charAt(i)));
			else System.out.print(Character.toLowerCase(str.charAt(i)));
		}
    }
}