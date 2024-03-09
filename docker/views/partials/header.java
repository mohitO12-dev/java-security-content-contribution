public class Head {

    public static void main(String[] args) {
       
        String headContent = generateHeadContent();
        System.out.println(headContent);
    }

    private static String generateHeadContent() {
        
        return "<meta charset=\"UTF-8\">\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n";
    }
}
