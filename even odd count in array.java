import java.util.*;
class Lucky {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("array size");
        int a=sc.nextInt();
        int arr[]=new int[a]; 
        int even=0;
        int odd=0;
        System.out.println("enter the elements:");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int num : arr){
            if(num%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("even count:"+even);
        System.out.println("odd count:"+odd);
        
        
       
        
    }
}