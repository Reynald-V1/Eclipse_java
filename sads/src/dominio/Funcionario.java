package dominio;

public class Funcionario extends Pessoa {
	private String salario;
	private String endere�o;
	private String sexo;
	private String fun��o;//atendente, limpeza, cirugi�o, assistente.
	
	public Funcionario() {
		
	}
	
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	public String getFun��o() {
		return fun��o;
	}
	public void setFun��o(String fun��o) {
		this.fun��o = fun��o;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	
}
