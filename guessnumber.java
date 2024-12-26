// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int guessnum=5;
       while(true){
           System.out.print("enter a value:");
           int val=sc.nextInt();
           if(guessnum==val){
               System.out.println("correct");
               break; 
        }
          
       }
    }
}
