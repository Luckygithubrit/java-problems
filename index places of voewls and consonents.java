import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String vowels="";
        String consonents="";
        a=a.toLowerCase();
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(ch>='a'&&ch<='z'){
                
            
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowels=vowels+i;
                }
                else{
                    consonents=consonents+i;
                }
            }
        }
        System.out.println(vowels);
        System.out.println(consonents);
        
        
        
        
        
        
        
    }
}