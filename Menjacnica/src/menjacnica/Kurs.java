package menjacnica;

import java.util.GregorianCalendar;

public class Kurs {

	private double prodajniKurs;
	private double srednjiKurs;
	private double kupovniKurs;
	private GregorianCalendar datum;
	
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		if(prodajniKurs<=0)
			throw new RuntimeException("Greska pri unosu prodajnog kursa");
		this.prodajniKurs = prodajniKurs;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		if(srednjiKurs<=0)
		throw new RuntimeException("Greska pri unosu srednjeg kursa");
		this.srednjiKurs = srednjiKurs;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		if(kupovniKurs<=0)
		throw new RuntimeException("Greska pri unosu kupovnog kursa");
		this.kupovniKurs = kupovniKurs;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if(datum==null)
			throw new RuntimeException("Greska pri unosu datuma");
		this.datum = datum;
	}
	@Override
	public String toString() {
		return "Kurs [prodajniKurs=" + prodajniKurs + ", srednjiKurs=" + srednjiKurs + ", kupovniKurs=" + kupovniKurs
				+ ", datum=" + datum + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kurs other = (Kurs) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(kupovniKurs) != Double.doubleToLongBits(other.kupovniKurs))
			return false;
		if (Double.doubleToLongBits(prodajniKurs) != Double.doubleToLongBits(other.prodajniKurs))
			return false;
		if (Double.doubleToLongBits(srednjiKurs) != Double.doubleToLongBits(other.srednjiKurs))
			return false;
		return true;
	}
	
}
