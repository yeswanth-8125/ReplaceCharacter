import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String a = scanner.nextLine();

        System.out.println("Enter the character to be replaced: ");
        char oldChar = scanner.next().charAt(0);

        System.out.println("Enter the new character: ");
        char newChar = scanner.next().charAt(0);

        String b= a.replace(oldChar, newChar);
        
        System.out.println( b);

        scanner.close();
    }
}
