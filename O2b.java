import java.util.Scanner;

public class O2b {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 1; i <= 10; i++) {
		System.out.print("Student " + i + ". Skriv inn poengsum som heltall: ");
		int poengsum = scanner.nextInt();
		
		if (poengsum < 0 || poengsum > 100) {
			System.out.println("ugyldig poengsum (negativ verdi eller over 100)");
			
		} else {
			
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
	scanner.close();
   }
}
