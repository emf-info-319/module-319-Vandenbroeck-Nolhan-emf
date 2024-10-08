package devoirs.devoir05;

public class devoir05 {
    public static void main(String[] args) {
        // le joueur 1 réfléchie à un nombre
        // le joueur 2 donne un chiffre
        // le joueur 1 dit sois plus petit soit plus grand soit c'est correct
        int nbre = (int)( Math.random() * ( 1 - 100 + 1 )) + 1;
Scanner scanner = new Scanner( System.in );
for(int valeur = scanner.nextInt() ; valeur != nbre;){
System.out.print( "Entrez une valeur svp : " );
valeur = scanner.nextInt();
scanner.nextLine();
scanner.close();
if (valeur > nbre) {System.out.println("trop grand !");}
else if (valeur < nbre) {System.out.println("trop petit !");}
   if (valeur == nbre) {System.out.println("Bravo, trouvé !");}
        }
   } 
}

    

