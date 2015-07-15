package com.pages;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;

public class JavaMailPage {
	public static void main(String[] args) {

		String Subject = "Vacation Request Cancellation";
		String Content = "Dear Oana,The Vacation Request you have submitted for the interval:7/September/2015-11/September/2015 has been Cancelled.";
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
			String getContent = msg.getContent().toString();
			
			int result = Subject.compareTo(getSubject);
			if (result == 0) {
				System.out.println("ok");
			} else {
				System.out.println("not ok");
			}

			for (int i=1; i<Content.length();i++){
				String c = Content.replaceAll("\\s","");
				String c2= getContent.replaceAll("\\s","");
				
				int result2 = c.compareTo(getSubject);
				if (result2 == 0) {
					System.out.println("ok");
				} else {
					System.out.println("not ok");
				}

				
				
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