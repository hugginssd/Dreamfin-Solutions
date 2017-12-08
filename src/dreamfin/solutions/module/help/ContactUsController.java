/*
 * The Octopus Inc. License
 *
 * Copyright 2017 User.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * 
 * 
 * THIS PRODUCT IS DESIGNED AND DEVELOPED BY HUGGINS MAFIGU.
 * 
 * Copyright 2017 H.MAFIGU
 */
package dreamfin.solutions.module.help;

import dreamfin.solutions.Functions;
import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ContactUsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    Functions functions = new Functions();

    @FXML
    private TextField fieldEmailAddress;

    @FXML
    private TextArea fieldComment;

    @FXML
    private ComboBox cmbState;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cmbState.getItems().addAll("Algeria",
                "Angola",
                "Benin",
                "Botswana",
                "Burkina Faso",
                "Burundi",
                "Cabo Verde",
                "Cameroon",
                "Central African Republic (CAR)",
                "Chad",
                "Comoros",
                "Democratic Republic of the Congo",
                "Republic of the Congo",
                "Cote d'Ivoire",
                "Djibouti",
                "Egypt",
                "Equatorial Guinea",
                "Eritrea",
                "Ethiopia",
                "Gabon",
                "Gambia",
                "Ghana",
                "Guinea",
                "Guinea-Bissau",
                "Kenya",
                "Lesotho",
                "Liberia",
                "Libya",
                "Madagascar",
                "Malawi",
                "Mali",
                "Mauritania",
                "Mauritius",
                "Morocco",
                "Mozambique",
                "Namibia",
                "Niger",
                "Nigeria",
                "Rwanda",
                "Sao Tome and Principe",
                "Senegal",
                "Seychelles",
                "Sierra Leone",
                "Somalia",
                "South Africa",
                "South Sudan",
                "Sudan",
                "Swaziland",
                "Tanzania",
                "Togo",
                "Tunisia",
                "Uganda",
                "Zambia",
                "Zimbabwe"
        );
    }

    @FXML
    public void closeStage(Event event) {
        functions.closeWindow(event);
    }

    private String reciever;
    private String subj;
    private String con;
    private String username;
    private String password;
    private String from;
    private String host;
    private String put_auth;
    private String put_ttls;
    private String put_host;
    private String put_port;

    @FXML
    public void validateEmail(String emailStr) {
        Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);

        if (!fieldEmailAddress.getText().matches(emailStr) || fieldEmailAddress.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("The email you entered is invalid and does not exist.");
            alert.setHeaderText("Invalid email");
            alert.showAndWait();
        }
    }

    @FXML
    public void validateInput() {

        if (cmbState.getSelectionModel().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("The selected choice is invalid. Select valid state.");
            alert.setHeaderText("Invalid selection");
            alert.showAndWait();
        }
        if (fieldComment.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Make sure you have valid comments before you submit.");
            alert.setHeaderText("Invalid input");
            alert.showAndWait();
        }
        validateEmail(fieldEmailAddress.getText());
    }

    @FXML
    public void send() {

        Properties props = new Properties();
        props.put(put_auth, "true");
        props.put(put_ttls, "true");
        props.put(put_host, host);
        props.put(put_port, "587");

//        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(username, password);
//            }
//        });
//        try {
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(from));
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(reciever));
//            message.setSubject(subj);
//            message.setText(con);
//            Transport.send(message);
//            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//            alert.setHeaderText("Message sent");
//            alert.setContentText("Done");
//            alert.showAndWait();
//        } catch (MessagingException e) {
//            throw new RuntimeException(e);
//        }
    }
}
