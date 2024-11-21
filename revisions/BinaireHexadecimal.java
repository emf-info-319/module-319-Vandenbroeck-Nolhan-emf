import java.util.Scanner;

public class BinaireHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.print("Veuillez entrer un nombre décimal : ");
int nombreDecimal = scanner.nextInt();

String decimalEnBinaire = Integer.toBinaryString(nombreDecimal);
        
System.out.println("Le nombre binaire est : " + decimalEnBinaire);

scanner.close();
Scanner scanner2 = new Scanner(System.in);
System.out.print("Veuillez entrer un nombre décimal : ");
int nombreDecimal2 = scanner2.nextInt();

String decimalEnHexadecimal = Integer.toBinaryString(nombreDecimal2);
        
System.out.println("Le nombre binaire est : " + decimalEnHexadecimal);

scanner2.close();


    }
}
