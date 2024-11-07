import java.util.Arrays;
import java.util.Random;

public class Methodes {

    public static void main(String[] args) {
        System.out.println("Le tableau a une taille de 50 cellules.");
        int[] newTab = creerTab(50);
        int[] newTab2 = remplirTab(newTab, 6);
        System.out.println("Contenu du Tableau aléatoire : " + Arrays.toString(newTab2));
        int tailleNewTab = tailleTab(newTab);
        int minTab = minTab(newTab);
        System.out.println("La valeur min trouvée = " + minTab);
        int maxTab = maxTab(newTab);
        System.out.println("La valeur max trouvée = " + maxTab);
        int nbDefFoisValeur = nbFoisValeur(newTab, 4);
        int sommeTotalValeursTab = sommeValeurs(newTab);
        double moyenneValeursTab = moyenneValeurs(newTab);
        int valeurAChercherTabRemplacer = 3;
        int valeurDeRemplacement = 9;
        int[] valeursTabRemplacées = valeursRemplacées(newTab, valeurAChercherTabRemplacer, valeurDeRemplacement);
        System.out.print("Après remplacement de la valeur " + valeurAChercherTabRemplacer + " par la valeur "
                + valeurDeRemplacement + " voici le contenu du tableau : " + Arrays.toString(valeursTabRemplacées));
        int valeurAChercherPosition = 3;
        int positionValeurRecherchéeTab = positionValeursCellules(newTab, valeurAChercherPosition);
        int valeurAChercherDernièrePosition = 3;
        int dernièrePositionValeurRecherchée = dernièreFoisCellule(newTab, valeurAChercherDernièrePosition);
        System.out.println("La somme des cellules du tableau = " + sommeTotalValeursTab);
        System.out.println("La moyenne des cellules du tableau = " + moyenneValeursTab);
        System.out.println("La valeur " + valeurAChercherPosition + " a été trouvée à la 1ère position N°"
                + positionValeurRecherchéeTab);
        System.out.println("La valeur " + valeurAChercherDernièrePosition + " a été trouvée à la dernière position N°"
                + dernièrePositionValeurRecherchée);

    }

    public static int[] creerTab(int taille) {
        int[] tab = new int[taille];
        return tab;
    }

    public static int[] remplirTab(int[] tab, int valeurMax) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * (valeurMax - 0 + 1)) + 0;
        }
        return tab;
    }

    public static int[] remplirTabFixe(int[] tab, int valeur) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = valeur;
        }
        return tab;
    }

    public static int tailleTab(int[] tab) {
        return tab.length;
    }

    public static void contenuTab(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public static int minTab(int[] tab) {
        if (tab.length == 0) {
            return 0;
        }
        int min = tab[0];
        for (int i = 1; i < tab.length; i++) {
            min = Math.min(min, tab[i]);
        }
        return min;
    }

    public static int maxTab(int[] tab) {
        if (tab.length == 0) {
            return 0;
        }
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            max = Math.max(max, tab[i]);
        }
        return max;
    }

    public static int nbFoisValeur(int[] tab, int valeur) {
        int nbFois = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valeur) {
                nbFois++;

            }
        }
        return nbFois;
    }

    public static int sommeValeurs(int[] tab) {
        int sommeValeurs = 0;
        for (int i = 0; i < tab.length; i++) {
            sommeValeurs += tab[i];
        }
        return sommeValeurs;
    }

    public static double moyenneValeurs(int[] tab) {
        int totalValeurs = 0;
        for (int i = 0; i < tab.length; i++) {
            totalValeurs += tab[i];
        }
        int moyenneValeurs = totalValeurs / tab.length;
        return moyenneValeurs;
    }

    public static int[] valeursRemplacées(int[] tab, int valeurAChercher, int valeurDeRemplacement) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valeurAChercher) {
                tab[i] = valeurDeRemplacement;

            }
        }
        return tab;
    }

    public static int positionValeursCellules(int[] tab, int valeurAChercher) {
        int positionCelluleRecherchée = -1;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valeurAChercher) {
                positionCelluleRecherchée = i;
                break;
            }
        }
        return positionCelluleRecherchée;
    }

    public static int dernièreFoisCellule(int[] tab, int valeurAChercher) {
        int positionDernièreCelluleRecherchée = -1;
        for (int i = tab.length - 1; i >= 0; i--) {
            if (tab[i] == valeurAChercher) {
                positionDernièreCelluleRecherchée = i;
                break;

            }
        }
        return positionDernièreCelluleRecherchée;
    }
}
