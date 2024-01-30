import java.util.Scanner;

public class loop_38
{
    public static int sum (int start,int end){
        int sid=0;
      for (int i =start;i<=end;i++){
          if(i%2==0){
              sid=sid+i;
          }
      }
      return sid;
    }
    
    public static void main(String[] args) {
        Scanner sudh =new Scanner(System.in);
        System.out.println("enter the starting number");
        int range_1=sudh.nextInt();
        System.out.println("enter the ending number");
        int range_2=sudh.nextInt();
        int result=sum(range_1,range_2);
        System.out.println(result);
    }
}
