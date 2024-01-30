
//. Take an input n which is size of array then n more inputs the values in array then find the square of special elements.
import java.util.*;
public class practice_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans =0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr.length % (i + 1) == 0) {
                ans += arr[i] * arr[i];

            }
        }
            System.out.println(ans);

    }

}
