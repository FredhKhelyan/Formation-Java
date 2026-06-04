import java.util.Scanner;

public class ConversionCorrected {
    public static void main(String[] args) {
        int choice;
        double value;
        double result;
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning;

        do {
            System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT");
            System.out.println("---------------------------------------------------");
            System.out.println("Choisissez le mode de conversion:");
            System.out.println("1 - Convertisseur Celsius -> Fahrenheit");
            System.out.println("2 - Convertisseur Fahrenheit -> Celsius");
            System.out.print("Votre choix: ");
            choice = scanner.nextInt();
            keepRunning = false;

            switch (choice) {
                case 1:
                    System.out.print("Donner la temperature a convertir: ");
                    value = scanner.nextDouble();
                    result = value * 9.0 / 5.0 + 32.0;
                    System.out.println("La valeur de " + value + "°C vaut " + result + "°F.");
                    break;
                case 2:
                    System.out.print("Donner la temperature a convertir: ");
                    value = scanner.nextDouble();
                    result = (value - 32.0) * 5.0 / 9.0;
                    System.out.println("La valeur de " + value + "°F vaut " + result + "°C.");
                    break;
                default:
                    System.out.println("Votre choix n'est pas disponible, veuillez recommencer.");
                    keepRunning = true;
                    continue;
            }

            int nextAction;
            do {
                System.out.print("Voulez-vous faire un nouveau choix ? Taper 1 pour recommencer, 2 pour arreter: ");
                nextAction = scanner.nextInt();
            } while (nextAction != 1 && nextAction != 2);

            keepRunning = (nextAction == 1);
        } while (keepRunning);

        System.out.println("Merci d'avoir utilisé notre convertisseur, à bientôt...");
        scanner.close();
    }
}
