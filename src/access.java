class acc{
   private String pass;
   public String getPass(){
       return this.pass;
   }
   public void setPass(String pass1){
       this.pass=pass1;
   }
}
public class access {

    public static void main(String[] args) {
        acc a= new acc();
        a.setPass("abcd");
        System.out.println(a.getPass());
    }
}
