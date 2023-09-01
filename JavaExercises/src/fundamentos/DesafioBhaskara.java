package fundamentos;
import java.util.Scanner;
public class DesafioBhaskara {
	public static void main(String[]x) {
		System.out.println("-------Equação do segundo grau-------");
		System.out.println("Na ordem B -> A -> C");
		Scanner entrada = new Scanner(System.in);
		//DELTA
		System.out.println("Equação: ax² + bx + c = 0");
		
		System.out.println("Escreva o número do coeficiente A");
		Double a = entrada.nextDouble();		
		System.out.println("Escreva o número do coeficiente B");
		Double b = entrada.nextDouble();
		System.out.println("Escreva o número do coeficiente C");
		Double c = entrada.nextDouble();
		
		double delta = (b * b)- (4 * a * c);
		
		System.out.printf("Delta = %.2f",delta);
		//X1 e X2
		double x1 = (-b + Math.sqrt(delta))/ (2 * a);
		double x2 = (-b - Math.sqrt(delta))/ (2 * a);
		System.out.printf("\nO valor de x1 = %.2f ", x1);
		System.out.printf("\n O valor de x2 = %.2f", x2);
		entrada.close();
	}
}
