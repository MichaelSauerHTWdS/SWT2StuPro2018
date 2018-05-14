/**
 * Enum Schiffstyp fuer Klassen Schiff und Werft.
 *
 * @date 14.0.5.2018
 * @author Joshua Pinnecker
 */

public enum Schiffstyp {
	SCHNIGGE,
	KOGGE,
	HOLK,
	KRAWEEL,
	KARACKE,
	LINIENSCHIFF {
		/**
		 * Override of Schiffstyp.next()
		 * @return returns null
		 */
		@Override
		public Schiffstyp next() {
			return null;
		};
	};

	/**
	 * @return returns next Schiffstyp
	 */
	public Schiffstyp next() {
		return values()[ordinal() + 1];
	}
}
