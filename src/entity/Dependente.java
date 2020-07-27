package entity;

public class Dependente extends Cliente{

	private String sexo;
	private String idade;
	
	
	@Override
	public String toString() {
		return "Dependente [sexo=" + sexo + ", idade=" + idade + "]";
	}

	public Dependente(Integer idCliente, String nome, String telefone, String cpf, String sexo, String idade) {
		super(idCliente, nome, telefone, cpf);
		this.sexo = sexo;
		this.idade = idade;
	}

	public Dependente() {

	}
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	
	
}
