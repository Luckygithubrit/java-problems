import java.util.*;

class Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
  
       for(int i=200;i>=a;i--){
           
           if(i%2==1){
               System.out.println(i);
           }
          
       }
       
    }
}