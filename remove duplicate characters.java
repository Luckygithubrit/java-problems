import java.util.*;
class Lucky {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the word:");
        String a=sc.nextLine();
        String temp="";
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(temp.indexOf(ch)==-1){
                temp=temp+ch;
            }
        }
        
        System.out.println(temp);
      
        
        
    }
}