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
            currentbalance=currentbalance-amount;
            System.out.println("withdrawl successfull ");
        }
        public int getcurrentbalance(){
            return currentbalance;
        } 
        public static void main(String[] args){
            Lucky lucky=new Lucky();
            greet();
            System.out.println("your current balce is:"+lucky.getcurrentbalance());
            
           
            lucky.deposit(200);
            System.out.println("your current balnce is: "+lucky.getcurrentbalance());
            lucky.withdrawl(30);
            System.out.println("withdrawl successfullly is : "+lucky.getcurrentbalance());
        }
 
}