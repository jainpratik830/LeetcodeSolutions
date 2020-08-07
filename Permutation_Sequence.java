import java.util.*;

public class Permutation_Sequence {


    public static void main(String[] args) {
        int n=9;
        int k=15;

        int[] fact = new int[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++)
            fact[i] = fact[i - 1] * i;

        List<Integer> numbers =new ArrayList<>();
        for(int i=1;i<=n;i++){
            numbers.add(i);
        }

        StringBuilder sb = new StringBuilder();
        k--;
        for (int i = 1; i <= n; i++) {
            int index = k / fact[n - i];
            sb.append(numbers.get(index));
            numbers.remove(index);
            k -= index * fact[n - i];
        }

        System.out.println(Integer.parseInt(sb.toString()));
    }



}
