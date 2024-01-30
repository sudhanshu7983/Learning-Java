import java.util.Scanner;
public class practice_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int num = sc.nextInt();
        char c1= sc.next().charAt(0);

        for(int i =0;i<num;i++){
            if(s.charAt(i)==c1){
                System.out.println(i);
            }
            else {
                System.out.println("-1");
            }
        }
    }
}
//import java.util.Scanner;
//public class practice_5 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String inputString = scanner.nextLine();
//        char targetChar = scanner.next().charAt(0);
//        int index = searchCharacter(inputString, targetChar);
//        System.out.println(index);
//    }
//    public static int searchCharacter(String inputString, char targetChar)
//    {
//        for (int i = 0; i < inputString.length(); i++) {
//            if (inputString.charAt(i) == targetChar) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}
