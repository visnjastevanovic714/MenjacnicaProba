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
	
}
