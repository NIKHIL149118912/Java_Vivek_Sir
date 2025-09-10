import java.lang.String;
class CharacterCheck{

    public static void main(String[] args) {

        // The character to be checked. You can change this value to test different characters.
        char ch = '%';

        System.out.println("Checking character: " + ch);

        // Check if the character is an alphabet (either lowercase or uppercase).
        // The Character.isLetter() method returns true if the character is in the range a-z or A-Z.
        if (Character.isLetter(ch)) {
            System.out.println("'" + ch + "' is a letter.");
        }
        // If it's not a letter, check if it's a digit (0-9).
        // The Character.isDigit() method returns true if the character is in the range 0-9.
        else if (Character.isDigit(ch)) {
            System.out.println("'" + ch + "' is a digit.");
        }
        // If the character is neither a letter nor a digit, it is a special character.
        else {
            System.out.println("'" + ch + "' is a special character.");
        }
    }
}
