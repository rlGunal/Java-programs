package String;

import java.util.Scanner;

public class wordcount {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String []s2=s1.split("");
        int wc=s2.length;
        System.out.println("The word count in the string: "+wc);    
    }
}
