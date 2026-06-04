import java.util.Scanner;

public class boucle {
    public static void main(String[] args) {
        // The objective here is to print on the screen the surname of a user with the mention "Good morning"

        // String surname;
        // // Initialization of character which allows to put the surname of the user again and again
        // char answer = 'o';

        // // user enters his surname on the keyboard
        // Scanner sc = new Scanner(System.in);

        // //
        // while (answer == 'o') {
        //     System.out.println("What's your name? ");
        //     surname = sc.nextLine();
        //     System.out.println("Good Morning " + surname + "How are you today?");
        //     System.out.println("Would you try again? (o/n)");
        //     answer = sc.nextLine().charAt(0);
        // }

        // System.out.println("Good Bye...");



        // L'objectif principal de cet exercice est d'afficher le nom d'un utilisateur et notamment de faire faire en sorte que l'utilisateur n'utilise que oui (o) ou nom (n)
        // 1- il faudrait que le user entre son nom
        // 2- il faudrait qu'il repete cette operation encore et encore tant que la boucle est valide


        String username;
        // char choice = 'o';

        // Scanner sc = new Scanner(System.in);

        // while (choice == 'o') {
        //     System.out.println("Bonjour quel est votre nom? ");
        //     username = sc.nextLine();
        //     System.out.println("Donc vous vous appelez " + username);
            
        //     choice = ' ';
        //     while (choice != 'o' && choice != 'n') {
        //         System.out.println("Voulez-vous reessayer? ");
        //         choice = sc.nextLine().charAt(0);
        //     }
        // }
        
        // System.out.println("Good bye ....");

        char response = ' ';

        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Quel est votre nom? ");
            username = sc.nextLine();
            System.out.println("Bienvenu "+ username);

        do {
            System.out.println("Voulez-vous reessayer? ");
            response = sc.nextLine().charAt(0);
        }while(response != 'o' && response != 'n');
        
        } while (response == 'o');
    System.out.println("Good bye ....");
}
}
