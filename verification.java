import java.util.Scanner;


public class verification {
    public static void main(String[] args) {
        // This program allows to find a character in a table when a user enter it on the keyboard
        // First we will declare a table of characters and then we will ask the user to enter a character to find it in the table
        // When this user enter a character we will compare it with the characters in the table and if we find it we will display a message to the user and if we don't find it we will display another message to the user

        char tableCharacters[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };
        char characterToFind = ' ', decision = 'O';
        int i = 0;

        System.out.println("Welcome dear user, this program allows you to find a character in a table of characters");
        System.out.println("---------------------------------------------------------------------------------------");
        
        Scanner sc = new Scanner(System.in);
        do{
            do{
            System.out.println("Please enter a character to find it in the table: ");
            characterToFind = sc.nextLine().charAt(0);

            while(i< tableCharacters.length && characterToFind != tableCharacters[i]){
                i++;
            }
            if (i < tableCharacters.length){
                System.out.println("Congratulations, the character " + characterToFind + " is found in the table at the index " + i);
            } else {
                System.out.println("Sorry, the character " + characterToFind + " is not found in the table");
            }
            
            } while (i >= tableCharacters.length);
            
            do{
                System.out.println("Do you want to continue? (O/N)");
                decision = sc.nextLine().charAt(0);
            } while (decision != 'O' && decision != 'N');
            
        } while (decision == 'O');
        System.out.println("Goodbye dear user, thank you for using this program");
    }
}
