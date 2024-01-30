class sum{
    public int printinfo( int a, int b){
        int c=a+b;
        System.out.println(c);
        return c;
    }
}
class mul extends sum{
public void printinfo(int a){
    int d=a*78;
    System.out.println(d);

}
}
public class abs {
    public static void main(String[] args) {
       mul s= new mul();
       s.printinfo(5);
       s.printinfo(6,7);

    }
}
