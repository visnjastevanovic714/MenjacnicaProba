package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterface;

public class Menjacnica implements MenjacnicaInterface {

	private LinkedList<Valuta> valute = new LinkedList<Valuta>();
	
	@Override
	public void dodajKurs(String imeValuta,Kurs kurs) {
		for(int i=0;i<valute.size();i++){
			if(valute.get(i).getImeValute().equals(imeValuta))
				valute.get(i).getKursevi().add(kurs);
		}
	}

	@Override
	public void obrisiKurs(String imeValuta,Kurs kurs) {
		for(int i=0;i<valute.size();i++){
			if(valute.get(i).getImeValute().equals(imeValuta))
				valute.get(i).getKursevi().remove(kurs);
		}
	}

	@Override
	public Kurs vratiKurs(String imeValuta,GregorianCalendar dan) {
		Kurs k = new Kurs();
		for(int i=0;i<valute.size();i++){
			if(valute.get(i).getImeValute().equals(imeValuta)){
				for(int j=0;j<valute.get(i).getKursevi().size();j++){
					if(valute.get(i).getKursevi().get(j).getDatum().equals(dan))
						k = valute.get(i).getKursevi().get(j);
				}			
			}
				
		}
		return k;
	}

}
