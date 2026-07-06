import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    // codigos para entrada de dados
	   
	   int numero = s.nextInt();
	
	   if (numero >=10 && numero<=200 && numero % 2 ==0) 
	   	  	    System.out.println("Válido");
	        else {
	            System.out.println("Inválido");
	        }
	}
}
