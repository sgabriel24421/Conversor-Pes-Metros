import java.util.Scanner;
public class FeetToMeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira 1 para converter Pés para Metros ");
		System.out.println("Insira 2 para converter Metros para Pés ");
		int choice = scan.nextInt();
		
		double feet = 3.2808;
		double meters = 0.3048;
		double converted;
		
		if (choice== 1) {
			System.out.println("Insira a distância em Pés ");
			feet = scan.nextDouble();
			converted = feet*0.3048;
			System.out.println("A distância de Pés para Metros é de " + converted);
			
		}
		else if (choice== 2) {
			System.out.println("Insira a distância em Metros ");
			meters = scan.nextDouble();
			converted = meters*3.2808;
			System.out.println("A distância em Metros para Pés é de " + converted);
		}
	}

}
