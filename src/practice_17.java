import java.util.Scanner;

public class practice_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n =0;
        int re=0;
        int p=0;
        while(num>0){
            n= num%10;

           re= re*10+n;
          num=num/10;

        }
        System.out.println(re);
    }
}
