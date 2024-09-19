package exercices.exercice09;

public class ExerciceTableaux2 {
    public final static int VALEUR_MINIMAL = 1;
    public final static int VALEUR_MAXIMAL = 6;

    public static void main(String[] args) {
        int[] monTableau;
        monTableau = new int[10];

        // i =index, changer d'index à chaque boucle tant que l'index est plus petit que
        // la taille du tableau
        for (int i = 0; i < monTableau.length; i++) {

            monTableau[i] = (int) (Math.random() * (VALEUR_MAXIMAL - VALEUR_MINIMAL + 1)) + VALEUR_MINIMAL;
            System.out.println("Cellule " + i + " : " + monTableau[i]);// montrer le chiffre générer par le math.random

        }

    }
}
