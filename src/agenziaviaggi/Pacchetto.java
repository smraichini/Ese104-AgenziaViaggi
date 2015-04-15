package agenziaviaggi;
import java.util.*;

public class Pacchetto {
	private String codice;
	private String descrizione;
	private int postiTotali;
	private Vector <Prenotazione> prenotazioni;
	
	public Pacchetto(String codice, String descrizione, int postiTotali) {
		this.codice = codice;
		this.descrizione = descrizione;
		this.postiTotali = postiTotali;
		prenotazioni = new Vector <Prenotazione>();
	}

	public String getCodice() {
		return codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public int getPostiTotali() {
		return postiTotali;
	}

	public Vector<Prenotazione> getPrenotazioni() {
		return prenotazioni; 
	}
	
	public int getPostiDisponibili(){
		int disp;
		int occup=0,i;
		for(i=0;i<prenotazioni.size();i++)
		{
			occup = occup + prenotazioni.get(i).getPostiRichiesti();
		}
		
		disp= this.postiTotali-occup;
		return disp;
	}
	
	public void addPrenotazione(Prenotazione p){
		try{
			if(this.getPostiDisponibili()<=p.getPostiRichiesti()){
				throw new NotEnoughPlacesException("Posti Insufficenti");
			}	
			else{
				this.prenotazioni.add(p);
			}
		}
		catch(NotEnoughPlacesException e){
			e.getMessage();
		}		
	}
	
	

}
