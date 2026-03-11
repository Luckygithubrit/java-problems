import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        StringBuilder b= new StringBuilder(a);
        b.reverse();
        System.out.println(b.toString());
    }
}
                  //or
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println(new StringBuilder(a).reverse().toString());
    }
}