import java.util.regex.Pattern;

public class Login {

    public static void main(String[] args) {
        // Validate input to prevent SQL injection
        String username = "user-input";
        String password = "user-input";

        if (isValidInput(username) && isValidInput(password)) {
            // Perform login logic
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid input");
        }
    }

    private static boolean isValidInput(String input) {
        // Validate against SQL injection using regex (simplified example)
        return !Pattern.compile("[^a-zA-Z0-9]").matcher(input).find();
    }
}
