import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single alphabet: ");
        String input = scanner.next().toLowerCase(); 
        char alphabet = input.charAt(0);

        if (input.length() > 1) {
            System.out.println("Error: Please enter a single alphabet.");
        } else if (!(alphabet >= 'a' && alphabet <= 'z')) {
            System.out.println("Error: Please enter a valid alphabet.");
        } else if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
            System.out.println(alphabet + " is a vowel.");
        } else {
            System.out.println(alphabet + " is a consonant.");
        }

        scanner.close();
    }
}

