package revisions;

public class rounds {
    public final static double PI = 3.14;

    public static void main(String[] args) {
        int[] rayons = new int[10];
        int min = 1;
        int max = 10;
        for (int i = 0; i < rayons.length; i++)
            rayons[i] = genreNombre(min, max);
        for (int a = rayons.length - 1; a >= 0; a--) {
            if (rayons[a] > 50) {
                System.out.println(PI * rayons[a]);
            } else {
                System.out.println(PI * 2 * rayons[a]);
            }
        }
    }

    public static int genreNombre(int min, int max) {
        int nombreAleatoire = (int) (Math.random() * (max - min + 1)) + min;
        return nombreAleatoire;
    }
}
