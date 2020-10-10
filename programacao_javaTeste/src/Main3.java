
public class Main3 {
	
	// Métodos compara numero
	public static boolean comparaNum(int a, int b) {
		boolean result = a > b && a != 0;
		
		return result;		
	}
	
	public static boolean comparaNum2(int x, int y) {
		boolean result2 = x <= y || x > 5;
		
		return result2;
	}
	
	public static boolean comparaNum3(int s, int d) {
		boolean result3 = s > 0 || d > 2 || s != d ;
		return result3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Operador comparativo &&");
		System.out.println(Main3.comparaNum(10, 5));
		
		System.out.println("Operador comparativo ||");
		System.out.println(Main3.comparaNum2(32, 33));
		
		System.out.println("Operador comparativo ||");
		System.out.println(Main3.comparaNum3(1, 5));

	}

}
