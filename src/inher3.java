import java.util.*;
class shape3{
    public void area(){
        System.out.println("display area");
    }
}
class triangle2 extends shape1{
    public void area(int l,int h){
        System.out.println(2*l*h);
    }

}
class circle extends shape3{
    public void area() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num area");
        int r = sc.nextInt();
        System.out.println(2 * 3 * r);

    }
}
public class inher3 {
    public static void main(String[] args) {
        triangle2 t = new triangle2();
        t.area(5,3);
        circle c= new circle();
        c.area();
    }
}
