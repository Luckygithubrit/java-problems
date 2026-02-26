import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentence:");
        String a=sc.nextLine();
        String result="";
        for(int i=0;i<a.length();i++){
            char b=a.charAt(i);
            if(!(b == ' ')){
                result=result+b;
            }
        }
        System.out.println(result);
    }
}