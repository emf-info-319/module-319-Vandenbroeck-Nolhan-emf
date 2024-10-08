package devoirs.devoir04;
// vient tous seul quand je mets les formatage  de date trouvé sur internet
import java.text.DateFormat; 
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class devoir04 {
    public static void main(String[] args) {
        int year = 2024;
        int month = 4;
        int day = 31;

        String datePasConvertie = day + "." + month + "." + year;

        boolean datePasValide = false;

        switch (month) {
            case 1:
                if (day < 1 || day > 31) {
                    datePasValide = true;
                }
                break;
            case 2:
                boolean anneeBis = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                if (anneeBis) {
                    if (day < 1 || day > 29) {
                        datePasValide = true;
                    }
                } else {
                    if (day < 1 || day > 28) {
                        datePasValide = true;
                    }
                }
                break;
            case 3:
                if (day < 1 || day > 31) {
                    datePasValide = true;
                }
                break;
            case 4:
                if (day < 1 || day > 30) {
                    datePasValide = true;
                }
                break;
            case 5:
                if (day < 1 || day > 31) {
                    datePasValide = true;
                }
                break;
            case 6:
                if (day < 1 || day > 30) {
                    datePasValide = true;
                }
                break;
            case 7:
                if (day < 1 || day > 31) {
                    datePasValide = true;
                }
                break;
            case 8:
                if (day < 1 || day > 31) {
                    datePasValide = true;
                }
                break;
            case 9:
                if (day < 1 || day > 30) {
                    datePasValide = true;
                }
                break;
            case 10:
                if (day < 1 || day > 31) {
                    datePasValide = true;
                }
                break;
            case 11:
                if (day < 1 || day > 30) {
                    datePasValide = true;
                }
                break;
            case 12:
                if (day < 1 || day > 31) {
                    datePasValide = true;
                }
                break;
            default:
                datePasValide = false;
        }
        
        System.out.println("===========================================");
        System.out.println("La date entrée est le " + datePasConvertie);
        if (year <= -1 || year >= 10000){
            System.out.println("L'année [" + year + "] est hors limites !");
        } else if (month <= 0 || month >= 13) {
            System.out.println("Le mois [" + month + "] est hors limites !");
        } else if (datePasValide) {
            System.out.println("Le jour [" + day + "] est hors limites !");
        } else {
            LocalDate date = LocalDate.of(year, month, day);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
            String formattedDate = date.format(formatter);
            System.out.println("La date formatée est le " + formattedDate);
        }
        System.out.println("===========================================");

    }
}
