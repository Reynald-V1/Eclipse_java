package bull;
import java.util.Vector;

import javax.swing.JOptionPane;
public class Principal {
	//atributos - registro
	private String nome;
	private int idade;
	private String dono;
	
	
	//opera��es - fun��es dessa classe
	
	public void comer(){
		System.out.println(nome + " comeu");	
	int[] vetor = new int[4];
	
	vetor[0]=54;
	
	for (int i = 0; i < vetor.length; i++) {
		System.out.println(vetor[i]);
	}
	}
	
	public void dormir() {
		
		System.out.println(nome +" esta a mimir shhhhhh");
		System.out.println("*sons de " + nome + " a mimir");
	}
	
	public void andar() {
		
		System.out.println(nome + " esta a andar");
	}
	
	
	public void Novonome(String Nonome) {
		nome = Nonome;
		System.out.println(nome);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
