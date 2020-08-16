import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Sliding_Window_Maximum {


    public static void main(String[] args) {

        int[] nums={1,3,-1,-3,5,3,6,7};
        int k=3;

        int[] result=new int[nums.length-k+1];
        Deque<Integer> deque=new LinkedList<>();
        for (int i=0;i<k;i++){
            while (!deque.isEmpty() && nums[i]>=nums[deque.peekLast()]){
                deque.removeLast();
            }
            deque.addLast(i);
        }


        for (int i=k;i<nums.length;i++){
            result[i-k]=nums[deque.peek()];

            while (!deque.isEmpty() && deque.peek()<=i-k){
                deque.removeFirst();
            }

            while (!deque.isEmpty() && nums[i]>=nums[deque.peekLast()]){
                deque.removeLast();
            }

            deque.addLast(i);
        }

        result[nums.length-k]=deque.peek();
        System.out.println(Arrays.toString(result));
    }
}
