package bull;

import java.util.Scanner;

public class banda {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Principal c1 = new Principal();
		
		System.out.println("nome do catioro");
		c1.Novonome(teclado.nextLine());
				
		
		int opcao;
		do {
		opcao = teclado.nextInt();
		switch(opcao) {
		case 1: c1.comer();
		break;
		case 2: c1.andar();
		break;
		case 3: c1.dormir();
		break;
		case 4: System.out.println("morreu");
		  }			
		}while(opcao!=4);
	  }
	}
