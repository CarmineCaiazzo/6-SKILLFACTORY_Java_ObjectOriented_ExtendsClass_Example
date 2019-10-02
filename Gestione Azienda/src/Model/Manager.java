package Model;

public class Manager extends Dipendente{
  private String areaResponsabilit�;
  public  void setAreaResponsabilit�(String areaResponsabilit�) {
	  this.areaResponsabilit�=areaResponsabilit�;
  }
  public String getAreaResponsabilit�() {
	  return areaResponsabilit�;
  }
  public Manager() {super();}
  public Manager(int id,String nome,String cognome,int eta,String ruolo,String titolostudio,double stipendio,String areaResponsabilit�) {
	  super(id,nome,cognome,eta,ruolo,titolostudio,stipendio);
	  this.areaResponsabilit�=areaResponsabilit�;
  }
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((areaResponsabilit� == null) ? 0 : areaResponsabilit�.hashCode());
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
	if (areaResponsabilit� == null) {
		if (other.areaResponsabilit� != null)
			return false;
	} else if (!areaResponsabilit�.equals(other.areaResponsabilit�))
		return false;
	return true;
}
@Override
public String toString() {
	return super.toString()+" | "+"L' area di responsabilit� :"+ areaResponsabilit�;
}

}
