import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the word:");
        String a=sc.nextLine();
        a=a.toLowerCase();
        int count=0;
        for(int i=0;i<=a.length()-1;i++){
            char c =a.charAt(i);
            if(c =='a'|| c=='e'|| c=='i' || c=='o' || c=='u'){
                count++;
                System.out.println("vowel: "+c);
            }
            
        }
        System.out.println("total vowels:"+count);
    }
}