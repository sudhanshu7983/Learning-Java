class shape2{
    public void area(){
        System.out.println("display area");
    }
}
class triangle1 extends shape2{
    public void area(int l,int h){
        System.out.println(2*l*h);
    }

}
class equi extends triangle1{
    public void area(int l,int h){
        System.out.println(l*h);
    }

}
public class inher2 {
    public static void main(String[] args) {
        triangle1 t = new triangle1();
        t.area(5,3);
        equi e= new equi();
        e.area(4,5);
    }
}
