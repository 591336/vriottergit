package no.hvl.dat100.prosjekt.modell;

import no.hvl.dat100.prosjekt.kontroll.dommer.Regler;

/**
 * Struktur for å lagre ei samling kort. Kan lagre hele kortstokken. Det finnes
 * en konstant i klassen Regler som angir antall kort i hver av de 4 fargene.
 * Når programmet er ferdig settes denne til 13, men under utvikling / testing
 * kan det være praktisk å ha denne mindre.
 * 
 */
public class KortSamling {

	private final int MAKS_KORT = 4 * Regler.MAKS_KORT_FARGE;

	private Kort[] samling;
	private int antall;

	/**
	 * Oppretter en tom Kortsamling med plass til MAKS_KORT (hele kortstokken).
	 */
	public KortSamling() {

		// TODO - START

		samling = new Kort[MAKS_KORT];
		antall = 0;
		// throw new UnsupportedOperationException(TODO.constructor("KortSamling"));
		// TODO - END
	}

	/**
	 * Returnerer en tabell med kortene i samlinga. Tabellen trenger ikke vÃ¦re
	 * full. Kortene ligger sammenhengende fra starten av tabellen. Kan fÃ¥ tilgang
	 * til antallet ved Ã¥ bruke metoden getAntallKort(). Metoden er fÃ¸rst og
	 * fremst ment Ã¥ brukes i testklasser. Om man trenger kortene utenfor,
	 * anbefales metoden getAlleKort().
	 * 
	 * @return tabell av kort.
	 */
	public Kort[] getSamling() {

		return samling;

	}

	/**
	 * Antall kort i samlingen.
	 * 
	 * @return antall kort i samlinga.
	 */
	public int getAntalKort() {

		// TODO - STAR
		return antall;
		// throw new UnsupportedOperationException(TODO.method());

		// TODO - END
	}

	/**
	 * Sjekker om samlinga er tom.
	 * 
	 * @return true om samlinga er tom, false ellers.
	 */
	public boolean erTom() {

		// TODO - START
		if (antall == 0) {
			return true;
		} else {
			return false;
		}

		// throw new UnsupportedOperationException(TODO.method());

		// TODO - END
	}

	/**
	 * Legg et kort til samlinga.
	 * 
	 * @param kort er kortet som skal leggast til.
	 */
	public void leggTil(Kort kort) {

		// TODO - START
		samling[antall] = kort;

		antall++;
		// throw new UnsupportedOperationException(TODO.method());
		// TODO - END

	}

	/**
	 * Legger alle korta (hele kortstokken) til samlinga. Korta vil vÃ¦re sortert
	 * slik at de normalt mÃ¥ stokkes fÃ¸r bruk.
	 */
	public void leggTilAlle() {

		// TODO - START
		// Husk: bruk Regler.MAKS_KORT_FARGE for Ã¥ fÃ¥ antall kort per farge
		antall = 0;

		for (Kortfarge f : Kortfarge.values()) {
			for (int i = 1; i <= Regler.MAKS_KORT_FARGE; i++) {
				leggTil(new Kort(f, i));
			}
		}

		/*
		 * for(int f = 1; f <= Kortfarge.values().length; f++) {
		 * 
		 * for(int i = 1; i <= Regler.MAKS_KORT_FARGE; i++) { samling[(i-1)+teller] =
		 * new Kort(Kortfarge.values()[f], i); antall++; teller ++; } }
		 */
		// throw new UnsupportedOperationException(TODO.method());
		// TODO - END
	}

	/**
	 * Fjerner alle korta fra samlinga slik at den blir tom.
	 */
	public void fjernAlle() {

		// TODO - START
		samling = new Kort[MAKS_KORT];
		antall = 0;
		// throw new UnsupportedOperationException(TODO.method());
		// TODO - END
	}

	/**
	 * Ser pÃ¥ siste kortet i samlinga.
	 * 
	 * @return siste kortet i samlinga, men det blir ikke fjernet. Dersom samalinga
	 *         er tom, returneres null.
	 */
	public Kort seSiste() {

		// TODO - START

		if (erTom() == true) {
			return null;
		} else {
			return samling[antall - 1];
		}

		// throw new UnsupportedOperationException(TODO.method());

		// TODO - END

	}

	/**
	 * Tek ut siste kort fra samlinga.
	 * 
	 * @return siste kortet i samlinga. Dersom samalinga er tom, returneres null.
	 */
	public Kort taSiste() {

		// TODO - START
		if (erTom() == true) {
			return null;
		} else {
			Kort retur = samling[antall - 1];
			samling[antall - 1] = null;
			antall--;
			return retur;
		}
		// throw new UnsupportedOperationException(TODO.method());

		// TODO - END
	}

	/**
	 * UndersÃ¸ker om et kort finst i samlinga.
	 * 
	 * @param kort.
	 * 
	 * @return true om kortet finst i samlinga, false ellers.
	 */
	public boolean har(Kort kort) {

		// TODO - START
		for (Kort elem : samling) {
			if (elem != null && elem.equals(kort)) {
				return true;
			}
		}
		return false;
		// throw new UnsupportedOperationException(TODO.method());
		// TODO - END

	}

	/**
	 * Fjernar et kort frÃ¥ samlinga. Dersom kortet ikke finnest i samlinga, skjer
	 * ingenting med samilingen
	 * 
	 * @param kort kortet som skal fjernast. Dersom kortet ikke finnes, skjer
	 *             ingenting.
	 * @return true om kortet blev fjernet fra samlinga, false ellers.
	 */

	public boolean fjern(Kort kort) {

		// TODO - START
		for (int i = 0; i < samling.length; i++) {
			if (kort == samling[i] && kort != null) {
				samling[i] = null;
				antall--;
				// KortUtils.sorter(samling);
				return true;
			}
		}
		return false;
		// throw new UnsupportedOperationException(TODO.method());

		// TODO - END
	}

	/**
	 * Gir kortene som en tabell av samme lengde som antall kort i samlingen
	 * 
	 * @return tabell av kort som er i samlingen, der kort skal ha samme rekkefÃ¸lge
	 *         som i kortsamlinga.
	 */
	public Kort[] getAllekort() {

		// TODO - START
		Kort[] returSamling = new Kort[antall];
		for (int i = 0; i < returSamling.length; i++) {
			returSamling[i] = samling[i];
		}
		return returSamling;
		// throw new UnsupportedOperationException(TODO.method());

		// TODO - END

	}

}
