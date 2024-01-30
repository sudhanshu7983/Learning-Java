class shape1{
public void area(){
    System.out.println("display area");
}
}
class triangle extends shape1{
    public void area(int l,int h){
        System.out.println(2*l*h);
    }

}
public class inher1 {
    public static void main(String[] args) {
     triangle t = new triangle();
     t.area(5,3);
    }
}
