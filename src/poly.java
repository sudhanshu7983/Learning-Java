class student1{
    String name;
    int age;
    public void printfinfo(String name){
        System.out.println(name);
    }
    public void printfinfo(int age) {
        System.out.println(age);
    }
        public void printfinfo(String name,int age){
            System.out.println(name+" "+ age);
        }

}
public class poly {
    public static void main(String[] args) {
        student1 s1 =new student1();
        s1.name="aman";
        s1.age=25;
        s1.printfinfo(s1.name, s1.age);

    }


}
