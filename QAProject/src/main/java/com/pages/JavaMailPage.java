package com.pages;

import java.util.*;
import javax.mail.*;

public class JavaMailPage {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.setProperty("mail.store.protocol", "imaps");
        try {
            Session session = Session.getInstance(props, null);
            Store store = session.getStore();
            store.connect("mail.evozon.com", "roxana.rus@evozon.com", "Rus.Roxana1");
            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_ONLY);
            Message msg = inbox.getMessage(inbox.getMessageCount());
            Address[] in = msg.getFrom();
            for (Address address : in) {
                System.out.println("FROM:" + address.toString());
            }
            //Multipart mp = (Multipart) msg.getContent();
            //BodyPart bp = mp.getBodyPart(0);
            System.out.println("SENT DATE:" + msg.getSentDate());
            System.out.println("SUBJECT:" + msg.getSubject());
            System.out.println("CONTENT:" + msg.getContent());
        } catch (Exception mex) {
            mex.printStackTrace();
        }
    }
}