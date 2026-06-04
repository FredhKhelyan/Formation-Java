import java.util.Scanner;

public class conversion {
    
    public static void main(String[] args) {

        int choice, value;
        double result;
        // char decision;


        do{
            System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT");
            System.out.println("---------------------------------------------------");

            System.out.println("Choisissez le mode de conversion:");
            System.out.println("1 - Convertisseur Celsius - Fahrenheit");
            System.out.println("2 - Convertisseur Fahrenheit - Celsius");

            Scanner ch = new Scanner(System.in);
            choice = ch.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(" Donner la temperature a convertir: ");
                    Scanner sc = new Scanner(System.in);
                    value = sc.nextInt();

                    result = (double) ((9 / 5) * value + 32);
                    
                    System.out.println("La valeur de " + value + "°C vaut " + result + "°F.");
                    
                    do{
                        System.out.println(" Voulez- vous faire un nouveau choix? Taper 1 pour recommencer le processus et 2 pour arreter le programme");
                        Scanner d = new Scanner(System.in);
                        choice = d.nextInt();
                    } while (choice != 1 && choice != 2);
                    
                    break;

                case 2:
                    System.out.println(" Donner la temperature a convertir: ");
                    Scanner scr = new Scanner(System.in);
                    value = scr.nextInt();

                    result = (double) (((value - 32)*5)/9);

                    System.out.println("La valeur de " + value + "°F vaut " + result + "°C.");

                    do {
                        System.out.println(" Voulez- vous faire un nouveau choix? Taper 1 pour recommencer le processus et 2 pour arreter le programme");
                        Scanner d = new Scanner(System.in);
                        choice = d.nextInt();
                    } while (choice != 1 && choice != 2);

                    break;

                default:
                    System.out.println("Votre choix n'est pas disponible, veuillez recommencer");
                    break;
            }
        } while (choice == 1 || choice == 2);

        System.out.println("Merci d'avoir utilisé notre convertisseur, à bientôt...");

    }
}
        