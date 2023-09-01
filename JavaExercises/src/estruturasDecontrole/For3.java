package estruturasDecontrole;
//apresentação do "Debug"
//Dois cliques na saida "sout"
//e depois em Debug
//F6 para passo a passo
public class For3 {
	public static void main(String []args) {
//com vai funcionar...primeiro inicia o for do "i" com 0
//e depois inicia 10 vezes o "j", quando completar as 10 vezes
//o "i" inicia com 1. e isso vai até 99
//Para inspecionar se o comando é verdadeiro ou não pressione- Crtl+Shift+i
	for (int i = 0; i < 10;  i++) {
		for (int j = 0; j < 10; j++) {
			System.out.printf("[%d %d]", i, j);
		}
		System.out.println(); //pular a linha quando chegar a 10
	}
/*
*Caso queira usar fora do laço "for" a vareavel "i" não estará desponível,
*pois "i" só tem área (escopo, ou é visivel) dentro do bloco associado ao "for"
*E só é possível utilizar quando "i" é declarada no começo, ou antes do laço for.
*Caso queira criar uma nova vareavel "i" fora do laço "for" é totalmente possível! 
 */

}
}

		


