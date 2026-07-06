import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt(); // eleitores
	    
	    int c1=0 , c2 = 0, c3=0, nulos = 0, brancos =0;
	    
	    int i =0;
	    
	    while (i<n){
	        
	        int voto = s.nextInt();
	        
	        if (voto==1) {
	            c1++;
	        } else if (voto==2) {
	            c2++;
	       } else if (voto==3) {
	           c3++;
	       } else if (voto==4) {
	           nulos++;
	       } else if (voto ==5) {
	           brancos++;
	       }
	       
	       i++;
	       
	       }
	       System.out.println("Candidato1: votos " + c1);
	       System.out.println("Candidato2: votos " + c2);
	       System.out.println("Candidato3: " + c3);
	       System.out.println("Nulos: " + nulos);
	       System.out.println("Brancos: " + brancos);

	    
	    // codigos para entrada de dados
	    // codigos para realização de calculo
	    // codigos para saida de dados
	}
}
