class pen {
    String color;
    String type;
    public void printcolor(){
        System.out.println(this.color);
    }
}
class student {
    String name;
    int age;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class oops1 {
    public static void main(String[] args) {
        pen pen1= new pen();
        pen1.color ="red";
        pen1.type="ball";

        pen pen2= new pen();
        pen2.color="green";
        pen2.type="zel";
pen1.printcolor();
pen2.printcolor();
     student s1 =  new student();
     s1.name="sudhanshu";
     s1.age=22;
     s1.printinfo();
    }
}
