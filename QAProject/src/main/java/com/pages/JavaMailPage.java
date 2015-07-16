package com.pages;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;

import tools.Constants;

public class JavaMailPage {
	public static void main(String[] args) {

		String Subject = Constants.Subject;

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
			// Multipart mp = (Multipart) msg.getContent();
			// BodyPart bp = mp.getBodyPart(0);
			System.out.println("SENT DATE:" + msg.getSentDate());
			System.out.println("SUBJECT:" + msg.getSubject());
			System.out.println("CONTENT:" + msg.getContent());

			String getSubject = msg.getSubject();

			int result = Subject.compareTo(getSubject);
			if (result == 0) {
				System.out.println("ok");
			} else {
				System.out.println("not ok");
			}


		} catch (Exception mex) {
			mex.printStackTrace();
		}

		// for (int i = 1; i < Message.length(); i++) {
		// if(Message.get(i).getText().contains(Subject))
		// System.out.println("Email validate");
		//
		// }

	}
}