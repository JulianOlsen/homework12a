package homework12a;

import java.util.Scanner;

public class Homework12a {
    
   void output(int a)
        {
        Scanner SC = new Scanner(System.in);
        String name = SC.next();
       System.out.println("you are awesome "+name);
       
        }
    public static void main(String[] args) {
        Homework12a main = new Homework12a(); 
        
        System.out.println("type in your name");
        main.output(0);
        }
         
} 
