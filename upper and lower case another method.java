import java.util.*;
class Lucky {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentence:");
        String a=sc.nextLine();
        String upper="";
        String lower="";
        for(int i=0;i<=a.length()-1;i++){
            char b=a.charAt(i);
            //to upper case
            if(b>='a' && b<='z'){
                upper=upper+(char)(b-32);
            }
            else{
                upper=upper+b;
            }
            //to lower case
            if(b>='A' && b<='Z'){
                lower=lower+(char)(b+32);
            }
            else{
                lower=lower+b;
            }
        }
        
        System.out.println("upper case:"+upper);
        System.out.println("lower case:"+lower);
    }
}
