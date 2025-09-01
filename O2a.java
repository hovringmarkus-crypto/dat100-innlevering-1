
import java.util.Scanner;

public class O2a {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Skriv inn poengsum som heltall: ");
		
		int poengsum = scanner.nextInt();
		scanner.close();
		
		if (poengsum < 0 || poengsum > 100) {
			System.out.println("ugyldig poengsum (negativ verdi eller over 100)");
			return;
		}
		
		char karakter;
		
		if (poengsum >=90) {
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

}
