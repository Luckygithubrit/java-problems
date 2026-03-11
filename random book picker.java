// random book picker is a program that allows the user to input a list of book names and then randomly selects one book from the list. 


import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        ArrayList<String> book=new ArrayList();
        // book.add("maths");
        // book.add("science");
        // book.add("social");
        // book.add("computer");
        // book.add("css");
        // book.add("html");
        System.out.println("enter no of books");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the book names:");
        for(int i=0;i<n;i++){
            book.add(sc.nextLine());
        }
        Random a=new Random();
        int index=a.nextInt(book.size());
        String pickedbook=book.get(index);
        System.out.println("the picked book is:"+pickedbook);
        
    }
}