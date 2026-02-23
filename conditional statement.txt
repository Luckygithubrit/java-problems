import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the text:");
        String a=sc.nextLine();
        if(a.equals("pass")){
            System.out.println("please waitfor the round1");
            System.out.println("enter the text");
            String round1=sc.nextLine();
            
            if(round1.equals("pass")){
                System.out.println("your are qualified");
            }
            else{
                System.out.println("you can go to home");
                
            }
        }
        else{
            System.out.println("go to home");
        }
        sc.close();
    }
}