import java.util.Scanner;

public class string_gmai_problem{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();
        String c_g_f=("correct gmail format is like this(yourname@gmail.com )");

        // Check if "@" is present and there is a name before it
        int a = email.indexOf('@');
        if (a > 0 && email.substring(a).equals("@gmail.com")) {
            String name = email.substring(0, a);
            System.out.println("Valid email address");
        }
        else if (a==0)
        {
            System.out.println("please enter your name first ");
            System.out.println("Invalid email address");
        }
        else {
            System.out.println("Invalid email address.");

            System.out.println(c_g_f);
        }
    }
}