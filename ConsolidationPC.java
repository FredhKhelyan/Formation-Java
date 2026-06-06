import java.util.Scanner;

public class ConsolidationPC {
    public static void main(String[] args) {
        // L'objecttif est de calculer l'IMC d'un individu
        // 1- demander la taille de l'utilisateur
        // 2- demander le poids de l'utilisateur 
        // 3- faire le calcul de l'IMC
        // 4- afficher le resultat de l'IMC en fonction du cas correspondant
        float poids, taille, imc;
    
        System.out.println("Bonjour cher utilisateur, bienvenue dans notre calculatrice");
        System.out.println("-----------------------------------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer votre poids s'il vous plait ");
        poids = sc.nextFloat();
        System.out.println("Entrer votre taille s'il vous plait ");
        taille = sc.nextFloat();

        imc = poids / (taille * taille);
        
        if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Votre imc est normale et vaut " + imc);
        }
        else if (imc < 18.5) {
            System.out.println("Votre IMC est en dessous de la valeur normale et vaut " + imc);
        }
        else if (imc > 24.9) {
            System.out.println("Votre IMC est au dessus de la valeur normale et vaut " + imc);
        }

    }
}