import java.util.Locale;
import java.util.Scanner;



public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 10.333999;
		
		//Entrada de dados
		Scanner sc = new Scanner(System.in);
		
		String x1;
		x1 = sc.next();
		System.out.println("Digite um numero: " + x1);		
		
		// Entrada de numeros inteiros
		int x2 ;
		x2 = sc.nextInt();
		System.out.println("Digite um num: " + x2);
		
		sc.close();
		
		System.out.printf("%.2f%n", x);
		// Variável de ponto flutuante
		System.out.printf("%.4f%n", x);
		System.out.print(x);
		System.out.println("Holla mundo!");
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);

	}

}
