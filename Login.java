import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String correctUsername = "user";
            String correctPassword = "pass";
            int attempts = 3;
            
            while (attempts > 0) {
                System.out.print("Enter username: ");
                String username = scanner.nextLine();
                
                System.out.print("Enter password: ");
                String password = "";
                char ch;
                while ((ch = scanner.next().charAt(0)) != '\n') {
                    password += ch;
                    System.out.print('*'); // Print '*' for each character
                }
                System.out.println(); // Move to the next line
                
                if (username.equals(correctUsername) && password.equals(correctPassword)) {
                    System.out.println("Login successful!");
                    break;
                } else {
                    attempts--;
                    System.out.println("Incorrect username or password. You have " + attempts + " attempts left.");
                }
            }
            if (attempts == 0) {
                System.out.println("Login failed.");
            }
        }
    }
}