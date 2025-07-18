public class ReverseString {
    public static void main(String[] args) {
        String original = "hello";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseString(String str) {
        // Create a StringBuilder object and append the given string
        StringBuilder sb = new StringBuilder(str);
        // Use the reverse() method of StringBuilder to reverse the string
        sb.reverse();
        // Convert StringBuilder back to String and return
        return sb.toString();
    }
}
