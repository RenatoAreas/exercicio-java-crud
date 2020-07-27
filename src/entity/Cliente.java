package entity;

public class Cliente {
	
	private Integer idCliente;
	private String nome;
	private String sobrenome;
	private String telefone;
	private String cpf;
	private String senha;
	private String email;
	
	
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", sobrenome=" + sobrenome + ", telefone="
				+ telefone + ", cpf=" + cpf + ", senha=" + senha + ", email=" + email + "]";
	}
	
	
	public Cliente(Integer idCliente, String nome, String sobrenome, String telefone, String cpf, String senha,
			String email) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.senha = senha;
		this.email = email;
	}


	public Cliente() {

	}
	
	
	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Validação dos compos 
	 * 
	 * DDD + telefone 
	 */
	
	public void validaTelefone() {
		
		if(this.telefone == "12") {
			System.out.println("Telefone é valido");
		}else {
			System.out.println("Telefone invalido");
		}
		
	}
	
	/**
	 * Validação de CPF 
	 
	 */
	
	public void validaCpf(){
		if(this.cpf == "11") {
			System.out.println("CPF valido");
		}else {
			System.out.println("CPF inválido");
		}
	}
	

}
 