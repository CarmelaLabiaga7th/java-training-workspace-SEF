package sef.module7.activity;

/**
 * An implementation of the Denomination interface.  The equality test for between instances
 * of this class considers the name and the symbol
 * 
 * @author John Doe
 *
 */
public class DenominationImpl implements Denomination {
	String name;
	String description;
	String symbol;
	
	/**Y
	 * Creates a new instance with the specified parameters
	 * 
	 * @param name the name of the denomination
	 * @param description a description 
	 * @param symbol
	 */
	public DenominationImpl(String name, String description, String symbol) {
		this.name = name;
		this.description = description;
		this.symbol = symbol;
	
	}

	/* (non-Javadoc)
	 * @see sef.module6.activity.Denomination#getDescription()
	 */
	public String getDescription() {
		return this.description;
		//return "";
	}
	
	/* (non-Javadoc)
	 * @see sef.module6.activity.Denomination#getName()
	 */
	public String getName() {
		return this.name;
		//return "";
	}

	/* (non-Javadoc)
	 * @see sef.module6.activity.Denomination#getSymbol()
	 */
	public String getSymbol() {
		return this.symbol;
		//return "";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
        return this.name + " (" + this.symbol + ") " + this.description;
		//return "";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object o) {		
		/*
		if (d.getName() == this.name && d.getDescription() == this.description && d.getSymbol() == this.symbol) {
			return true;
		} else {
			return false;
		}*/
//		if(d.getName().equals(name) && d.getDescription().equals(description) && d.getSymbol().equals(symbol)) {
//			return true;
//		}else {
//			return false;
//		}
//		
		
		if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }

        DenominationImpl denom = (DenominationImpl) o;
        return denom.getName().equals(name) && denom.getSymbol().equals(symbol);


	}

}
