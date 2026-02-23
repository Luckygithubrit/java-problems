import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enyter a number");
        int a=sc.nextInt();
        if(a<35){
            System.out.println("fail");
        }
        else if(a==35){
            System.out.println("pass");
        }
        else if(a>35&&a<=70){
            System.out.println("third class");
        }
        else if(a>70&&a<=85){
            System.out.println("pass");
        }
        else{
            System.out.println("first class");
        }
        sc.close();
    }
}