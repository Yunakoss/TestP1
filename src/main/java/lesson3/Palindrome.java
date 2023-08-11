package lesson3;

public class Palindrome {
    public static void main(String[] args) {
        String original = "racecar";

        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        boolean palindrome = true;
//        for (int i = 0; i < original.length(); i++) {
//            if (original.charAt(i) != reverse.charAt(i)) {
//                palindrome = false;
//            }
//        }
        if (original.equals(reverse)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
