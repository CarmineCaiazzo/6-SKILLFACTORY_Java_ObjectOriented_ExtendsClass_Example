package Model;

public class Manager extends Dipendente{
  private String areaResponsabilità;
  public  void setAreaResponsabilità(String areaResponsabilità) {
	  this.areaResponsabilità=areaResponsabilità;
  }
  public String getAreaResponsabilità() {
	  return areaResponsabilità;
  }
  public Manager() {super();}
  public Manager(int id,String nome,String cognome,int eta,String ruolo,String titolostudio,double stipendio,String areaResponsabilità) {
	  super(id,nome,cognome,eta,ruolo,titolostudio,stipendio);
	  this.areaResponsabilità=areaResponsabilità;
  }
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((areaResponsabilità == null) ? 0 : areaResponsabilità.hashCode());
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
	if (areaResponsabilità == null) {
		if (other.areaResponsabilità != null)
			return false;
	} else if (!areaResponsabilità.equals(other.areaResponsabilità))
		return false;
	return true;
}
@Override
public String toString() {
	return super.toString()+" | "+"L' area di responsabilità :"+ areaResponsabilità;
}

}
