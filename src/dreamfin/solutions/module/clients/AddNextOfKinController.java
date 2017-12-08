/*
 * The Octopus Inc. License
 *
 * Copyright 2017 Huggins.
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
package dreamfin.solutions.module.clients;

import dreamfin.solutions.Functions;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AddNextOfKinController implements Initializable {

    @FXML
    private TextField fieldName;

    @FXML
    private DatePicker dpDOB;

    @FXML
    private TextField fieldAddress;

    @FXML
    private ComboBox cmbCity;

    @FXML
    private TextField fieldPhoneNumber;

    @FXML
    private ComboBox cmbRelationToClient;

    @FXML
    private ComboBox cmbState;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnClose;
    
    @FXML
    public Label lblClientID;

    /**
     * Initializes the controller class.
     */
    Functions functions = new Functions();
    Connection connect;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cmbCity.getItems().addAll("Bindura", "Bulawayo", "Chinhoyi", "Gweru", "Harare", "Kwekwe", "Kadoma", "Kariba", "Masvingo", "Mutare", "Mt Darwin");

        cmbRelationToClient.getItems().addAll("FATHER", "MOTHER", "SISTER", "BROTHER", "AUNT", "GRANDFATHER", "GRANDMOTHER");
        cmbState.getItems().addAll("MASH CENTRAL", "MASH EAST", "MASH WEST", "MASVINGO", "HARARE", "MAT SOUTH", "MAT NORTH", "MANICALAND", "BULAWAYO", "MIDLANDS");
    }

    @FXML
    public void addNextOfKin() throws ClassNotFoundException, SQLException {
        connect = functions.getConnection();
        String sql = "INSERT INTO `tblnextofkin`(`clientid`, `relationship`, `nokname`, `dateofbirth`, `address`, "
                + " `city`, `phonenumber`, `state`, `datecreated`, `usercreated`, `lastdatetoupdate`, "
                + " `lastmachineupdated`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        pst = connect.prepareStatement(sql);
        pst.setString(1, sql);
    }

    @FXML
    public void closeStage(Event event) {
        functions.closeWindow(event);
    }
}
