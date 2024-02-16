public class ConcatenateStrings {
    public static void main(String[] args) {
        String firstString = "hello";
        String secondString = "orld";

        String result = concatenateAndRemove(firstString, secondString);

        System.out.println("Concatenated String: " + result);
    }

    public static String concatenateAndRemove(String first, String second) {
        
        if (!first.isEmpty() && !second.isEmpty()) {
             if (first.charAt(first.length() - 1) == second.charAt(0)) {
                 
                return first + second.substring(1);
            }
        }

         return first + second;
    }
}

