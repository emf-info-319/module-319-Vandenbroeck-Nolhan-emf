package remed;

public class codageEnRound {
    public final static String[] ELEVES = new String[] { "Jean", "Paul", "Matthieu", "Jacques", "Louis", "Emile",
            "Eric", "Julien", "Yvan", "Philipe" };

    public static void main(String[] args) {
        String[] tableau = creerGroupe(4);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i]);
            
        }
    }

    public static String choisirEleve(String[] eleve) {

        int nombreAleatoire = (int) (Math.random() * (ELEVES.length-1 - 0 + 1)) + 0;
        String nomTrouve = ELEVES[nombreAleatoire];
        return nomTrouve;

    }

    public static boolean controlerDoublon(String[] groupe, String nom) {

        boolean nomPresent = false;
        for (int i = 0; i < groupe.length; i++) {
            if (groupe[i]==nom) {
                nomPresent = true;
            }
        }
        return nomPresent;
    }

    public static String[] creerGroupe(int nombreEleves) {
        String[] groupe = new String[nombreEleves];
        String eleves = choisirEleve(groupe);
        boolean estDedans = controlerDoublon(groupe, eleves);
        if (estDedans == false) {
            groupe[0] = eleves;

        }

        else {

            while (estDedans == true) {
                eleves = choisirEleve(groupe);
                estDedans = controlerDoublon(groupe, eleves);
            }
            if (estDedans == false) {
                groupe[0] = eleves;
            }
        }
        for (int i = 0; i < groupe.length; i++) {
            eleves = choisirEleve(groupe);
            estDedans = controlerDoublon(groupe, eleves);
            if (estDedans == false) {
                groupe[i] = eleves;
            }

            else {

                while (estDedans == true) {
                    eleves = choisirEleve(groupe);
                    estDedans = controlerDoublon(groupe, eleves);
                }
                if (estDedans == false) {
                    groupe[i] = eleves;
                }
            }
        }

        return groupe;
    }
}
