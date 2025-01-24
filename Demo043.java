import java.util.Scanner;

public class Demo043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an uppercase character: ");
        char ch = scanner.next().charAt(0);
        
        if (Character.isUpperCase(ch)) {
            char lowerChar = Character.toLowerCase(ch);
            System.out.println("Lowercase: " + lowerChar);
        } else {
            System.out.println("The input is not an uppercase letter.");
        }
        
        scanner.close();
    }
}
