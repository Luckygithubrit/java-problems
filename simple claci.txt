import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        System.out.println("enter the secound number:");
        int b=sc.nextInt();
        System.out.println("select the option \n *,+,%,-");
        char c=sc.next().charAt(0);
        
        int result;
        
        switch(c){
            case '+':
                result=a+b;
                System.out.println("result is:"+result);
                break;
            case '-':
                result=a-b;
                System.out.println("result is:"+result);
                break;
            case '*':
                result=a*b;
                System.out.println("result is:"+result);
                break;
            case '%':
                result=a%b;
                System.out.println("result is:"+result);
                break;
            default:
                System.out.println("not valiod");
                
                
        }
        sc.close();
    }
}