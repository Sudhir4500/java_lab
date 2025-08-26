import java.util.Properties;
// Note: JavaMail API requires external dependency
// Add to classpath: javax.mail:mail:1.4.7

public class LabTwentyFour {
    public static void main(String[] args) {
        // Email sending demonstration (conceptual)
        demonstrateEmailSending();
        
        // Print lab info
        System.out.println("\nLab No.: 24");
        System.out.println("Name: Sudhir Sharma");
        System.out.println("Roll No./Section: 53/B");
    }
    
    private static void demonstrateEmailSending() {
        System.out.println("=== Email Sending using JavaMail API ===");
        
        // SMTP Configuration
        String host = "smtp.gmail.com";
        String port = "587";
        String username = "sender@test.com";
        String password = "your_app_password";
        String toEmail = "receiver@test.com";
        
        System.out.println("Email Configuration:");
        System.out.println("SMTP Host: " + host);
        System.out.println("SMTP Port: " + port);
        System.out.println("From: " + username);
        System.out.println("To: " + toEmail);
        System.out.println("Subject: Test Mail");
        
        // Properties setup
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        
        System.out.println("\nSMTP Properties configured:");
        for (String key : props.stringPropertyNames()) {
            System.out.println("  " + key + " = " + props.getProperty(key));
        }
        
        System.out.println("\nEmail Content:");
        String emailBody = "Dear Recipient,\n\n" +
                         "This is a test email sent using JavaMail API.\n" +
                         "This demonstrates SMTP configuration and email sending.\n\n" +
                         "Features demonstrated:\n" +
                         "- SMTP server configuration\n" +
                         "- Authentication setup\n" +
                         "- TLS encryption\n" +
                         "- Message composition\n\n" +
                         "Best regards,\n" +
                         "Sudhir Sharma\n" +
                         "Roll No: 53, Section: B";
        
        System.out.println(emailBody);
        
        // Code structure demonstration
        System.out.println("\n=== JavaMail Code Structure ===");
        System.out.println("1. Configure Properties (SMTP settings)");
        System.out.println("2. Create Session with Authentication");
        System.out.println("3. Create MimeMessage object");
        System.out.println("4. Set sender, recipient, subject, content");
        System.out.println("5. Use Transport.send() to send email");
        
        demonstrateJavaMailCode();
    }
    
    private static void demonstrateJavaMailCode() {
        System.out.println("\n=== Required Dependencies ===");
        System.out.println("Maven dependency:");
        System.out.println("<dependency>");
        System.out.println("    <groupId>javax.mail</groupId>");
        System.out.println("    <artifactId>mail</artifactId>");
        System.out.println("    <version>1.4.7</version>");
        System.out.println("</dependency>");
        
        System.out.println("\n=== Sample JavaMail Code Structure ===");
        System.out.println("// Session creation");
        System.out.println("Session session = Session.getInstance(props, authenticator);");
        System.out.println();
        System.out.println("// Message creation");
        System.out.println("Message message = new MimeMessage(session);");
        System.out.println("message.setFrom(new InternetAddress(fromEmail));");
        System.out.println("message.setRecipients(Message.RecipientType.TO,");
        System.out.println("    InternetAddress.parse(toEmail));");
        System.out.println("message.setSubject(\"Test Mail\");");
        System.out.println("message.setText(emailContent);");
        System.out.println();
        System.out.println("// Send email");
        System.out.println("Transport.send(message);");
        
        System.out.println("\nNote: This is a demonstration. Actual implementation");
        System.out.println("requires JavaMail API dependency in classpath.");
    }
}
