package exercices.exercice11;

import java.util.Arrays;

public class ExercicesInversionTableau {
  public final static int MIN = 0;
  public final static int MAX = 100;

  public static void main(String[] args) {
    int[] tableauInitial = new int[4];
    System.out.println("Contenu du tableau initial :");
    for (int i = 0; i < tableauInitial.length; i++) {
      tableauInitial[i] = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
      System.out.println("Tableau initial [0] = " + tableauInitial[i]);
    }
    int[] tableauFinal;
    tableauFinal = inverseLeTableau(tableauInitial);
    System.out.println("Contenu du tableau final :");
    for (int i = 0; i < tableauFinal.length; i++) {
      System.out.println("Tableau final [0] = " + tableauFinal[i]);
    }
  }

  public static int[] inverseLeTableau(int[] tab) {
    for (int i = 0; i < tab.length / 2; i++) {
      int tmp = tab[i];
      tab[i] = tab[tab.length - i - 1];
      tab[tab.length - i - 1] = tmp;
    }
    return tab;
  }
}
