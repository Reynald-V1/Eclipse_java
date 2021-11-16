package projAlunos;

import java.util.Scanner;


public class Sistema {
	
	public static void main(String[] args) {
	int opcao;	
		Aluno A1 = new Aluno();
		Aluno A2 = new Aluno();
		Aluno A3 = new Aluno();
        Scanner entrada = new Scanner(System.in);
        
        
		do {
		System.out.println("--------------------------------------------------------- \r\n"
				+ "MENU PRINCIPAL \r\n"
				+ "--------------------------------------------------------- \r\n"
				+ "1 - CADASTRAR ALUNOS \r\n"
				+ "2 - CADASTRAR NOTAS \r\n"
				+ "3 - CALCULAR MÉDIAS \r\n"
				+ "4 - INFORMAR SITUAÇÕES \r\n"
				+ "5 - INFORMAR DADOS DE UM ALUNO  \r\n"
				+ "6 - ALTERAR NOTA \r\n"
				+ "7 - SAIR \r\n"
				+ "---------------------------------------------------------");
		
		opcao = entrada.nextInt();
		switch(opcao) {
		case 1:
		
			//limpeza do buffer
			A1.setnome(entrada.nextLine());
			
			System.out.println("digite o nome do aluno 1: ");
			A1.setnome(entrada.nextLine());
			System.out.println("digite a matricula: ");
			A1.setmat(entrada.nextInt());
			
			A1.mostradado();
			
			//limpeza do buffer
			A2.setnome(entrada.nextLine());
			
			System.out.println("digite o nome do aluno 2: ");
			A2.setnome(entrada.nextLine());
			System.out.println("digite a matricula: ");
			A2.setmat(entrada.nextInt());
			
			A2.mostradado();
			
			//limpeza do buffer
			A3.setnome(entrada.nextLine());
			
			System.out.println("digite o nome do aluno 3: ");
			A3.setnome(entrada.nextLine());
			System.out.println("digite a matricula: ");
			A3.setmat(entrada.nextInt());
			
			A3.mostradado();
			break;
			
		case 2:
			A1.setnota(entrada.nextFloat(), entrada.nextFloat(), entrada.nextFloat());
			
			A2.setnota(entrada.nextFloat(), entrada.nextFloat(), entrada.nextFloat());
			
			A3.setnota(entrada.nextFloat(), entrada.nextFloat(), entrada.nextFloat());
			break;
			
		case 3:
			System.out.println("aluno 1");
			A1.calcularmed();
			System.out.println("aluno 2");
			A2.calcularmed();
			System.out.println("aluno 3");
			A3.calcularmed();
			break;
			
		case 4:
			
			
			default:
			System.out.println("invalido.");
				break;
		
		}
		
		
		}while (opcao!=7);
	}
}
