import java.util.*;
public class sum_od_two_array {
    //main method
    public static void main(String[] args){

        //Declare and initialize the array elements
        int[] a = {51, 16, 33, 2, 14, 21};
        int[] b = {33, 9, 56, 21, 39, 21};

        //get length of an array and store it in c array
        int[] c = new int[a.length];

        //check if length of both array are equal
        if(a.length==b.length){
            //logic implementation
            for (int i = 0 ,j=0,k=0; i < a.length; i++,j++,k++){
                c[k] = a[i] + b[j];
            }

            //Print the result
            System.out.println("Resultant array is:"+ c);

        } else {
            System.out.println("Length of both array should be same");
        }
    }
}