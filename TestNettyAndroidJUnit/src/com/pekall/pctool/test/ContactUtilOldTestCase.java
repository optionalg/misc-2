/**
 * 
 */
package com.pekall.pctool.test;

import android.test.AndroidTestCase;

import com.pekall.pctool.Slog;
import com.pekall.pctool.model.contact.Contact;
import com.pekall.pctool.model.contact.ContactUtilOld;

import java.util.List;

/**
 * @author dev01
 *
 */
public class ContactUtilOldTestCase extends AndroidTestCase {

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testQueryContact() throws Exception {
        List<Contact> contacts = ContactUtilOld.getAllContacts(getContext());
        for (Contact contact : contacts) {
            Slog.d(contact.toString());
        }
    }
    
    public void testUpdateContact() throws Exception {
        List<Contact> contacts = ContactUtilOld.getAllContacts(getContext());
        
        Contact contact = contacts.get(0);
        
        Slog.d(contact.toString());
        
        contact.nickname = "testUpdateContact2";
        
        ContactUtilOld.updateContact(getContext(), contact);
    }
}