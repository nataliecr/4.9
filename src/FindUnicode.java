import java.util.Scanner;

public class FindUnicode {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a character: ");
    String temp = input.nextLine();
    char c = temp.charAt(0);
    
    System.out.println("The unicode character for " + temp + " is " + 
            (int)c);
  }   // main 
} // FindUnicode
