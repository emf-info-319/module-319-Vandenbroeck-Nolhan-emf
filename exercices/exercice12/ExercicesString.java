package exercices.exercice12;

public class ExercicesString {
    public static void main(String[] args) {
        String maChaineDeCaractere = "Voici du contenu stocké dans un String";
        System.out.println("Nombre de caractères contenu dans la variable maChaineDeCaractere : " + maChaineDeCaractere.length());
        int startIndex = maChaineDeCaractere.indexOf("contenu");
        System.out.println("Le mot contenu commence à la position : " + startIndex);
        String lettrePosition10 = maChaineDeCaractere.substring(10, 11);
        System.out.println("Le position 10 contient la lettre : " + lettrePosition10);
        String nomPrenom = "Nolhan";
        for (int i = 1; i< nomPrenom.length(); i++){
        String lettrePrenom = nomPrenom.substring(i, i+1);
        for (int a = 1; a< nomPrenom.length(); a++){
        System.out.println("La lettre à la position " + a + " est " +nomPrenom);}
    }}
}
