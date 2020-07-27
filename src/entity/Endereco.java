package entity;

public class Endereco {

	private String rua;
	private String numero;
	private String complemento;
	
	
	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", numero=" + numero + ", complemento=" + complemento + "]";
	}
	public Endereco(String rua, String numero, String complemento) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
	}
	public Endereco() {

	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	
}
