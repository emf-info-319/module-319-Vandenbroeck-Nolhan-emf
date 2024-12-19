package remed;

import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public class E1VandenBroeck {
    public final static int DES_MIN = 1;
    public final static int DES_MAX = 6;
    public final static int NOMBRE_TUILES = 12;
    public final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] tuiles = new int[NOMBRE_TUILES];
        boolean enJeu = true;
        System.out.println("**********************************");
        System.out.println("*         Shut The Box           *");
        System.out.println("**********************************");
        for (int i = 0; i < tuiles.length; i++) {
            tuiles[i] = (1 + i);
        }
        int i = 0;
        while (enJeu) {
            afficheTuiles(tuiles);
            int totalDes = tireLesDes();
            System.out.println("Donnez le(s) nombre(s) à enlever : ");
            tuiles = enleveTuiles(tuiles, totalDes);
            boolean encore = contientEncoreDesTuilesABaisser(tuiles);
            if (encore == false) {
                System.out.println("Jeu terminé ");
                SCANNER.close();
            }

        }

    }

    public static void afficheTuiles(int[] tab) {
        System.out.print("|");
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 0) {
                System.out.print("__");
            } else if (tab[i] < 10) {
                System.out.print("0" + tab[i]);
            } else {
                System.out.print(tab[i]);
            }
            System.out.print("|");
        }

    }

    public static int tireLesDes() {
        int nombreAleatoire1 = (int) (Math.random() * (DES_MAX - DES_MIN + 1)) + DES_MIN;
        int nombreAleatoire2 = (int) (Math.random() * (DES_MAX - DES_MIN + 1)) + DES_MIN;
        int resultat = nombreAleatoire1 + nombreAleatoire2;
        System.out.println(" Les nombres tirés sont : " + nombreAleatoire1 + " et " + nombreAleatoire2
                + "  qui font un total de " + resultat);
        return resultat;

    }

    public static int[] enleveTuiles(int[] tuiles, int totalDes) {
        int[] tuilesTemp = copieTableau(tuiles);
        int totalEnleve = 0;
        boolean demandeEncore = true;
        do {
            int valeur = SCANNER.nextInt();
            totalEnleve =+ valeur;
            if (valeur == 0) {
                System.out.println(" Abandon… ");
                for (int i = 0; i < tuilesTemp.length; i++) {
                    tuilesTemp[i] = 0;
                }
                tuiles = copieTableau(tuilesTemp);
                demandeEncore = false;
            }

            else if (valeur < 1 || valeur > tuilesTemp.length) {
                System.out.println(" Hors limites ! ");
                totalEnleve = 0;
            }

            else if (tuilesTemp[valeur - 1] == 0) {
                System.out.println("Vous avez déjà baissé la tuile à la position " + valeur);
                totalEnleve -=valeur;
            } else {
                if (totalEnleve < totalDes) {
                    tuilesTemp[valeur - 1] = 0;
                    System.out.println("Ce n'est pas suffisant, merci d'enlever encore");
                } else if (totalEnleve > totalDes) {
                    System.out.println("Le total est dépassez, choisissez d'autres nombres");
                    tuilesTemp = copieTableau(tuiles);
                    totalEnleve = 0;
                    afficheTuiles(tuiles);
                } else {
                    tuilesTemp[valeur - 1] = 0;
                    System.out.println(" Parfait ! ");
                    tuiles = copieTableau(tuilesTemp);
                    demandeEncore = false;
                }
            }
        } while (demandeEncore);
        return tuiles;

    }

    public static int[] copieTableau(int[] tab) {
        int[] copie = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            copie[i] = tab[i];
        }
        return copie;

    }

    public static boolean contientEncoreDesTuilesABaisser(int[] tab) {
        boolean resultat = false;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != 0) {
                resultat = true;
                break;
        }
    }
    return resultat;
}}
