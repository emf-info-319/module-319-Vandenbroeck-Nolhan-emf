package exercices.exercice04;

public class EchangeValeurs {public static void main(String[] args) {
    int variable1 = 10;
    int variable2 = 7;
    System.out.println("le contenu de la variable 1 est " +variable1);
    System.out.println("le contenu de la variable 2 est " +variable2);
System.out.println(".... Traitement ....");
    int variable3 = variable1;
    variable1 = variable2;
    System.out.println("le contenu de la variable 1 est " +variable1);
    System.out.println("le contenu de la variable 2 est " +variable3);
    

}

}