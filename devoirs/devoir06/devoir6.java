public class devoir6 {
    public final static int TAILLE_TABLEAU = 20;
    public final static int VALEUR_MIN = 0;
    public final static int VALEUR_MAX = 50;
    public final static int VALEUR_RECHERCHEE = 7;

    public static void main(String[] args) {
int tableau = genereTableau(VALEUR_MIN, VALEUR_MAX, TAILLE_TABLEAU);
System.out.println();
    }

    public static int[] genereTableau(int min, int max, int taille) {
        int[] newtab = new int[taille];
        for (int i = 0; i < newtab.length; i++) {
            newtab[i] = (int) (Math.random() * (VALEUR_MAX - VALEUR_MIN + 1)) + VALEUR_MIN;
        }
        return newtab;
    }

    public static int rechercheMin(int[] tab) {
        int min = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        return min;
    }

    public static int rechercheMax(int[] tab) {
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }
    public static int rechercheValeur(int [] tab, int valeur){
for (int i = 0; i < tab.length; i++){
   if (tab[i] == valeur){ return i;}
}
return -1;
    }
}
