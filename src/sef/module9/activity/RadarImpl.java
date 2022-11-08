package sef.module9.activity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implementation of a Radar
 */
public class RadarImpl implements Radar {
    List<RadarContact> contactOuterList = new ArrayList<>();

    /**
     * Constructs a new Radar
     */
    public RadarImpl() {

    }

    /*
     * (non-Javadoc)
     * @see
     * sef.module8.activity.Radar#addContact(sef.module8.activity.RadarContact)
     */
    public RadarContact addContact(RadarContact contact) {
        if (contact == null) {
            return null;
        } else {
            for (int i = 0; i < contactOuterList.size(); i++) {
                if (contactOuterList.get(i).getContactID().equals(contact.getContactID())) {
                    contactOuterList.set(i, contact);
                    return contact;
                }
            }
            contactOuterList.add(contact);
            return contact;

        }
    }

    /*
     * (non-Javadoc)
     * @see sef.module8.activity.Radar#getContact(java.lang.String)
     */
    public RadarContact getContact(String id) {
        for (int i = 0; i < contactOuterList.size(); i++) {
            if (contactOuterList.get(i).getContactID().equals(id)) {
                return contactOuterList.get(i);
            }
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * @see sef.module8.activity.Radar#getContactCount()
     */
    public int getContactCount() {

        return contactOuterList.size();
    }

    /*
     * (non-Javadoc)
     * @see sef.module8.activity.Radar#removeContact(java.lang.String)
     */
    public RadarContact removeContact(String id) {
        
        for(RadarContact contact: contactOuterList) {
            if(contact.getContactID().equals(id)) {
                contactOuterList.remove(contact);
                return contact;
            }
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * @see sef.module8.activity.Radar#returnContacts()
     */
    public List<RadarContact> returnContacts() {
        // return null;
        return new ArrayList<>(contactOuterList);
    }

    /*
     * (non-Javadoc)
     * @see sef.module8.activity.Radar#returnContacts(java.util.Comparator)
     */
    public List<RadarContact> returnContacts(Comparator<RadarContact> comparator) {
        contactOuterList.sort(comparator);
        return new ArrayList<>(contactOuterList);
    }

}
