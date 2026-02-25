import java.util.*;
class Lucky {
        int currentbalance=100;
        public static void greet(){
            //method body
            System.out.println("hello buddy");
            
        }
        public void deposit(int amount){
            currentbalance=currentbalance+amount;
            System.out.println("deposited successfull ");
        }
        public void withdrawl(int amount){
            if(amount<=currentbalance){
                
            
            currentbalance=currentbalance-amount;
            System.out.println("withdraw successfully");
            }
            else{
                System.out.println("insufficient balance");
            }
            
            // System.out.println("withdrawl successfull ");
        }
        public int getcurrentbalance(){
            return currentbalance;
        } 
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            Lucky lucky=new Lucky();
            greet();
            System.out.println("your current balce is:"+lucky.getcurrentbalance());
            
            // Scanner sc=new scanner(System.in);
            System.out.println("enter the amount to deposit:");
            int luc=sc.nextInt();
            lucky.deposit(luc);
            System.out.println("your current balnce is: "+lucky.getcurrentbalance());
            System.out.println("enter the amount to withdrawl");
            int luc1=sc.nextInt();
            lucky.withdrawl(luc1);
            sc.close();
            
        }
        
 
}