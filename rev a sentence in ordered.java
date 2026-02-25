import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the word");
        String a=sc.nextLine();
        String[] rev=a.split(" ");
        for(int i=rev.length-1;i>=0;i--){
            System.out.print(rev[i]+" ");
            
        }
        
        
        
    }
}