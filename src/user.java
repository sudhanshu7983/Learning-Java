    import java.util.Scanner;

    public class user{
        String name;
        int password;
        void s1(String n) {
            name=n;
        }
        void s2(int p) {
            password=p;

        }
        String s3() {
            return name;
        }
        int s4() {
            return password;
        }
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("reg page ");
            System.out.println("pls enter the name for reg page");
            String a1=s.next();
            System.out.println("pls enterbthe password for reg page");
            int a2=s.nextInt();
            user u=new user();
            u.s1(a1);
            u.s2(a2);

            System.out.println("login page ");
            System.out.println("pls enter the name for login page");
            String a3=s.next();
            System.out.println("pls enter the password for login page");
            int a4=s.nextInt();


            if(a3.equals(u.s3())  &&(a4==u.s4())){
                System.out.println("ok");
            }else {
                System.out.println("invalid");
            }







        }

}
