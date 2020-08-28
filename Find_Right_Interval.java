public class Find_Right_Interval {


    public int[] findRightInterval(int[][] intervals) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        int n=intervals.length;
        if(intervals.length==0){
            return new int[]{-1};
        }

        for(int i=0;i<n;i++){
            map.put(intervals[i][0],i);
        }


        int[] result=new int[n];
        for(int i=0;i<n;i++){
            Integer key=map.ceilingKey(intervals[i][1]);
            result[i]=key==null?-1:map.get(key);

        }

        return result;

    }


}
