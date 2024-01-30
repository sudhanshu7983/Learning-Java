import java.util.Scanner;

public class practice_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        while(num>0){
            int l=num%10;
            sum =(sum*10)+l;
            num=num/10;

        }
        System.out.println(sum);
    }
}
