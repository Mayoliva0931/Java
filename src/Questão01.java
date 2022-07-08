import java.util.Scanner;

public class Questão01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Digite a primeiro número: ");
		num1 = entrada.nextInt();
		
		System.out.println("Digite a segundo número: ");
		num2 = entrada.nextInt();
		
		System.out.println("Digite a terceiro número: ");
		num3 = entrada.nextInt();
		
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O maior número é: " + num1);
			
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("O maior número é: " + num2);
			
			}else {
				System.out.println("O maior número é: " + num3);
			}
		}

   }


