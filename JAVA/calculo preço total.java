/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in); // entrada
		int codigo = s.nextInt();
		int quantidade = s.nextInt ();
		double preco = 0.0; //processamento

		if (codigo==1) {
			preco = 4.00;

		} else if (codigo ==2) {
			preco = 2.50;
		} else if ( codigo == 3) {
			preco = 5.00;
		} else if (codigo == 4) {
			preco = 2.00;
		} else {
			preco = 1.50;
		}

		double precoTotal = quantidade * preco;
		// saída
		System.out.printf("total: R$ %.2f\n", precoTotal);
	} else {
	    System.out.println("Código Inválido");
	}
}
