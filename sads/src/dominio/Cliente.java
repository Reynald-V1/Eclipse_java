package dominio;

public final class Cliente extends Pessoa {
	private String NomeAnimal;
	private String sexo;


	public Cliente(){
		
	}
	
	public String getNomeAnimal() {
		return NomeAnimal;
	}
	public void setNomeAnimal(String nomeAnimal) {
		NomeAnimal = nomeAnimal;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
