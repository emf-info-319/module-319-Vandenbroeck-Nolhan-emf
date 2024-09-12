package exercices.exercice08;

public class ExerciceBoucles1 {
    // !!! for = tant que (g >= 1 ) --> tant que g est plus grand ou égal à 1 il
    // faut refaire la boucle !!!
    public static void main(String[] args) {
        for (int a = 1; a <= 5; a++) {
            System.out.println("Boucle for, itération " + a);// boucles "for" 1 à 5
        }
        int b = 0;
        while (b < 5) {
            b++;
            System.out.println("Boucle while, itération " + b); // boucles "while" 1 à 5
        }
        int a = 0;
        do {
            a++;
            System.out.println("Boucle do-while, itération " + a); // boucles "do-while" 1 à 5

        } while (a <= 4);
        for (int c = 1; c <= 5; c++) {
            System.out.println("Boucle for, itération " + c); // boucles "for" 1 à 5 sans le 3
            if (c == 2) {
                c = 3;
            }
        }
        int d = 0;
        while (d < 5) {
            d++;
            System.out.println("Boucle while, itération " + d); // boucles "while" 1 à 5 sans 4 et 5
            if (d == 3) {
                d = 15;
            }
        }
        System.out.println("Boucle for: "); // décompte "for" de 1 à 5
        for (int g = 5; g >= 1; g--) {
            System.out.println(g);
        }
        System.out.println("décolage !!");

        b = 6;
        System.out.println("Boucle while: ");
        while (b > 1)
        {
            b--;
            System.out.println(b);
        }
            System.out.println("Décollage !!"); //dcéompte "while" 5 à 1

             a = 6;
             System.out.println("Boucle do-while: ");
        do {
            a--;
            System.out.println(a); //décompte "do-while" 5 à 1
         } 
            while (a > 1);
            System.out.println("Décollage !!");
            
        
    }
}
