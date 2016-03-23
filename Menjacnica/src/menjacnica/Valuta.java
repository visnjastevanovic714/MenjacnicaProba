package menjacnica;

import java.util.LinkedList;

public class Valuta {
	
	private String imeValute;
	private String skracenica;
	private LinkedList<Kurs> kursevi = new LinkedList<Kurs>();
	
	public String getSkracenica() {
		return skracenica;
	}
	public void setSkracenica(String skracenica) {
		this.skracenica = skracenica;
	}
	public LinkedList<Kurs> getKursevi() {
		return kursevi;
	}
	public void setKursevi(LinkedList<Kurs> kursevi) {
		this.kursevi = kursevi;
	}
	public String getImeValute() {
		return imeValute;
	}
	public void setImeValute(String imeValute) {
		this.imeValute = imeValute;
	}
	@Override
	public String toString() {
		return "Valuta [imeValute=" + imeValute + ", skracenica=" + skracenica + ", kursevi=" + kursevi + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((imeValute == null) ? 0 : imeValute.hashCode());
		result = prime * result + ((kursevi == null) ? 0 : kursevi.hashCode());
		result = prime * result + ((skracenica == null) ? 0 : skracenica.hashCode());
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
		Valuta other = (Valuta) obj;
		if (imeValute == null) {
			if (other.imeValute != null)
				return false;
		} else if (!imeValute.equals(other.imeValute))
			return false;
		if (kursevi == null) {
			if (other.kursevi != null)
				return false;
		} else if (!kursevi.equals(other.kursevi))
			return false;
		if (skracenica == null) {
			if (other.skracenica != null)
				return false;
		} else if (!skracenica.equals(other.skracenica))
			return false;
		return true;
	}
	
}
