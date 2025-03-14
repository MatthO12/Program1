
import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a str: ");
        String input = scanner.nextLine();
    
        System.out.println("Middle character(s): " + getMiddleCharacter(input));
        
        scanner.close();
    }

    public static String getMiddleCharacter(String str) {
        int length = str.length();
        int middle = length / 2;
  
        return (length % 2 == 0) ? str.substring(middle - 1, middle + 1) : String.valueOf(str.charAt(middle));
    }
}
