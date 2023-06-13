/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;

import com.sun.mail.smtp.SMTPTransport;
import java.io.UnsupportedEncodingException;
import javax.mail.MessagingException.*;
import java.util.*;
import javax.activation.*;
import javax.mail.internet.*;
import javax.mail.*;
import javax.mail.Transport;

/**
 *
 * @author VXH
 */
public class Email {

    public static void send(String name,String newpass,String to, String sub, String msg) {
        Properties pr = new Properties();
        pr.put("mail.smtp.host", "sandbox.smtp.mailtrap.io");
        pr.put("mail.smtp.port", "2525");
        pr.put("mail.smtp.auth", "true");
        pr.put("mail.smtp.ssl.protokls", "TLSv1.2");

        Session session = Session.getInstance(pr, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("#", "#"); //To change body of generated methods, choose Tools | Templates.
            }
        });
        try {
            Message mess = new MimeMessage(session);
            mess.setFrom(new InternetAddress("#"));
            mess.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            mess.setSubject(sub);
//            mess.setContent("<h1>This is actual message</h1>", "text/html");
            mess.setText(msg);
            Transport.send(mess);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void send1(String name,String newpass,String to, String sub, String msg) {
        Properties pr = new Properties();
        pr.put("mail.smtp.host", "smtp.gmail.com");
        pr.put("mail.smtp.port", "587");
        pr.put("mail.smtp.auth", "true");
        pr.put("mail.smtp.starttls.enable", "true");
        pr.put("mail.smtp.ssl.protocols", "TLSv1.2");
        
        String username="hoavx.nd@gmail.com";
        String password="fmjcryfxsyfvvbrs";
        Session session = Session.getInstance(pr, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password); //To change body of generated methods, choose Tools | Templates.
            }
        });
        try {
            Message mess = new MimeMessage(session);
            mess.setFrom(new InternetAddress(username));
//            mess.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            mess.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            mess.setSubject(sub);
//            mess.setContent("<h1>This is actual message</h1>", "text/html");
            mess.setText(msg);
            Transport.send(mess);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String name="hoa";
        String newpass="1234";
//        String to = "hoavx.nd@gmail.com";
        String to = "vuxuanhoa2403@gmail.com";
        String user = "e730da659c8ea1";
        String pass = "8a67ef3b3a44dd";
        String sub = "hello";
        String msg = "Hi "+name+",\n"
                + "\n"
                + "There was a request to change your password!\n"
                + "\n"
                + "If you did not make this request then please ignore this email.\n"
                + "\n"
                + "Otherwise, please click this link to change your password: "+newpass;
        Email.send(name,newpass,to, sub, msg);
        
    }

}
