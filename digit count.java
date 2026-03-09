import java.util.*;
public class Lucky {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=a;
        int count=0;
        if(n==0){
            count=1;
        }
        while(n != 0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}