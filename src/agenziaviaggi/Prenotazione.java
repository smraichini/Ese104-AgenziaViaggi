package agenziaviaggi;

public class Prenotazione {
	private String codice;
	private int postiRichiesti;
	private Pacchetto pacchetto;
	private Filiale filiale;
	private Cliente cliente;
	
	public Prenotazione(String codice, int postiRichiesti, Filiale filiale, Cliente cliente) {
		this.codice = codice;
		this.postiRichiesti = postiRichiesti;
		this.filiale = filiale;
		this.cliente = cliente;
	}

	public String getCodice() {
		return codice;
	}

	public int getPostiRichiesti() {
		return postiRichiesti;
	}

	public Filiale getFiliale() {
		return filiale;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setPacchetto(Pacchetto p){
			this.pacchetto = p;
	}

	@Override
	public String toString() {
		return "Prenotazione [codice=" + codice + ", postiRichiesti="
				+ postiRichiesti + ", pacchetto=" + pacchetto + ", filiale="
				+ filiale + ", cliente=" + cliente + "]";
	}
	
	

}
