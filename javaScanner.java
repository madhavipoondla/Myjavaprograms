import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: "); // Show prompt first
        String name = scanner.nextLine();        // Then wait for user input

        System.out.println("Hello " + name);     // Greet user
        scanner.close();                         // Close scanner
    }
}
