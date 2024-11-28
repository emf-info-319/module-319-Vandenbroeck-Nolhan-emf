import java.util.Scanner;
public class VANDENBROECK_E2 {
    public final static int NOMBRE_BATONNETS = 21;
    public final static int MIN = 1;
    public final static int MAX = 3;

    public static void main(String[] args) {
        int [] batonnets = new int[NOMBRE_BATONNETS];
        Scanner scanner = new Scanner(System.in);
        for ( int i = 0; i < batonnets.length; i++) {
            batonnets[i] = 1;}
            System.out.println("Bienvenue dans le jeu de Nim !");
            System.out.println("Règles : Vous et l'IA retirez tour à tour entre 1 et 3 bâtonnets.");
            System.out.println("Le joueur qui retire le dernier bâtonnet perd");
            boolean tourJoueur = true;
            while (nbBatonnetRestants(batonnets) > 0) {
                afficherBatonnets(batonnets);
                if (tourJoueur == true) {tourJoueur = false;}
                else if  (tourJoueur == false) {tourJoueur = true;}
                if (tourJoueur == true){
                    int nbEnleve = demanderNombre(scanner);
                    batonnets = enleverBatonnets(nbEnleve, batonnets);
                }
                else {
                    int nbEnleveIA = ( int ) ( Math.random() * ( MAX - MIN + 1 ) ) + MIN;
                    System.out.println("L'IA décide d'enlever " + nbEnleveIA + " bâtons");
                    batonnets = enleverBatonnets(nbEnleveIA, batonnets);
                }
            }
            if (tourJoueur == true ) {
                System.out.println("Vous avez retiré le dernier bâtonnet. L'IA gagne !");}
            else {System.out.println("L’IA a retiré le dernier bâtonnet. Vous gagnez !");}
                
            }
            
    

    public static void afficherBatonnets(int[] batonnets) {

        for (int i = 0; i < batonnets.length; i++) {
            if (batonnets[i] == 1) {
                System.out.print("|");
            } else if (batonnets[i] == 0) {
                System.out.print("-");
            }
        }
        System.out.println("  ");
    }

    public static int nbBatonnetRestants(int[] batonnets) {
        int nbRestants = 0;
        for (int i = 0; i < batonnets.length; i++) {
            if (batonnets[i] == 1) {
                nbRestants++;
            }
        }
        return nbRestants;
    }

    public static int[] enleverBatonnets(int nbEnleve, int[] batonnets) {
        int nbRestants = nbBatonnetRestants(batonnets);
        int nbEnleveMax = 0;
        if (nbEnleve < nbRestants) {
            nbEnleveMax = nbEnleve;
        } else if (nbRestants < nbEnleve) {
            nbEnleveMax = nbRestants;
        }
        for (int i = batonnets.length - 1; i >= 0 && nbEnleveMax > 0; i--) {
            if (batonnets[i] == 1) {
                batonnets[i] = 0;
                nbEnleveMax--;
            }
          
        }
        return batonnets;
    }

    public static int demanderNombre(Scanner scanner) {
        int nbBatonnetEnlever = 0;
        System.out.println("Entrez un nombre entre 1 et 3 ");
        nbBatonnetEnlever = scanner.nextInt();
        while (nbBatonnetEnlever<1 || nbBatonnetEnlever > 3) {
            System.out.println("nombre incorrect");
            nbBatonnetEnlever = scanner.nextInt();
        
        }
 
        return nbBatonnetEnlever;
    }
}
