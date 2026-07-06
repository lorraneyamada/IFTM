import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	   int c1=0,  c2=0, c3=0, c4=0, c5=0;
	   int voto;
	   
	   voto = s.nextInt();
	   
	    while (voto > 0 && voto <=5 ) {
	  
	  
	        if (voto==1){
	        c1++;
	        
	       } else if (voto==2){
	            c2++;
	            
	        } else if(voto==3) {
	           c3++;
	           
	       } else if (voto==4) {
	           c4++;
	           
	       } else if (voto==5) {
	            c5++;
	            
	       }
	       
	       voto = s.nextInt();
	       
	    }
	       
	       System.out.println("Candidato1: votos " +c1);
	       System.out.println("Candidatos2: votos " +c2);
	       System.out.println("Candidatos3: votos " +c3);
	       System.out.println("Nulos: votos" +c4);
	       System.out.println("Brancos" + c5);

	    
	    // codigos para entrada de dados
	    // codigos para realização de calculo
	    // codigos para saida de dados
	}
}
