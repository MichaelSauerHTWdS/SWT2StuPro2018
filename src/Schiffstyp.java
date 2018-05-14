/**
 * Enum Schiffstyp fuer Klassen Schiff und Werft.
 *
 * @date 14.0.5.2018
 * @author Joshua Pinnecker
 */

public enum Schiffstyp {
	SCHNIGGE(40),
	KOGGE(100),
	HOLK(150),
	KRAWEEL(400),
	KARACKE(600),
	LINIENSCHIFF(1000) {
		/**
		 * Override of Schiffstyp.next()
		 * @return returns null
		 */
		@Override
		public Schiffstyp next() {
			return null;
		};
	};

	public final int maxlad;
	
	Schiffstyp(int maxlad){
		this.maxlad = maxlad;}

	/**
	 * @return returns next Schiffstyp
	 */
	public Schiffstyp next() {
		return values()[ordinal() + 1];
	}
}
