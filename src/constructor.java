public class constructor {
    constructor(int a){
        System.out.println("int");
    }
    constructor(double s){
        System.out.println("Double");
    }

    public static void main(String[] args) {
        constructor c=new constructor(4.0);
        constructor d=new constructor(5);

    }
}
