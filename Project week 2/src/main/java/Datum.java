/**
 * Met deze klasse wordt de datum bijgehouden
 *
 * @author Jahmiro Kooijstra, Arjen Dijk en Djordi Olijve
 * @version 1.0
 */

public class Datum {

	private int dag;
	private int maand;
	private int jaar;


	/**
	 * Constructor roept ook de methode bestaat datum aan om te checken of die valide is.
	 */

	public Datum(int dag, int maand, int jaar) {
		if (bestaatDatum(dag, maand, jaar)) {
			this.dag = dag;
			this.maand = maand;
			this.jaar = jaar;
		}
	}

	/**
	 * bij niks invullen voor datum, moet overal 0 worden ingevuld
	 */

	public Datum() {
		dag = 0;
		maand = 0;
		jaar = 0;
	}

	/**
	 * Getter voor de dag
	 *
	 * @return dag als integer
	 */

	public int getDag() {
		return dag;
	}

	/**
	 * Getter voor de maand
	 *
	 * @return maand als integer
	 */

	public int getMaand() {
		return maand;
	}

	/**
	 * Getter voor het jaar
	 *
	 * @return jaar als integer
	 */

	public int getJaar() {
		return jaar;
	}

	/**
	 * setter voor de dag
	 *
	 * @param dag als integer
	 */

	public void setDag(int dag) {
		this.dag = dag;
	}

	/**
	 * setter voor de maand
	 *
	 * @param maand als integer
	 */

	public void setMaand(int maand) {
		this.maand = maand;
	}

	/**
	 * setter voor het jaar
	 *
	 * @param jaar als integer
	 */

	public void setJaar(int jaar) {
		this.jaar = jaar;
	}

	/**
	 * de methode om te kijken of de combinatie van dag, maand en jaar mogelijk is.
	 *
	 * @param dag
	 * @param maand
	 * @param jaar
	 * @return true or false voor het wel of niet bestaan van de maand
	 */

	public boolean bestaatDatum(int dag, int maand, int jaar) {
		boolean deDatum = false;
		if (dag > 0 && dag <= 31 && maand > 0 && maand <= 12 && jaar >= 1900 && jaar <= 2100) {
			switch (maand) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if (dag <= 31) {
						deDatum = true;
					}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if (dag <= 30) {
						deDatum = true;
					}
					break;
				case 2:
					if ((dag == 29 && (jaar % 4) == 0) || (dag == 29 && ((jaar % 400) == 0) && ((jaar % 100) != 0))) {
						deDatum = true;
					} else if (dag <= 28) {
						deDatum = true;
					}
					break;
				default:
					deDatum = false;
			}
		}
		return deDatum;
	}

	/**
	 * Getter voor Sting weergave van datum
	 *
	 * @return Geboortedatum
	 */
	public String getDatumAsString() {
		String maandString;
		switch (maand) {
			case 1: maandString = "januari";
				break;
			case 2: maandString = "februari";
				break;
			case 3: maandString = "maart";
				break;
			case 4: maandString = "april";
				break;
			case 5: maandString = "mei";
				break;
			case 6: maandString = "juni";
				break;
			case 7: maandString = "juli";
				break;
			case 8: maandString = "augustus";
				break;
			case 9: maandString = "september";
				break;
			case 10: maandString = "oktober";
				break;
			case 11: maandString = "november";
				break;
			case 12: maandString = "december";
				break;
			default: maandString = "onbekend";
		};

		return " " + dag + " " + maandString + " " + jaar + " ";
	}
}