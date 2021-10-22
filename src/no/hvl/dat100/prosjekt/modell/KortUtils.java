package no.hvl.dat100.prosjekt.modell;

import java.util.Arrays;
import java.util.Random;

import no.hvl.dat100.prosjekt.TODO;
import no.hvl.dat100.prosjekt.kontroll.dommer.Regler;

public class KortUtils {

	/**
	 * Sorterer en samling. Rekkefølgen er bestemt av compareTo() i Kort-klassen.
	 * 
	 * @see Kort
	 * 
	 * @param samling samling av kort som skal sorteres.
	 */

	public static void sorter(KortSamling samling) {

		// TODO - START
		Kort[] samlingen = new Kort[Regler.MAKS_KORT_FARGE];
		samlingen=samling.getSamling();
		Kort[] temp = new Kort[samlingen.length];
		for (int KortNr = 0; KortNr < samlingen.length; KortNr++) {
			int minPos = 0;
			for (int posNr = 1; posNr < samlingen.length; posNr++) {
				if (samlingen[minPos].compareTo(samlingen[posNr])<0) {
					minPos = posNr;
				}
			}
			temp[KortNr] = samlingen[minPos];
			Kort maxvalue= new Kort(Kortfarge.Spar, 14);
			samlingen[minPos] = maxvalue;
		}
		
		for (int KortNr = 0; KortNr < temp.length; KortNr++) {
			int minPos = 0;
			for (int posNr = 1; posNr < temp.length; posNr++) {
				if (temp[minPos].compareTo(temp[posNr])<0) {
					minPos = posNr;
				}
			}
			samlingen[KortNr] = temp[minPos];
			Kort maxvalue= new Kort(Kortfarge.Spar, 14);
			temp[minPos] = maxvalue;
		}
		
		for(int i = 0; i < samlingen.length; i++) {
			samling.leggTil(samlingen[i]);
		}

		// TODO - END
	}

	/**
	 * Stokkar en kortsamling.
	 * 
	 * @param samling samling av kort som skal stokkes.
	 */
	public static void stokk(KortSamling samling) {

		// TODO - START

		throw new UnsupportedOperationException(TODO.method());
		// TODO - END
	}

}
