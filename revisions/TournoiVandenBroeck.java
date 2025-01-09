import javax.crypto.Mac;

public class TournoiVandenBroeck { 
    public final static String [] EQUIPES = new String [] { "FC Richemont", "FC Central", "FC Schoenberg", 
    "FC Beauregard", "Team AFF", "Etoile Sport"};
    public final static int MAX_GOAL = 10;
    public static void main(String[] args) {
       int [] pointsEquipes = new int [EQUIPES.length];
       for (int i = 0; i < EQUIPES.length; i++) {
            simuleMatch(i, i++);
            if(i==EQUIPES.length-1){simuleMatch(i, 0);}
       }
    }
    public static void simuleMatch(int[] pointsEquipes, int index1, int index2){
     int scoreEquipe1 = (int) (Math.random() * (MAX_GOAL-0+1) + 0);
     int scoreEquipe2 = (int) (Math.random() * (MAX_GOAL-0+1) + 0);
     if(scoreEquipe1>scoreEquipe2){ int pointsEquipe1 = pointsEquipes[index1] + 1;
     System.out.println("L’équipe" +EQUIPES[index1] "a gagné contre l’équipe Y") ;
    
     }
    }
}
