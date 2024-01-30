class shape{
    String color;


}
class tringle extends shape {
    String shap;

    public void printinfo() {
        System.out.println(color);
        System.out.println(shap);
    }
}

public class inher {
    public static void main(String[] args) {
        tringle t1 = new tringle();
        t1.color="black";
        t1.shap="trin";
        t1.printinfo();
    }
}
