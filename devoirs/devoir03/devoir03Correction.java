package devoirs.devoir03;

import exercices.exercice03.TypesDeBase;

public class devoir03Correction {
    public static void main(String[] args) {
        int jour =26;
        int mois = 9;
        int anne = 2024;
        int a = 4;
        int [] tab;
        tab = new int []{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (anne % a == 0);{
for (int i = 0; i < mois -1;i++){
    int jourtotal = jour + i;
    System.out.println("Le"+jour+ "/" +mois+ "/" +anne+ " est le " + "ème jour de l'An");
}
        }
    }
}
