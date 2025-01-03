import java.util.Scanner;
public class demo007 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your phonenumber: ");
        int phonenumber = scanner.nextInt();

        System.out.println("\nThank you for providing the information!");
        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        System.out.println("Your phonenumber: " + phonenumber);

        scanner.close();
    }
}
