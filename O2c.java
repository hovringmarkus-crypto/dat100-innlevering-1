import java.util.Scanner;

public class O2c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            int poengsum;

            
            while (true) {
                System.out.print("Student " + i + ". Skriv inn poengsum som heltall (0–100): ");
                poengsum = scanner.nextInt();

                if (poengsum >= 0 && poengsum <= 100) {
                    break; 
                } else {
                    System.out.println("Ugyldig poengsum. Prøv igjen.");
                }
            }

            char karakter;

            if (poengsum >= 90) {
                karakter = 'A';
            } else if (poengsum >= 80) {
                karakter = 'B';
            } else if (poengsum >= 60) {
                karakter = 'C';
            } else if (poengsum >= 50) {
                karakter = 'D';
            } else if (poengsum >= 40) {
                karakter = 'E';
            } else {
                karakter = 'F';
            }

            System.out.println("Karakter: " + karakter);
        }

        scanner.close();
    }
}
