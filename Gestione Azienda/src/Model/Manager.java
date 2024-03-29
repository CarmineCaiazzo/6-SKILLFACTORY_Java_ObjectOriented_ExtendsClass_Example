package Model;

public class Manager extends Dipendente{
  private String areaResponsabilitÓ;
  public  void setAreaResponsabilitÓ(String areaResponsabilitÓ) {
	  this.areaResponsabilitÓ=areaResponsabilitÓ;
  }
  public String getAreaResponsabilitÓ() {
	  return areaResponsabilitÓ;
  }
  public Manager() {super();}
  public Manager(int id,String nome,String cognome,int eta,String ruolo,String titolostudio,double stipendio,String areaResponsabilitÓ) {
	  super(id,nome,cognome,eta,ruolo,titolostudio,stipendio);
	  this.areaResponsabilitÓ=areaResponsabilitÓ;
  }
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((areaResponsabilitÓ == null) ? 0 : areaResponsabilitÓ.hashCode());
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
	Manager other = (Manager) obj;
	if (areaResponsabilitÓ == null) {
		if (other.areaResponsabilitÓ != null)
			return false;
	} else if (!areaResponsabilitÓ.equals(other.areaResponsabilitÓ))
		return false;
	return true;
}
@Override
public String toString() {
	return super.toString()+" | "+"L' area di responsabilitÓ :"+ areaResponsabilitÓ;
}

}
