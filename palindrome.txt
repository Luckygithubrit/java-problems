import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the word");
        String a=sc.nextLine();
        String rev="";
        for(int i=a.length()-1;i>=0;i--){
            rev=rev+a.charAt(i);
            // System.out.print(rev);
            
        }
        if(a.equals(rev)){
            System.out.println("it is palindrome");
            
        }
        else{
            System.out.println("not a palindrome");
        }
        
        
        
    }
}