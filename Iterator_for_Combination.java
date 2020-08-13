import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Iterator_for_Combination {

    class CombinationIterator {

        public void bib_com(ArrayList<int[]> bin,int[] arr, int index,int count,int k,ArrayList<String> a,String s,String characters){

            if (index == arr.length)
            {
                if (count==k) {
                    a.add(s);
                    bin.add(arr.clone());
                }
                return;
            }

            if (count==k){
//            System.out.println("here "+k+" "+Arrays.toString(arr));
                a.add(s);
                Arrays.fill(arr,index,arr.length,0);
                bin.add(arr.clone());
                return;
            }


            arr[index] = 0;
            bib_com(bin,arr,index+1,count,k,a,s,characters);

            arr[index] = 1;
            s+=characters.charAt(index);
            bib_com(bin,arr,index+1,count+1,k,a,s,characters);


        }

        int i;
        ArrayList<String> a;

        public CombinationIterator(String characters, int combinationLength) {
            int n=characters.length();
            int k=combinationLength;
            ArrayList<int[]> bin=new ArrayList<>();
            // String[] a=new String
            a=new ArrayList<>();
            int[] arr=new int[n];
            bib_com(bin,arr,0,0,k,a,"",characters);
            i=0;
            Collections.sort(a);


        }

        public String next() {
            return a.get(i++);
        }

        public boolean hasNext() {
            if(i<=a.size()-1){
                return true;
            }
            return false;
        }
    }

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */

}
