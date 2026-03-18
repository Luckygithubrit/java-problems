// question: Write a Java program to check if two strings are anagrams of each other.
// an anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once. For example, "listen" and "silent" are anagrams of each other.
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string1:");
        //first array
        String a=sc.nextLine();
        System.out.println("enter the second string2");
        String b=sc.nextLine();
        char ch1[]=a.toCharArray();
        char ch2[]=b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println("sorted string1"+Arrays.toString(ch1));
        System.out.println("sorted string2"+Arrays.toString(ch2));
        System.out.println("the rsult is:");
        if(Arrays.equals(ch1,ch2)){
            System.out.println("it is anagram");
        }
        else{
            System.out.println("no");
        }