package programacao_relogio;

public class Relogio {
		
	// Classe relógio em java
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hora, minuto, segundo;
		for (hora=0; hora<24; hora++) {
			for(minuto=0; minuto<60;minuto++) {
				for(segundo=0;segundo<60;segundo++) {
					try {
						Thread.sleep(1000);
						if(segundo == 1) {
							System.exit(0);
						}
						
					}catch(InterruptedException erro){
						erro.toString();
					}
				}
			}			
		}
		System.exit(0);
	}

}
