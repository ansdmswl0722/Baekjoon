import java.util.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] scale = new int[8]; 
		for(int i=0;i<8;i++) {
			scale[i] = sc.nextInt();
		}
		String output= "";
		for(int i=0;i<scale.length-1;i++) {
			if(scale[i]==scale[i+1]-1) output = "ascending";
			else if(scale[i]==scale[i+1]+1) output = "descending";
			else { 
				output = "mixed";
				break;	
				}
			}
		System.out.println(output);
    }
    
}