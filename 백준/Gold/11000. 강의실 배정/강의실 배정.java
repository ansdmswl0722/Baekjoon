import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
    
        List<List<Integer>> times = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<String> line =Arrays.asList(br.readLine().split(" "));
            List<Integer> integerLine = new ArrayList<>();
            for (String str : line) {
                integerLine.add(Integer.parseInt(str));
            }
            times.add(integerLine);
        }
        Collections.sort(times, (o1, o2)-> o1.get(0).compareTo(o2.get(0)));
        PriorityQueue<Integer> room = new PriorityQueue<>();
        room.add(times.get(0).get(0));

        for(int i=0;i<n;i++){
            int start = times.get(i).get(0);
            if(start < room.peek()){
                room.add(times.get(i).get(1));
            }else{
                room.poll();
                room.add(times.get(i).get(1));
            }
        }
        System.out.println(room.size());
    }
}
