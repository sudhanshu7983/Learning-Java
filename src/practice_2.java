//her computer science teacher gives the class an assignment to print
//all the characters of a given string in separate lines.
//Amy immediately gets to work and writes a simple program. However, she
//feels that her solution is too basic and wants to find a more
//efficient way to solve the problem.
//Can you help Amy by writing a program that prints all the characters
//of a given string in separate lines
import java.util.*;
public class practice_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        for(int i =0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
}
