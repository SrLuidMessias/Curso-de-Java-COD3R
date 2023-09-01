package fundamentos;
import javax.swing.JOptionPane;
public class DesafioAreaDoTriangulo {
	public static void main(String []x) {
		String valorBase = JOptionPane.showInputDialog("Digite a base : ");
		String valorAltura = JOptionPane.showInputDialog("Digite a altura : ");
		double base = Double.parseDouble(valorBase);
		double altura = Double.parseDouble(valorAltura);
		double area = (base * altura) / 2;
		System.out.printf("Sua area e : %s", area);
			
		
		
		
		
	}
}
