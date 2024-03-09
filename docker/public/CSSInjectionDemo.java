import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSSInjectionDemo {

    public static void main(String[] args) {
        // Example of user input (potentially vulnerable to CSS injection)
        String userInput = "Arial'; color: red; /* Malicious CSS injection */";

        // Escape user input to prevent CSS injection
        String safeInput = escapeInput(userInput);

        // Read CSS file and include in the final CSS style
        String cssFileContent = readCSSFile("style.css");
        String cssStyle = "body { font-family: " + safeInput + ", sans-serif; } " + cssFileContent;
        
        // Output the CSS style
        System.out.println(cssStyle);
    }

    private static String escapeInput(String input) {
        // Perform input validation and escaping logic here
        // For demonstration purposes, replace single quotes with their escaped equivalents
        // This method should be extended to cover more potential characters
        
        // Escape single quotes
        input = input.replaceAll("'", "\\\\'");
        
        return input;
    }

    private static String readCSSFile(String filePath) {
        StringBuilder cssContent = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Validate and sanitize each line of the CSS file before including it
                String safeLine = escapeInput(line);
                cssContent.append(safeLine).append(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cssContent.toString();
    }
}
