import java.util.Scanner;

public class practice_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = sc.next().split("");
        int a[]= new int[s.length];
        for(int i =0;i<s.length;i++)
            a[i]=Integer.parseInt(s[i]);
        for(int i =0;i<a.length;i++){
            if(a[i]==0)

                a[i]=5;
            }
            for(int i =0;i<a.length;i++)
                System.out.print(a[i]);
        }
    }

