package Model;

public class Dipendente extends Persona {
   private String ruolo;
   private String titolostudio;
   private double stipendio;
   public void setRuolo(String ruolo) {
	   this.ruolo=ruolo;
   }
   public void setTitoloStudio(String titolostudio) {
	   this.titolostudio=titolostudio;
   }
   public void setStipendio(double stipendio) {
	   this.stipendio=stipendio;
   }
   public String getRuolo() {
	   return ruolo;
   }
   public String getTitoloStudio() {
	   return titolostudio;
   }
   public double getStipendio() {
	   return stipendio;
   }
   public Dipendente() {super();}
   public Dipendente(int id,String nome,String cognome,int eta,String ruolo,String titolostudio,double stipendio) {
	   super(id,nome,cognome,eta);
	   this.ruolo=ruolo;
	   this.titolostudio=titolostudio;
	   this.stipendio=stipendio;
   }
   @Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((ruolo == null) ? 0 : ruolo.hashCode());
	long temp;
	temp = Double.doubleToLongBits(stipendio);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((titolostudio == null) ? 0 : titolostudio.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Dipendente other = (Dipendente) obj;
	if (ruolo == null) {
		if (other.ruolo != null)
			return false;
	} else if (!ruolo.equals(other.ruolo))
		return false;
	if (Double.doubleToLongBits(stipendio) != Double.doubleToLongBits(other.stipendio))
		return false;
	if (titolostudio == null) {
		if (other.titolostudio != null)
			return false;
	} else if (!titolostudio.equals(other.titolostudio))
		return false;
	return true;
}
@Override
public String toString() {
	return super.toString()+" | "+"Il ruolo è: "+ruolo + " | " +"Il titolo di Studio è: "+ titolostudio + " | " +"Stipendio:"+ stipendio+"€";
}

}
