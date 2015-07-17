package com.pages;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;

import org.apache.commons.io.FileUtils;

public class ReadJavaMailPage2 {
	

	public static void main(String[] args) {

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

			File file = new File("d:/newfile.txt");
			String content = msg.getContent().toString();

			try (FileOutputStream fop = new FileOutputStream(file)) {

				// if file doesn't exists, then create it
				if (!file.exists()) {
					file.createNewFile();
				}

				// get the content in bytes
				byte[] contentInBytes = content.getBytes();

				fop.write(contentInBytes);
				fop.flush();
				fop.close();

				// System.out.println("Done");

				File file1 = new File("d:/newfile.txt");
				File file2 = new File("d:/contentfile.txt");
				
				

				boolean compareResult = FileUtils.contentEquals(file1, file2);
				// System.out.println("Are the files are same? " + compareResult);

				if (!compareResult == false) {
					System.out.println("The content is valid");
				} else {
					System.out.println("The content is invalid");
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (Exception mex) {
			mex.printStackTrace();
		}

	}

}