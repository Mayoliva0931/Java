import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		 int a, b, c;
		 
		 System.out.print("Digite o 1º número: ");
		 a = entrada.nextInt();
		 System.out.print("Digite o 2º número: ");
		 b = entrada.nextInt();
		 System.out.print("Digite o 3º número: ");
		 c = entrada.nextInt();
		 
		if(a < b) {
			if(b < c) {
				System.out.println(a+" - "+b+" - "+c);
				}else if(a < c) {
				System.out.println(a+" - "+c+" - "+b);
			}else {
				System.out.println(c+" - "+a+" - "+b);
				}
		}
		
		else if(b < c) {
			if(a < c) {
				System.out.println(b+" - "+a+" - "+c);
			}else{
				System.out.println(b+" - "+c+" - "+a);
			}
		}else {
				System.out.println(c+" - "+b+" - "+a);
				}
		}

	}
