public class ExercicesMethodesTableaux {
public static void main(String[] args) {
    int [] newtab = creerTab(9);
   System.out.println(newtab[5]);

}

    public static int[] creerTab(int taille){
    int [] tab = new int[taille];
    return tab;

    }

    public static int[] remplissagefixe(){
        for (int i = 0; i > creerTab(i).length; i++)
        i = 10;
        return i;

    }
}
