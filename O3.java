
import java.util.Scanner;

public class O3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Skriv inn et heltall som er større enn 0: ");
		int n = scanner.nextInt();
		
		if (n <= 0) {
			System.out.println("Tallet må være større enn 0.");
		} else {
			long fakultet = 1;
			
			for (int i = 1; i <= n; i++) {
				fakultet *= i;
			}
			
			System.out.println(n + "! = " + fakultet);
		}
		
		scanner.close();
	}

}
