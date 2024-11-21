public class VandenBroeck {
    public final static int NOTE_MIN = 1;
    public final static int NOTE_MAX = 6;
    public final static int NBRE_NOTES = 5;

    public static void main(String[] args) {
        int[] notesObtenues = new int[NBRE_NOTES];

        double totalNote = 0;
        for (int i = 0; i < notesObtenues.length; i++) {
            notesObtenues[i] = (int) (Math.random() * (NOTE_MAX - NOTE_MIN + 1)) + NOTE_MIN;
        }

        for (int i = 0; i < notesObtenues.length; i++) {
            totalNote = totalNote + notesObtenues[i];
            System.out.print("La note obtenue est " + notesObtenues[i]);
            switch (notesObtenues[i]) {
                case 4:
                    System.out.println(" : suffisant");
                    break;
                case 5:
                    System.out.println(" : bien");
                    break;
                case 6:
                    System.out.println(" : très bien");
                    break;

                default:
                    System.out.println(" : insuffisant");

            }
        }
    

    double moyenne = totalNote / NBRE_NOTES;
    
    if(moyenne>4)
    {
        System.out.println("L'élève est promu !");
    }
    else 
    {
        System.out.println("L'élève est non promu !");
    }
}
}
