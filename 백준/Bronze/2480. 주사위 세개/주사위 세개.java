import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();int b=sc.nextInt();int c=sc.nextInt();int r=0;
        if(a==b&&b==c){r=10000+a*1000;}
        else if(a!=b && b!=c && c!=a){
            if(a>b){r=a;}else{r=b;}
            if(c>r){r=c;}
            r*=100;
        }
        else{
            if(a==b || c==a){r=1000+a*100;}
            else if(b==c){r=1000+b*100;}
        }
        System.out.print(r);
    }
}