package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class processoSeletivo {
	
	public static void main(String[] args) {
					
	
	}
	
	static void selecaoCandidatos () {
		String []candidatos = {"FELIPE","MARCIA","JULIA","PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
		
		
		int candidatosSelecionados = 0; 
		int candidatosAtual = 0; 
		while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
		double salarioBase = 2000.0;	
			String candidato = candidatos[candidatosAtual]; 
		double salarioPretendido = valorPretendido(); 
		
		System.out.println("O candidato" + candidato + "Solicitou este valor de salário");
		if (salarioBase >= salarioPretendido) {
		System.out.println("O candidato" + candidato + "Foi selecionado para a vaga");
			candidatosSelecionados ++;
			
		}
			
		  candidatosAtual++; 
			}
		
	}
				
		static double valorPretendido () {
			return ThreadLocalRandom.current().nextDouble (1800, 2200);
							
		}

	
	static void analisarCandidato (double salarioPretendido) {
	
	    	double salarioBase = 2000.0;
	    
	    	if (salarioBase > salarioPretendido) { 
	     System.out.println("LIGAR PARA O CANDIDATO");
	    } 
	    
	    
	    else if (salarioBase == salarioPretendido) {
	    	 System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
	    }
	
	    else { 
	    		System.out.println("NO AGUARDO DO RESULTADO DOS DEMAIS CANDIDATOS");
	    	
	    }
    

	}
	    	    
            
}
	    	
	    
	     
	     
	

