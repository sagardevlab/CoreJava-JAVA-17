package stringInternals;

public class stringMethods {    
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        
        // Concatenation
        String str3 = str1 + " " + str2;
        System.out.println("Concatenated String: " + str3);
        
        // Length
        System.out.println("Length of str3: " + str3.length());
        
        // Substring
        String substr = str3.substring(0, 5);
        System.out.println("Substring of str3: " + substr);
        
        // Replace
        String replacedStr = str3.replace("World", "Java");
        System.out.println("Replaced String: " + replacedStr);
        
        // To Upper Case
        System.out.println("Upper Case: " + str3.toUpperCase());
        
        // To Lower Case
        System.out.println("Lower Case: " + str3.toLowerCase());
        
        // Trim
        String str4 = "   Hello World   ";
        System.out.println("Trimmed String: '" + str4.trim() + "'");
    }
}   