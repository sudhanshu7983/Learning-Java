import java.util.*;
public class practice_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min =sc.nextInt();
        int max =sc.nextInt();
        int step = sc.nextInt();
        int c;
        for(int i=min;i<=max;i=i+step){
            c=(int)((5/9.0)*(i-32));
            System.out.println(i+" "+c);
        }
    }
}
