package devoirs.devoir01;

public class devoir01 {
    public static void main(String[] args) {
        int monAge = 10;
        boolean estMajeur;
        if (monAge > 20) {
            estMajeur = true;
        } else {
            estMajeur = false;
        }
        if (estMajeur) {
            System.out.println("Je suis Majeur");
        } else {
            System.out.println("Je suis mineur");
        }
        if (monAge > 18) {
            System.out.println("J'ai le droit de voter");
        } else {
            System.out.println("Je n'ai pas le droit de voter");
        }
        System.out.println("Je m'appelle Nolhan Vanden Broeck");
        System.out.println("Mon âge est de " + monAge + " ans");
        String formation = "Informatique";
        String Informatique = "Informatique";
        if (formation == Informatique) {
            System.out.println("Je suis apprenti en informatique");
        } else {
            System.out.println("Je suis apprenti en industrie");
        }
    }
}
