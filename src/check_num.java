import java.util.Scanner;

public class check_num {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
                                          System.out.println("enter number" );
        int num = sc.nextInt();

        if (num>0){
            System.out.println("num is positive");
        } else if (num<0) {
            System.out.println("num is negative");
        }
else{
            System.out.println("zero");
}
}
}
