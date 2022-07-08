import java.util.Scanner;
public class questão04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		double num = entrada.nextInt();
		
		
		if(num % 2 == 0) {
			System.out.println("Numero par, e sua raiz quadrada é " + Math.sqrt(num));
		}
		if(num % 2 != 0) {
			System.out.println("Numero impar, o resultado elevado ao quadrado é " + num * num);
		}
		
		entrada.close();
		
	}

}
