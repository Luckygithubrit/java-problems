import java.util.*;
class Lucky {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the word:");
        String a=sc.nextLine();
        char[] arr=a.toLowerCase().toCharArray();
        System.out.println("duplicate characters: ");
        
        for(int i=0;i<a.length()-1;i++){
            for(int j=i+1;j<a.length()-1;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]+" ");
                    break;
                }
            }
        }
       
        
    }
}