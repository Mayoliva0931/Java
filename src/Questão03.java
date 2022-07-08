import java.util.Scanner;

public class Questão03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade = entrada.nextInt();
		
	    if(idade >= 10 ){
	    	if(idade < 14) {
	    		System.out.println("infantil");
	    	}
	    	else if(idade >= 15) {
	    		if(idade < 17) {
	    			System.out.println("Juvenil");
	    		}}
	    	else if(idade >= 18){
	    		if(idade < 25) {
	    			System.out.println("Adulto");}}
		    
	    	}else {
		    System.out.println("Idade não disponivél");
	    	}
		    
	    
	}

}
