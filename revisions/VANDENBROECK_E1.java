public class VANDENBROECK_E1 {
    public final static int MIN = 2;
    public final static int MAX = 14;

    public static void main(String[] args) {
        String[] joueurs = new String[] { "Jacques", "Pierre", "Paul" };
        int[] scores = new int[joueurs.length];
        boolean jeuTermine = false;
        while (jeuTermine == false) {
            for (int i = 0; i < joueurs.length; i++) {
                int carte = tirerUneCarte();
                if (carte > 10) {
                    scores[i] += 11;
                } else {
                    scores[i] += carte;
                }
                System.out.println(joueurs[i] + " a tiré la carte " +donnerNomCarte(carte));
                System.out.println("     Nouveau score : " + scores[i] );
                if (scores[i] == 21) {
                    System.out.println(joueurs[i] + " a gagné !! ");
                    jeuTermine = true;
                    break;
                } else if (scores[i] > 21) {
                    jeuTermine = true;
                    determinerIndexGagnant(scores);
                    System.out.println(joueurs[i] + " a gagné !! ");
                    break;

                }
                
            }
         
        } 
        
    }

    public static int tirerUneCarte() {

        int nombreAleatoire = (int) (Math.random() * (MAX - MIN + 1) + MIN);
        return nombreAleatoire;
    }

    public static int determinerIndexGagnant(int[] scores) {
        int nombreMaxTrouver = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] <= 21) {
                if (scores[i] > nombreMaxTrouver) {
                    nombreMaxTrouver = scores[i];
                
                }
                break;
            }

        }

        return nombreMaxTrouver;
    }

    public static String donnerNomCarte(int carte) {
        String resultat = "indéterminé";

        if (carte >= 2 && carte <= 10) {
            resultat = String.valueOf(carte);

        } else if (carte > 10) {

            switch (carte) {
                case 11:
                    resultat = "valet";
                   
                    break;
                case 12:
                    resultat = "dame";
                    
                    break;
                case 13:
                    resultat = "roi";
                    
                    break;
                case 14:
                    resultat = "as";
                    
                    break;
                default:
                    resultat = "indéterminé";
                  
                    break;
            }
            
        }
        return resultat;
    }
}
