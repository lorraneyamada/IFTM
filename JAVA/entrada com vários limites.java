import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    // codigos para entrada de dados
	    // codigos para realização de calculo
	    // codigos para saida de dados
	    
	    double numero = s.nextDouble();
	    
	   
	    if (numero >= 0 && numero <=200 || numero == 1000) {
	    
	    System.out.println("Valido"); 
	        
	       } else {
	            System.out.println ("Invalido");
	        }
	}
}
