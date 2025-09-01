
import java.util.Scanner;

public class O1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Skriv inn din bruttoinntekt i kr: ");
		
		double inntekt = scanner.nextDouble();
		scanner.close();
		
		double skatt = 0.0;
		
		double[] grenser = {1_410_750, 942_400, 697_150, 306_050, 217_400};
		double[] satser = {0.177, 0.167, 0.137, 0.04, 0.017};
		
		double gjenstående = inntekt;
		
		for (int i = 0; i < grenser.length; i++) {
			if (gjenstående > grenser[i]) {
				double beløp = gjenstående - grenser[i];
				skatt += beløp * satser[i];
				gjenstående = grenser[i];
			}
		}
		
	System.out.printf("Trinnskatt: %.2f kr%n", skatt);	
	    	
	}
	
}
