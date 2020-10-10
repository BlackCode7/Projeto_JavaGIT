
public class Main3 {
	
	// Métodos compara numero
	public static boolean comparaNum(int a, int b) {
		boolean result = a > b && a != 0;
		return result;		
	}
	
	// Metodo compara 2
	public static boolean comparaNum2(int x, int y) {
		boolean result2 = x <= y || x > 5;
		return result2;
	}
	
	// Método compara 3	
	public static boolean comparaNum3(int s, int d) {
		boolean result3 = s > 0 && d > 2 || s != d ;
		return result3;
	}
	
	public static boolean comparaMetodo(int comparaNum2,int comparaNum3) {
		boolean result4 = comparaNum3 >= comparaNum2;
		return result4 ;
	}
	
	// Método para calculo de frequencia Relativa
	public static double frequenciaRelativa(double a1, double a2) {
		double resultFreq = (a1 / a2)*100;
		return resultFreq;
	}
	
	/*REGRA DE STURGES
	 * método matemático para definir
	 * a quantidade de classes da tabela:
	 */
	
	public static void mostraTitulo() {
		System.out.println("_________REGRAS DE STURGES__________");		
	}
		
	
	
	
	// Método para executar
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calculo de frequencia relativa");
		System.out.println(Main3.frequenciaRelativa(21, 322) + "%");		
		
		System.out.println("Operador comparativo &&");
		System.out.println(Main3.comparaNum(10, 5));
		
		System.out.println("Operador comparativo ||");
		System.out.println(Main3.comparaNum2(32, 33));
		
		System.out.println("Operador comparativo && ||");
		System.out.println(Main3.comparaNum3(-1, 0));
		
		System.out.println("Operador comparativo >=");
		System.out.println(Main3.comparaMetodo(20, 65));
		

		Main3.mostraTitulo();

	}

}
