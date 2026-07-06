import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    // criar dois vetores com 5 posições
	    double vet1 [] = new double[5];
	    double vet2 [] = new double[5];
	    
	    double soma1 = 0;
	    double soma2 = 0;
	    double media1 = 0;
	    double media2 = 0;
	    
	    // criar uma estrutura de repetição(5x) para preencher o primeiro vetor.
	    for (int i=0; i<5; i++){
	        vet1[i] = s.nextDouble();
	        soma1 += vet1[i];
	        
	    media1 = soma1/i;
	        
	    }
	    
	    for (int j=0; j<5; j++){
	        vet2[j] = s.nextDouble();
	        soma2 += vet2[j];
	        
        media2 = soma2/j;
	    }
	    
	    
	    System.out.printf("%.2f\n", media1);
	    System.out.printf("%.2f\n", media2);

	}
}
