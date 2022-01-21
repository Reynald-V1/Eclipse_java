package visao; 
import java.sql.SQLException;
import java.util.Scanner;
import dominio.*;
import persistencia.*;

//Paulo Arthur
public class Principal {

	public static void main(String[] args) {
		
		Funcionario pulo = new Funcionario();
		
		Funcionario fun1 = new Funcionario(); FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		
		Cliente c1 = new Cliente(); ClienteDAO clienteDAO = new ClienteDAO();
		
		Animal A1 = new Animal(); AnimalDAO animalDAO = new AnimalDAO();
		
		
		int opcao;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		try {
			
		
		do{
			
		System.out.println("--------------------------------------------------------- \r\n"
				+ "MENU PRINCIPAL \r\n"
				+ "--------------------------------------------------------- \n\n"
				+ "1 - CADASTRAR FUNCION�RIO \r\n"
				+ "2 - CADASTRAR CLIENTE & ANIMAL \r\n"
				+ "3 - INFORMAR DADOS DE CLIENTE \r\n"
				+ "4 - INFORMAR DADOS DE FUNCION�RIO \r\n"
				+ "5 - INFORMAR DADOS DE ANIMAL\r\n\n"
				+ "6 - SAIR"
				+ "---------------------------------------------------------");
		
		
		
		
	    opcao = entrada.nextInt();
		pulo.setCPF(entrada.nextLine());
		switch (opcao) {
		
//////////////////////////////////////////-------FUNCIONARIOS-------/////////////////////////////////////////////////
		
		case 1:{
					
					System.out.println("insira o cpf:");
					fun1.setCPF(entrada.nextLine());
					
					System.out.println("insira o endere�o:");
					fun1.setEndere�o(entrada.nextLine());
						
					System.out.println("insira a fun��o:");
					fun1.setFun��o(entrada.nextLine());
						
					System.out.println("insira a data de nascimento(ano-mes-dia):");
					fun1.setNascimento(entrada.nextLine());
					
					System.out.println("insira o nome:");
					fun1.setNome(entrada.nextLine());
						
					System.out.println("insira o salario");
					fun1.setSalario(entrada.nextLine());
					
					System.out.println("insira o telefone:");
					fun1.setTelefone(entrada.nextLine());
					
					System.out.println("insira o sexo:");
					fun1.setSexo(entrada.nextLine());
					try {
						System.out.println("salvando...");
						funcionarioDAO.saveFuncionario(fun1);
						System.out.println("salvo.");
					} catch (SQLException e) {
						System.out.println("erro: "+ e.getMessage());
					}
					
					break;}
		
/////////////////////////////////////////----------CLIENTES---------//////////////////////////////////////////////////
		
		case 2:{

					
					System.out.println("nome: ");
					c1.setNome(entrada.nextLine());
					
					
					System.out.println("CPF (11 digitos): ");
					c1.setCPF(entrada.nextLine());
					
					/////////CPF do dono no animal///////////
					A1.setCPF_dono(c1.getCPF());
					/////////////////////////////////////////
					
					System.out.println("telefone: ");
					c1.setTelefone(entrada.nextLine());
				
					System.out.println("sexo( F | M ): ");
					c1.setSexo(entrada.nextLine());
					
					System.out.println("data de nascimento(ano-mes-dia): ");
					c1.setNascimento(entrada.nextLine());
					
					////////salva cliente////////////////////
					try {

						System.out.println("salvando...");
						clienteDAO.saveCliente(c1);
						System.out.println("salvo.");
					} 
					catch (SQLException e) {
						System.out.println("erro: " + e.getMessage());;
					}
				
///////////////////////////////////////--------ANIMAL----------///////////////////////////////////////////
					
					System.out.println("nome do animal: ");
					A1.setNome(entrada.nextLine());

					
					System.out.println("especie do animal(cachorro, gato...): ");
					A1.setEspecie(entrada.nextLine());
					
					
					System.out.println("ra�a do animal: ");
					A1.setRa�a(entrada.nextLine());
					
					System.out.println("sexo do animal: ");
					A1.setSexo(entrada.nextLine());
					
					System.out.println("estado do animal: ");
					A1.setEstado(entrada.nextLine());
					
					System.out.println("nascimento do animal (ano-mes-dia): ");
					A1.setNascimento(entrada.nextLine());
					
					try {
						System.out.println("salvando...");
						animalDAO.saveAnimal(A1);
						System.out.println("salvo.");
					} catch (Exception e) {
						System.out.println("erro: "+ e.getMessage());}
					
					break;}
		
			
///////////////////////////////////////////------CHECAR CLIENTE------////////////////////////////////////////////////
			
		case 3:{
			
			
			for (Cliente clien : clienteDAO.getCliente()) {
			
				 System.out.println(" nome: "+ clien.getNome()+"\n"+" CPF: "+clien.getCPF()+"\n"+" nascimento: "+clien.getNascimento()+"\n"+" sexo: "+clien.getSexo()+"\n"+" telefone: "+clien.getTelefone()+"\n");
				 System.out.println("\n");
			}
				}break;
				
////////////////////////////////////////-----CHECAR FUNCIONARIO-----///////////////////////////////////////////////////		
		case 4:{
		
			for (Funcionario fun:funcionarioDAO.getFuncionario()) {
				System.out.println("CPF: "+fun.getCPF()+"\nnome: "+fun.getNome()+"\nnascimento: "+fun.getNascimento()+"\nendere�o: "+fun.getEndere�o()+"\nfun��o: "+fun.getFun��o()+"\nsalario: "+fun.getSalario()+"\nsexo: "+fun.getSexo()+"\ntelefone: "+fun.getTelefone());
			System.out.println("\n\n");
			}
			}break;
			
////////////////////////////////////////----CHECAR ANIMAL----///////////////////////////////////////////////////			
		case 5:{

				for(Animal anim : animalDAO.getAnimal()) {	
					System.out.println("CPF do dono: " + anim.getCPF_dono() + "\n" + "nome: " + anim.getNome() + "\n" + "especie: "+anim.getEspecie()+"\n"+"ra�a: 	"+anim.getRa�a()+"\nestado: "+anim.getEstado()+"\nsexo: "+anim.getSexo()+"\nnascimento: "+ anim.getNascimento());
				System.out.println("\n");
				}
			
			break;}
		
//////////////////////////////////////////----FIM----/////////////////////////////////////////////////	
		case 6:{
			System.out.println("fim de programa.");
		    }
		}
		
//////////////////////////////////////////////////////////////////////////////////////////////////////
		
			if (opcao<1) {
			System.out.println("valor inesperado");
		}else if (opcao>6) {
			System.out.println("valor inesperado");
			}
				}while(opcao!=6);
		
					} catch (java.util.InputMismatchException exception) {
			
							System.out.println("valor inesperado");}
	  	}
}
