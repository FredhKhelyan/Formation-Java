// L'objectif est de generer un nombre aleatoire et demander a l'utilisateur de le devenir, Tant que le nombre n'est pas devine le programme ne s'arrete pas
// 1- Generer le nombre aleatoire virtuellement situe entre 1 et 10   
// 2 - Demander a l'user de saisir un chiffre 
// 3 - verifier si le nombre entree est le meme nombre genere
//  4 - Tant que le nombre n'est pas trouve le compteur et le programme recommence
// des que le nombre est trouve le jeu s'arrete et affiche aussi le nombre de tentative

import java.util.Scanner;

public class NombreMystere {
    public static void main(String[] args) {
        int nbreMystere = (int) (Math.random() * 10) + 1, nbreChoisie, essai=0;
        // boolean verification = false;

        do{
            System.out.println("Veuillez saisir un nombre pour tenter de deviner le nombre mystere: ");
            Scanner sc = new Scanner(System.in);
            nbreChoisie = sc.nextInt();
            System.out.println("Desole mais ce nombre n'est pas correct");
            essai++;
            
            if (nbreChoisie == nbreMystere) {
                System.out.println("Bravo vous avez devine le nbre mystere en " + essai + "essai(s)");
                break;
            }
        } while (nbreChoisie != nbreMystere);

        System.out.println("AU revoir......");
    }
}