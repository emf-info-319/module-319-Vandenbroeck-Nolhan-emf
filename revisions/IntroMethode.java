
import java.util.Scanner;

public class IntroMethode {
    public static void main(String[] args) {
        debut();
        int resultat = demandeNombre();
        int resultat2 = demandeNombre();
        int resultat3 = demandeNombre();
        System.out.println("la somme est : " +somme(resultat, resultat2, resultat3));
        fin();

    }

    public static void debut() {
        System.out.println("Bonjour et bienvenu sur ce premier programme.");

        System.out.println("On va voir les méthodes dans ce cours.");
    }

    public static int demandeNombre() {
        Scanner user = new Scanner(System.in);
        System.out.println("Entrez un nombre : > ");
        int nombre1 = user.nextInt();
        return nombre1;
    }

    public static void fin() {
        System.out.println("Programme terminé");
    }

    public static int somme(int resultat, int resultat2, int resultat3){
    int somme = resultat + resultat2 + resultat3;
    return somme;
    }
    
}