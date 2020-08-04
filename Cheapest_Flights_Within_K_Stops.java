import java.util.*;


//There are n cities connected by m flights. Each flight starts from city u and arrives at v with a price w.
//
//        Now given all the cities and flights, together with starting city src and the destination dst, your task is to find the cheapest price from src to dst with up to k stops. If there is no such route, output -1.


public class Cheapest_Flights_Within_K_Stops {

    public static void main(String[] args) {

        int n = 5;
        int[][] edges = {{1,2,10},{2,0,7},{1,3,8},{4,0,10},{3,4,2},{4,2,10},{0,3,3},{3,1,6},{2,4,5}};
        int src = 0, dst = 4, K = 1;

        Map<Integer,List<int[]>> map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        int stop=0;
        Queue<int[]> queue=new LinkedList<>();
        queue.add(new int[]{src,0});

        for (int[] flight: edges){
            map.putIfAbsent(flight[0],new ArrayList<>());
            map.get(flight[0]).add(new int[]{flight[1],flight[2]});
        }

//        map.co
        while (!queue.isEmpty()){
            int size= queue.size();
            for (int i=0;i< size;i++){
                int[] current= queue.poll();
                if (current[0]==dst){
                    min=Math.min(min,current[1]);
                }
                if (!map.containsKey(current[0])){
                    continue;
                }
                for (int[] f:map.get(current[0])){
                    if (current[1]+f[1]>min){
                        continue;
                    }
                    queue.add(new int[]{f[0],f[1]+current[1]});
                }


            }
            if (stop++>K){
                break;
            }

        }
        System.out.println(min==Integer.MAX_VALUE?-1:min);
        return;


//        System.out.println(min);
    }

}
