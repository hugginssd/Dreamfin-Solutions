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
import dreamfin.solutions.module.groups.GroupsConstructor;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ClientsController implements Initializable {

    @FXML
    Stage stage;

    @FXML
    private Button btnCreateClients;

    @FXML
    private TextField fieldClientId;

    @FXML
    private TextField fieldFirstName;

    @FXML
    private TextField fieldMiddleName;

    @FXML
    private TextField fieldLastname;

    @FXML
    private DatePicker dpRegdate;

    @FXML
    private TextField fieldPhonenumber;

    @FXML
    private TextField fieldEmailAddress;

    @FXML
    private DatePicker dpDOB;

    @FXML
    private ComboBox cmbSelectGender;

    @FXML
    private ComboBox cmbTown;

    @FXML
    private ComboBox cmbMaritalStatus;

    @FXML
    private TextField fieldEmploymentIncome;

    @FXML
    private ComboBox cmbNetPay;

    @FXML
    private DatePicker dpEmploymentStartDate;

    @FXML
    private TextField fieldAddress;

    @FXML
    private TextField fieldCity;

    @FXML
    private ComboBox cmbCountry;

    @FXML
    private TextField fieldPostalCode;

    @FXML
    private TitledPane clientInformationAccord;

    @FXML
    private TitledPane clientIdentificationAccord;

    @FXML
    private TitledPane nextOfKinAccord;

    @FXML
    private TitledPane employmentDetailsAccord;

    @FXML
    private TitledPane newClientAccord;

    @FXML
    private Tab registerCliensTab;

    @FXML
    private TabPane clientsTabPane;

    @FXML
    private ObservableList<ClientsConstructor> clientsData;

    @FXML
    private TableView<ClientsConstructor> tableSearchClients;

    @FXML
    private TableColumn<ClientsConstructor, String> colClientID;

    @FXML
    private TableColumn<ClientsConstructor, String> colDisplayName;

    @FXML
    private TableColumn<ClientsConstructor, String> colGroupName;

    @FXML
    private TableColumn<ClientsConstructor, String> colBranchName;

    @FXML
    private TableColumn colview;
    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    Functions functions = new Functions();
    Statement st;
    PreparedStatement pst;
    ResultSet rs;

    Connection connect;
    AddNextOfKinController nextOfKin = new AddNextOfKinController();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //load countries
        cmbCountry.getItems().addAll("Botswana", "DRC", "Namibia", "Lesotho", "Swaziland", "South Africa", "Zambia", "Zimbabwe");
        //load pay range
        cmbNetPay.getItems().addAll("500.00", "750.00", "950.00", "1000.00", "1500.00", "1750.00", "2200.00");
        //load gender
        cmbSelectGender.getItems().addAll("Female", "Male", "Other");
        //load town
        cmbTown.getItems().addAll("Bindura", "Bulawayo", "Chinhoyi", "Gweru", "Harare", "Kwekwe", "Kadoma", "Kariba", "Masvingo", "Mutare", "Mt Darwin");
        //load marital status
        cmbMaritalStatus.getItems().addAll("Single", "Married", "Other");
        clientInformationAccord.isExpanded();
        loadClients();
    }

    @FXML
    public void addIdentification() throws IOException {
        AnchorPane root = FXMLLoader.load(getClass().getResource("/dreamfin/solutions/module/clients/addIdentification.fxml"));
        Scene scene = new Scene(root);
        stage = new Stage();
        stage.setHeight(325);
        stage.setWidth(450);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Add Identification");
        stage.centerOnScreen();
        stage.showAndWait();

    }

    @FXML
    public void addNextOfKin() throws IOException {

        if (fieldClientId.getText().isEmpty()) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("EMPTY");
            alert.setHeaderText("Null : Client Id");
            alert.setContentText("Provide the client with the client id before you can proceed.");
            alert.showAndWait();
            newClientAccord.expandedProperty().setValue(Boolean.TRUE);
            fieldClientId.requestFocus();
            return;
        }
        nextOfKin.lblClientID.setText(fieldClientId.getText().toUpperCase());
        AnchorPane root = FXMLLoader.load(getClass().getResource("addNextOfKin.fxml"));
        Scene scene = new Scene(root);
        stage = new Stage();
        stage.setScene(scene);
        stage.setHeight(450);
        stage.setWidth(600);
        stage.setResizable(false);
        stage.setTitle("Add Next Of Kin");
        stage.centerOnScreen();
        stage.show();

    }

    @FXML
    public void createClients() throws ClassNotFoundException, SQLException, UnknownHostException {
        if (fieldClientId.getText().isEmpty()) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("EMPTY");
            alert.setHeaderText("Null : Client id field");
            alert.setContentText("Please make sure all the parameters are valid before you submitt.");
            alert.showAndWait();
            return;
        }
        if (fieldEmploymentIncome.getText().isEmpty()) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("EMPTY");
            alert.setHeaderText("Null : Income field");
            alert.setContentText("Please make sure you have specified the client's income per month before submission.");
            alert.showAndWait();
            return;
        }
        connect = functions.getConnection();
        String sql = "INSERT INTO `tblclients`(`clientid`, `clientname`, `datecreated`, `firstname`, "
                + "`middlename`, `surname`, `regdate`, `phonenumber`, `dateofbirth`, `gender`, `town`, "
                + "`maritalstatus`, `emailaddress`, `lastmachinetoedit`, `lastmachinetoupdate`) "
                + "VALUES (?,?,?,?,?,?,?,?,"
                + " ?,?,?,?,?,?,?)";
        try {
            pst = connect.prepareStatement(sql);
            pst.setString(1, fieldClientId.getText().toUpperCase());
            pst.setString(2, fieldFirstName.getText().toUpperCase() + " " + fieldMiddleName.getText().toUpperCase() + " " + fieldLastname.getText().toUpperCase());
            pst.setDate(3, Date.valueOf(LocalDate.now()));
            pst.setString(4, fieldFirstName.getText().toUpperCase());
            pst.setString(5, fieldMiddleName.getText().toUpperCase());
            pst.setString(6, fieldLastname.getText().toUpperCase());
            pst.setString(7, dpRegdate.getValue().getYear() + "-" + dpRegdate.getValue().getMonth().getValue() + "-" + dpRegdate.getValue().getDayOfMonth());
            pst.setString(8, fieldPhonenumber.getText().toUpperCase());
            pst.setString(9, dpDOB.getValue().getYear() + "-" + dpDOB.getValue().getMonth().getValue() + "-" + dpDOB.getValue().getDayOfMonth());
            pst.setString(10, ((TextField) cmbSelectGender.getEditor()).getText().toUpperCase());
            pst.setString(11, ((TextField) cmbTown.getEditor()).getText().toUpperCase());
            pst.setString(12, ((TextField) cmbMaritalStatus.getEditor()).getText().toUpperCase());
            pst.setString(13, fieldEmailAddress.getText());
            pst.setString(14, InetAddress.getLocalHost().getHostName().toUpperCase());
            pst.setString(15, InetAddress.getLocalHost().getHostName().toUpperCase());
            pst.execute();
            //pst = null;
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Information");
            alert.setHeaderText("Client Data");
            alert.setContentText("Client data successfully saved");
            alert.showAndWait();
        } catch (UnknownHostException | SQLException e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("EXECUTION ERROR");
            alert.setHeaderText("Batch Processing Error");
            alert.setContentText(e.toString());
            alert.showAndWait();
            pst = null;
        } finally {
            if (pst != null) {
                pst = null;
            }
        }
        //Employment details
        String sqll = "INSERT INTO `tblemploymentdetails`( `clientid`, `employmentincome`, `netpay`, "
                + "`employmentstartdate`, `address`, `city`, `country`, `postalcode`) "
                + "VALUES (?,?,?,?,?,?,?,?)";
        try {
            pst = connect.prepareStatement(sqll);
            pst.setString(1, fieldClientId.getText().toUpperCase());
            pst.setDouble(2, Double.parseDouble(fieldEmploymentIncome.getText()));
            pst.setDouble(3, Double.parseDouble(((TextField) cmbNetPay.getEditor()).getText()));
            pst.setString(4, dpEmploymentStartDate.getValue().getYear() + "-" + dpEmploymentStartDate.getValue().getMonth().getValue() + "-" + dpEmploymentStartDate.getValue().getDayOfMonth());// dpEmploymentStartDate.getEditor()).getText());
            pst.setString(5, fieldAddress.getText().toUpperCase());
            pst.setString(6, fieldCity.getText().toUpperCase());
            pst.setString(7, ((TextField) cmbCountry.getEditor()).getText().toUpperCase());
            pst.setString(8, fieldPostalCode.getText().toUpperCase());
            pst.execute();
            //pst = null;
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Information");
            alert.setHeaderText("Batch");
            alert.setContentText("Client information successfully saved");
            alert.showAndWait();
        } catch (SQLException e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("EXECUTION ERROR");
            alert.setHeaderText("Batch Error");
            alert.setContentText(e.toString());
            alert.showAndWait();
            pst = null;
        } finally {
            if (pst != null) {
                pst = null;
            }
        }
        resetInput();
        //clear all fields
    }

    @FXML
    public void resetInput() {
        fieldFirstName.clear();
        fieldMiddleName.clear();
        fieldLastname.clear();
        dpRegdate.getEditor().clear();
        fieldPhonenumber.clear();
        dpDOB.getEditor().clear();
        cmbSelectGender.getEditor().clear();
        cmbTown.getEditor().clear();
        cmbMaritalStatus.getEditor().clear();
        fieldEmailAddress.clear();
        fieldClientId.clear();
        fieldEmploymentIncome.clear();
        cmbNetPay.setValue(0);
        cmbNetPay.getEditor().clear();
        dpEmploymentStartDate.getEditor().clear();
        fieldAddress.clear();
        fieldCity.clear();
        cmbCountry.getEditor().clear();
        fieldPostalCode.clear();
    }

    @FXML
    public void openNextClientTab() {

        clientInformationAccord.expandedProperty().setValue(Boolean.TRUE);

    }

    @FXML
    public void openNextClientIdentificationTab() {
        clientIdentificationAccord.expandedProperty().setValue(Boolean.TRUE);
    }

    @FXML
    public void openNextOfKinTab() {
        nextOfKinAccord.expandedProperty().setValue(Boolean.TRUE);

    }

    @FXML
    public void openEmploymentDetailsTab() {
        employmentDetailsAccord.expandedProperty().setValue(Boolean.TRUE);
    }

    @FXML
    public void openPreviousNextOfKinTab() {
        nextOfKinAccord.expandedProperty().setValue(Boolean.TRUE);

    }

    @FXML
    public void openPreviousClientIdentificationTab() {
        clientIdentificationAccord.expandedProperty().setValue(Boolean.TRUE);
    }

    @FXML
    public void openPreviousClientInformationTab() {
        clientInformationAccord.expandedProperty().setValue(Boolean.TRUE);

    }

    @FXML
    public void openPreviousNewClientTab() {

        newClientAccord.expandedProperty().setValue(Boolean.TRUE);
        fieldClientId.requestFocus();
    }

    @FXML
    public void openRegisterWithClients() {
        SingleSelectionModel<Tab> tabRegister = clientsTabPane.getSelectionModel();
        if (!tabRegister.isSelected(2)) {
            tabRegister.select(2);
            openPreviousNewClientTab();
        }

    }

    ///Setting up the clients table
    @FXML
    public void loadClients() {
        clientsData = FXCollections.observableArrayList();
        clientsData.addAll(new ClientsConstructor("CL-001","SANDAR PICHAI","PREMIUM","SAN FRANCISCO"),
                           new ClientsConstructor("CL-002","MARK ZAUCKERBURG","COMPACT","ALAMEDA STREET"));
        colClientID.setCellValueFactory(new PropertyValueFactory<>("clientID"));
        colDisplayName.setCellValueFactory(new PropertyValueFactory<>("displayName"));
        colGroupName.setCellValueFactory(new PropertyValueFactory<>("groupName"));
        colBranchName.setCellValueFactory(new PropertyValueFactory<>("branchName"));
        colview.setCellValueFactory(new PropertyValueFactory<>("view"));
        colview.setSortable(false);
        
        Callback<TableColumn<GroupsConstructor, String>, TableCell<GroupsConstructor, String>> cellFactory
                = //
                (final TableColumn<GroupsConstructor, String> param) -> {
                    final TableCell<GroupsConstructor, String> cell = new TableCell<GroupsConstructor, String>() {

                Image recruitIcon = new Image(getClass().getResourceAsStream("/resources/icons/eye.png"));
                final Button btn = new Button("view", new ImageView(recruitIcon));
                
                @Override
                public void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    if (empty) {
                        setGraphic(null);
                        setText(null);
                    } else {
                        btn.setOnAction(event -> {
                            GroupsConstructor person = getTableView().getItems().get(getIndex());
                            System.out.println(person.getLoanOfficerName()
                                    + "   " + person.getRegisteredBy());
                        });
                        setGraphic(btn);
                        setText(null);
                    }
                }
            };
                    return cell;
                };

        colview.setCellFactory(cellFactory);
        
        tableSearchClients.setItems(clientsData);
        
        
        
    }
}

//class Clients extends ClientsController {
//
//    private String clientID;
//    private String displayName;
//    private String groupName;
//    private String branchName;
//
//    public Clients(String clientID, String displayName, String groupName, String branchName) {
//        this.clientID = clientID;
//        this.displayName = displayName;
//        this.groupName = groupName;
//        this.branchName = branchName;
//    }
//
//    public String getClientID() {
//        return clientID;
//    }
//
//    public void setClientID(String clientID) {
//        this.clientID = clientID;
//    }
//
//    public String getDisplayName() {
//        return displayName;
//    }
//
//    public void setDisplayName(String displayName) {
//        this.displayName = displayName;
//    }
//
//    public String getGroupName() {
//        return groupName;
//    }
//
//    public void setGroupName(String groupName) {
//        this.groupName = groupName;
//    }
//
//    public String getBranchName() {
//        return branchName;
//    }
//
//    public void setBranchName(String branchName) {
//        this.branchName = branchName;
//    }
//
//}
