import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    // codigos para entrada de dados
	    // codigos para realização de calculo
	    // codigos para saida de dados
	
	 //System.out.print 
	 
	    double nota = s.nextDouble();
	    
	    if (nota <= 0 || nota > 22) {
	        System.out.println("Nota invalida."); 
	   	  
	   	      } else {
	   	         double x=(nota*100)/22;
	            System.out.printf ("Eu espero tirar %.2f%% da nota", x);
	   	      }
	}
}