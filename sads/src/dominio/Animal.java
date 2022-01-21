package dominio;

public final class Animal {
	private String nome;
	private String CPF_dono;
	private String nascimento;
	private String sexo;
	private String raça;//persa, poodle
	private String especie; //catioro, gato
	private String estado;//doente, ferido
	
	
	public Animal(){
		
	
	}

	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getCPF_dono() {
		return CPF_dono;
	}
	public void setCPF_dono(String cPF_dono) {
		CPF_dono = cPF_dono;
	}
	
	
	
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	public String getRaça() {
		return raça;
	}
	public void setRaça(String raça) {
		this.raça = raça;
	}
	
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
};

