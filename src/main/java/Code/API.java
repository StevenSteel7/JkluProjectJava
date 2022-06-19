/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import com.messente.ApiClient;
import com.messente.ApiException;
import com.messente.api.OmniMessageCreateSuccessResponse;
import com.messente.api.Omnimessage;
import com.messente.api.OmnimessageApi;
import com.messente.api.SMS;
import com.messente.auth.HttpBasicAuth;
import java.util.Arrays;
/**
 *
 * @author surya
 */
public class API {
    public static void sendMail(String recipent, String subject, String bodymessage) throws Exception{
        System.out.print("Preparing");
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.hostinger.com");
        properties.put("mail.smtp.port", "587");
        
        String EmailDetails = "no-reply@echarge.ga";
        String password = "Chancellor123@";
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EmailDetails, password);
            }
            
        });
        Message message = prepareMessage(session, EmailDetails, recipent, subject, bodymessage);
        Transport.send(message);
        System.out.print("MEssage sent successfully");
    }
private static Message prepareMessage(Session session, String EmailDetails, String recipent, String subject, String bodymessage) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(EmailDetails));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipent) );
            message.setSubject(subject);
            message.setText(bodymessage);
            return message;
        } catch (Exception ex) {
            Logger.getLogger(API.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
public static void SendSMS(String ClientPhoneNumber, String Message) {
ApiClient apiClient = new ApiClient();

        HttpBasicAuth basicAuth = (HttpBasicAuth) apiClient.getAuthentication("basicAuth");
        basicAuth.setUsername("To Be PUT in PROPERTIES");
        basicAuth.setPassword("TO BE PUT LATER");

        SMS sms = new SMS();
        sms.text(Message);
        sms.sender("To BE PUT LATER");

        OmnimessageApi apiInstance = new OmnimessageApi(apiClient);
        Omnimessage omnimessage = new Omnimessage();
        omnimessage.setMessages(Arrays.asList(sms));
        omnimessage.setTo(ClientPhoneNumber);

        try {
            OmniMessageCreateSuccessResponse result = apiInstance.sendOmnimessage(omnimessage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
        }}
}
