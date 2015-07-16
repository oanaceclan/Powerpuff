package com.pages;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;

public class JavaMailValidatePage {
	public static void main(String[] args) {

		String Subject = "You have submitted a new Vacation Request";
		String Content = "DearOana,<br/><br/>Wehavereceivedyour<i>SickLeave</i>requestbetween<strong>07/09/2015-11/09/2015</strong>.<br/>Wewishyoutogetwellsoonandpleaseremembertobringyoursickleavepapersfromyourfamilydoctor,assoonasyougetbacktowork.<!--<br/><br/>Cheers,<br/>TheEvoPortalTeam--><br/><br/>Cheers,<br/>TheEvoPortalTeam";
		Properties props = new Properties();
		props.setProperty("mail.store.protocol", "imaps");

		try {
			Session session = Session.getInstance(props, null);
			Store store = session.getStore();
			store.connect("mail.evozon.com", "oana.ceclan@evozon.com", "Oana.ceclan9");
			Folder inbox = store.getFolder("INBOX");
			inbox.open(Folder.READ_ONLY);
			Message msg = inbox.getMessage(inbox.getMessageCount());
			Address[] in = msg.getFrom();
			for (Address address : in) {
				System.out.println("FROM:" + address.toString());
			}

			System.out.println("SENT DATE:" + msg.getSentDate());
			System.out.println("SUBJECT:" + msg.getSubject());
			System.out.println("CONTENT:" + msg.getContent());

			String getSubject = msg.getSubject();
			String getContent = msg.getContent().toString();

			String c = Content.replaceAll("\\s", "");
			String c2 = getContent.replaceAll("\\s", "");

			int result = Subject.compareTo(getSubject);
			int result2 = c.compareTo(c2);

			if (result == 0) {
				System.out.println("ok");
			} else {
				System.out.println("not ok");
			}

			if (result2 == 0) {
				System.out.println("Valid content");
			} else {
				System.out.println("Content is not valid");
			}

		} catch (Exception mex) {
			mex.printStackTrace();
		}

	}
}