import java.time.*;
public class Main{
    public static void main(String[] args){
        // now() : 현재 시스템 시간을 yyyy-mm-dd 형태로 생성한다.
        LocalDate date = LocalDate.now();
        System.out.print(date);
    }
}
