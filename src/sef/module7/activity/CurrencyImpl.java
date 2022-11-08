package sef.module7.activity;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Represents an implementation of the Currency interface. The equality test for
 * this currency implementation requires that the value and the name of the
 * denomination must be true in order to be considered equal.
 * 
 * @author John Doe
 */
public class CurrencyImpl implements Currency {
    float value;
    Denomination denomination;
    Calendar date;

    /**
     * Creates an instance of the of the Currency class with the specified value
     * and denomination
     * 
     * @param value
     *            the value of the currency
     * @param denomination
     *            the denomination of the currency
     */
    public CurrencyImpl(float value, Denomination denomination) {
        this.value = value;
        this.denomination = new DenominationImpl(denomination.getName(), denomination.getDescription(), denomination.getSymbol());
        //this.denomination = denomination;
        this.date = Calendar.getInstance();
    }

    /*
     * (non-Javadoc)
     * @see sef.module6.activity.Currency#getValue()
     */
    public float getValue() {
        return value;
        // return 1;
    }

    /*
     * (non-Javadoc)
     * @see sef.module6.activity.Currency#getDenomination()
     */
    public Denomination getDenomination() {
        return denomination;
    }

    /*
     * (non-Javadoc)
     * @see sef.module6.activity.Currency#getCreateDate()
     */
    public Calendar getCreateDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis((date.getTimeInMillis()));
        return calendar;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return Float.valueOf(this.value) + " " + this.denomination.toString();
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        CurrencyImpl c = (CurrencyImpl)o;
        return c.getDenomination().getName().equals(this.getDenomination().getName()) && c.getValue() == this.getValue();
    }

}
