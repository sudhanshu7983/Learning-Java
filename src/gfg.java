import org.w3c.dom.ls.LSOutput;

import java.util.*;
class gfg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int max, i;
        for (i = 0; i < arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr);
    }
}