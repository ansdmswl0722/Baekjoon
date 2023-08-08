import java.util.*;

public class Main {
    public static int getSolution(int startrow, int startcol, String[] board){
        String[] white = {"WBWBWBWB", "BWBWBWBW"}; 
        int cnt = 0;
        for(int i=startrow;i<startrow+8;i++){
            for(int j=0;j<8;j++){
                if(board[i].charAt(j+startcol)!=white[i%2].charAt(j)) cnt++;
            }
        }
        return Math.min(cnt, 64-cnt);
    }
    public static void main(String[] args) {  
        // 4. 전체 최적의 값과 비교하여 갱신하기 
        try (Scanner sc = new Scanner(System.in)) {
            // 1. input 받기 
            int row = sc.nextInt();
            int col = sc.nextInt();
            sc.nextLine();
            String[] board = new String[row];
            for(int i=0; i<row; i++)
                board[i]=sc.nextLine();
            // 2. 체스판 자르기
            int sol = Integer.MAX_VALUE;
            for(int i=0;i<=row-8;i++){
                for(int j=0;j<=col-8;j++){
                    // 3. 현 체스판의 최소비용 구하기
                    int curSol = getSolution(i,j,board);
                     // 4. 전체 최적의 값과 비교하여 갱신하기 
                     if(curSol<sol) sol=curSol;
                }
            }
            System.out.println(sol);
        }
    }
    
}
