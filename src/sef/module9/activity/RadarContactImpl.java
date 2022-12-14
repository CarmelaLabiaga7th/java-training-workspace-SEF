package sef.module9.activity;

/**
 * Implementation of a RadarContact
 * 
 * @author John Doe
 */
public class RadarContactImpl implements RadarContact {

    String contactID;
    double bearing;
    double distance;

    /**
     * Creates a RadarContact with the specified ID, bearing and distance.
     * 
     * @param contactID
     *            the contact's ID
     * @param bearing
     *            the contact's bearing
     * @param distance
     *            the contact's distance
     */
    public RadarContactImpl(String contactID, double bearing, double distance) {
        this.contactID = contactID;
        setBearing(bearing);
        setDistance(distance);
    }

    /*
     * (non-Javadoc)
     * @see sef.module8.activity.RadarContact#getBearing()
     */
    public final double getBearing() {
        // return 1;
        return bearing;
    }

    /*
     * (non-Javadoc)
     * @see sef.module8.activity.RadarContact#setBearing(double)
     */
    public final void setBearing(double bearing) {
        if (bearing > 0) {
            this.bearing = bearing % 360;
        } else {
            if ((bearing % 360 == 0)) {
                this.bearing = 0;
            } else {
                this.bearing = (360 + (bearing % 360));
            }
        }
    }

    /*
     * (non-Javadoc)
     * @see sef.module8.activity.RadarContact#getDistance()
     */
    public final double getDistance() {
        // return 0;
        return distance;
    }

    /*
     * (non-Javadoc)
     * @see sef.module8.activity.RadarContact#setDistance(double)
     */
    public final void setDistance(double distance) {

        if (distance > 0) {
            this.distance = distance;
        } else {
            this.distance = 0.0;
        }

    }

    /*
     * (non-Javadoc)
     * @see sef.module8.activity.RadarContact#getContactID()
     */
    public final String getContactID() {
        return contactID;
    }

    /*
     * (non-Javadoc)
     * @see sef.module8.activity.RadarContact#setContactID(java.lang.String)
     */
    public final void setContactID(String contactID) {
        this.contactID = contactID;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return contactID + " " + bearing + " " + distance;
    }
}
