import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        switch(a){
            case "mon":
                System.out.println("week day");
                break;
            case "tue":
                System.out.println("week day");
                break;
            case "wed":
                System.out.println("week day");
                break;
            case "thu":
                System.out.println("week day");
                break;
            case "fri":
                System.out.println("week day");
                break;
            case "sat":
                System.out.println("week day");
                break;
            default:
                System.out.println("holiday");
                break;
            
            
        }
        sc.close();
    }
}