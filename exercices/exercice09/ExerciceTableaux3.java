package exercices.exercice09;

public class ExerciceTableaux3 {
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
        

    }for (int i=0; i < monTableau.length;i++);{
        

    }
 int valeurCellule1 = monTableau[0];
 int valeurCellule2 = monTableau[1];
 int valeurCellule3 = monTableau[2];
 int valeurCellule4 = monTableau[3];
 int valeurCellule5 = monTableau[4];
 int valeurCellule6 = monTableau[5];
 int valeurCellule7 = monTableau[6];
 int valeurCellule8 = monTableau[7];
 int valeurCellule9 = monTableau[8];
 int valeurCellule10 = monTableau[9];
float moyenneClasse = (valeurCellule1+valeurCellule2+valeurCellule3+valeurCellule4+valeurCellule5+valeurCellule6+valeurCellule7+valeurCellule8+valeurCellule9+valeurCellule10)/10;
System.out.println("La moyenne est de "+moyenneClasse);
} 
}
