package sign_in_system;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class send_email {

	public send_email(String send_to,String account_get , String password_get) {
		String host = "smtp.gmail.com";
		int port = 587;
		final String username = "m7536204@gmail.com";
		final String password = "m0972258373";// your password

		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.port", port);
		Session session = Session.getInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("m7536204@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(send_to));
			message.setSubject("´ú¸Õ±H«H.");
			message.setText("Dear USER, \n\n±b¸¹ : "+account_get+"\n±K½X : "+password_get);
			

			Transport transport = session.getTransport("smtp");
			transport.connect(host, port, username, password);

			Transport.send(message);

			System.out.println("±H°eemailµ²§ô.");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}
