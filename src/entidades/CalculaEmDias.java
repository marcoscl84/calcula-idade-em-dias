package entidades;

public class CalculaEmDias {

	private Integer anos;
	private Integer meses;
	private Integer dias;
	
	public CalculaEmDias() {
	}

	public CalculaEmDias(Integer anos, Integer meses, Integer dias) {
		this.anos = anos;
		this.meses = meses;
		this.dias = dias;
	}

	public Integer getAnos() {
		return anos;
	}

	public void setAnos(Integer anos) {
		this.anos = anos;
	}

	public Integer getMeses() {
		return meses;
	}

	public void setMeses(Integer meses) {
		this.meses = meses;
	}

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}
	
	public int anosEmDias() {
		return anos * 365;
	}
	
	public int mesesEmDias() {
		return meses * 30;
	}
	
	public int idadeEmDias() {
		return anosEmDias() + mesesEmDias() + this.getDias();
	}
	
	public String toString() {
		return "Idade total em dias: " + idadeEmDias();
	}
}
	