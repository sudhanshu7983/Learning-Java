import java.util.Scanner;

public class string_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        String s = sc.nextLine();
       String st[]=s.split(" ");
       int len =st.length;
        System.out.println(len);

    }
}
