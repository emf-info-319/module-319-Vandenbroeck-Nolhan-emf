package Phraseur;

public class phraseur {

    public static void main(String[] args) {
        String[] sujets = new String [] {"Il" , "Victor" , "Manuel"};
        String[] verbres = new String[]{"mange","ragarde", "bois", "monte"};
        String[] choses = new String[]{"une table", "un pc ", "une fondu", "la tété"};

        for (int i = 0; i < 10; i++) {
            
        
        System.out.println(choisirMot(sujets) + " " + choisirMot(verbres) + " " +choisirMot(choses));}

    }

    public static int nbreAleatoire(int max, int min) {
        int nombreAleatoire = (int) (Math.random() * (max - min + 1)) + min;

        return nombreAleatoire;
    }

    public static String choisirMot(String[] tab) {
        int indiceMin = 0;      
        int indiceMax = tab.length-1;
        return tab[nbreAleatoire(indiceMax, indiceMin)];
    }
}
