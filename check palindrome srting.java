import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int rev=new StringBuilder(a).reverse().toString();
        System.out.println(a.equals(rev));
    }
}