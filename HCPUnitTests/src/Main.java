import java.util.Scanner;

public class Main {
    //Paste your code into the main class!
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input: ");
        String original = myObj.nextLine();
        String reverse = "";

        for (int i = 0; i < original.length(); i++) {
            char letter = original.charAt(i);
            reverse = letter + reverse;
        }
        System.out.println(reverse);
    }
}