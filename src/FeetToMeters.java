import java.util.Scanner;
public class FeetToMeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira 1 para converter P�s para Metros ");
		System.out.println("Insira 2 para converter Metros para P�s ");
		int choice = scan.nextInt();
		
		double feet = 3.2808;
		double meters = 0.3048;
		double converted;
		
		if (choice== 1) {
			System.out.println("Insira a dist�ncia em P�s ");
			feet = scan.nextDouble();
			converted = feet*0.3048;
			System.out.println("A dist�ncia de P�s para Metros � de " + converted);
			
		}
		else if (choice== 2) {
			System.out.println("Insira a dist�ncia em Metros ");
			meters = scan.nextDouble();
			converted = meters*3.2808;
			System.out.println("A dist�ncia em Metros para P�s � de " + converted);
		}
	}

}
