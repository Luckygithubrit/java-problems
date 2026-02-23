import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("entyer your name");
        String name=sc.nextLine();
        System.out.printf("hey %s, how are you \n",name);
        String status=sc.nextLine();
        System.out.println("what is your age");
        int age=sc.nextInt();
        if(age>18){
            System.out.println("great you are major");
        }
        else{
            System.out.println("minor");
        }
        System.out.println("thank you");
    }
}