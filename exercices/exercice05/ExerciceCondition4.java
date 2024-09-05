package exercices.exercice05;

public class ExerciceCondition4 {
    public static void main(String[] args) {
        int temperature = 17;
        if (temperature < -10 ) {System.out.println("il fait très froid");}
        if (temperature >= -10 && temperature < 0) {System.out.println("il fait froid");}
        if (temperature >= 0 && temperature < 25) {System.out.println("il fait normal");}
        if (temperature > 35) {System.out.println("il fait très chaud");}
    }
}
