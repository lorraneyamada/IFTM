import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    // codigos para entrada de dados
	    int idade = s.nextInt();
	   
	   if (idade <0) {
	       System.out.println("impossível calcular");
	   } else {
	       int soma = 0;
	       int i = 0;
	       
	       while (idade >=0) {
	           soma += idade;
	           i++;
	           
	           idade = s.nextInt(); //leitura da próxima; inserir
	       }
	       
	       // média com double
	       double media = (double) soma / i;
	       
	       System.out.printf ("%.2f\n", media);
	  
	            
	        }

	    // codigos para realização de calculo
	    // codigos para saida de dados
	}
}
