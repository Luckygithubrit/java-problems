import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the word");
        String a=sc.nextLine();
        String[] rev=a.split(" ");
        for(int i=0;i<rev.length;i++){
            for(int j=rev[i].length()-1;j>=0;j--){
                System.out.print(rev[i].charAt(j));
            }
            System.out.print(" ");
            
        }
        
        
        
    }
}