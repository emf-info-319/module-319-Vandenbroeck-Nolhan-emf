package devoirs.devoir02;

public class devoir02 {
    public final static int CAPACITE_RESERVOIR_A = 3;
    public final static int CAPACITE_RESERVOIR_B = 5;

    public static void main(String[] args) {
        int reservoirA = 0; // capacité de départ du réservoir A
        int reservoirB = 0;// capacité de départ du réservoir B
        int remplissage = (int) (Math.random() * (8 - 1 + 1)) + 1; // nombre aléatoire (MAX - MIN + 1) + 1
        System.out.println("Il y a " + remplissage); // le " à remplir ne marche pas je ne sais pas pourquoi")
        while (reservoirA + reservoirB < remplissage) { // tant que le réservoir A + le B est plus petit que le
                                                        // remplissage il peut continuer a faire la boucle (mais c'est
                                                        // la que cela ne marche pas)
            for (; reservoirA < CAPACITE_RESERVOIR_A; reservoirA++) { // tant que le réservoir A est plus petit ou égale
                                                                      // à
                                                                      // la Capacité du réservoir A, on rajoute 1 au
                                                                      // réservoir A
                System.out.println("Remplissage du réservoir A");
                System.out.println(" Le réservoir A : " + reservoirA + reservoirB);
            } // la nom plus le "le réservoir B " ne marche pas
            for (; reservoirB <= CAPACITE_RESERVOIR_B; reservoirB++) {
                System.out.println("remplissage du réservoir B");
                System.out.println("Le réservoir A: " + reservoirA + reservoirB); // même problème
            }
        }

    }

}
