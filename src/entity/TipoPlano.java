package entity;

public class TipoPlano {

	private String basico;
	private String familia;
	private String premium;
	
	@Override
	public String toString() {
		return "TipoPlano [basico=" + basico + ", familia=" + familia + ", premium=" + premium + "]";
	}

	public TipoPlano(String basico, String familia, String premium) {
		super();
		this.basico = basico;
		this.familia = familia;
		this.premium = premium;
	}

	public TipoPlano() {

	}
	
	public String getBasico() {
		return basico;
	}
	public void setBasico(String basico) {
		this.basico = basico;
	}
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	public String getPremium() {
		return premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}
	
	
	
}
