package dominio;

public class Funcionario extends Pessoa {
	private String salario;
	private String endereço;
	private String sexo;
	private String função;//atendente, limpeza, cirugião, assistente.
	
	public Funcionario() {
		
	}
	
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getFunção() {
		return função;
	}
	public void setFunção(String função) {
		this.função = função;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	
}
