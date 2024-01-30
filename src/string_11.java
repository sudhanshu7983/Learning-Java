//import java.util.Scanner;
//
//public class string_11 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//         String d="";
//         char ch;
//         for (int i =s.length()-1;i>=0;i--){
//              ch  =s.charAt(i);
//             d=d+ch;
//         }
//        System.out.println(d);
//    }
//}
import java.util.Scanner;
public class string_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}