import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shuffle_an_Array {


    public class Solution {

        int[] org;
        int[] temp;
        Random rand;

        public Solution(int[] nums) {
            org = nums.clone();
            temp = nums;
            rand = new Random();
        }

        /**
         * Resets the array to its original configuration and return it.
         */
        public int[] reset() {
            temp = org.clone();
            return temp;
        }

        /**
         * Returns a random shuffling of the array.
         */
        public int[] shuffle() {

            List<Integer> list = new ArrayList<>();
            for (int n : org) {
                list.add(n);
            }

            // int[]
            for (int i = 0; i < org.length; i++) {
                int randomIndex = rand.nextInt(list.size());
                temp[i] = list.get(randomIndex);
                list.remove(randomIndex);
            }

            return temp;


        }
    }
}
