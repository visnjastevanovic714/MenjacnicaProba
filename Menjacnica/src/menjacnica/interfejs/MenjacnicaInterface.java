package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface MenjacnicaInterface {

	public void dodajKurs(String imeValuta,Kurs kurs);
	public void obrisiKurs(String imeValuta,Kurs kurs);
	public Kurs vratiKurs(String imeValuta,GregorianCalendar dan);
}
