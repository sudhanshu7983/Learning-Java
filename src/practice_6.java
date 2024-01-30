import java.util.Scanner;
public class practice_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        System.out.println(cnt(str1));
    }
    public static int cnt(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;
    } }