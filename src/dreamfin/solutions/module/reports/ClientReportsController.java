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
package dreamfin.solutions.module.reports;

import dreamfin.solutions.module.groups.GroupsConstructor;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
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
public class ClientReportsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TableView<ClientReportsConstructor> tableviewClientReports;

    @FXML
    private ObservableList<ClientReportsConstructor> viewData;

    @FXML
    private TableColumn<ClientReportsConstructor, String> colName;

    @FXML
    private TableColumn<ClientReportsConstructor, String> colCategory;

    @FXML
    private TableColumn<ClientReportsConstructor, String> colDescription;

    @FXML
    private TableColumn colRunReport;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Stage stage;

    @FXML
    private TableView tableClientReports;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        tableClientReports.setVisible(false);
        stage = new Stage();
        stage.setHeight(510);
        stage.setWidth(1069);
        viewData = FXCollections.observableArrayList();
        viewData.addAll(new ClientReportsConstructor("Branch Client Report", "Clients", "The reports shows all loan and savings " + "information for any client within a particular branch, similar to the Group report, but for an entire branch."),
                new ClientReportsConstructor("Client Numbers Report", "Clients", "Breaks down the clients in the system into different bands."),
                new ClientReportsConstructor("Client Numbers Report (branch)", "Clients", "Breaks down the clients in the system into different bands."),
                new ClientReportsConstructor("Client Overview", "Clients", "Lists of clients in a particular office."),
                new ClientReportsConstructor("Closed Client Report", "Clients", "This report show the closed client between the start and end date."),
                new ClientReportsConstructor("Funds Transfer Report", "Client", "The report gives an overview of all funds transfer that have been carried out in the system."),
                new ClientReportsConstructor("Loan Schedule", "Client", "Shows the loan schedule of a given client."),
                new ClientReportsConstructor("Top Clients Report", "Client", "This report shows the key information about the largest savers and borrowers in the organization."));

        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colCategory.setCellValueFactory(new PropertyValueFactory<>("category"));
        colDescription.setCellValueFactory(new PropertyValueFactory<>("description"));

        colRunReport.setSortable(false);
        colRunReport.setCellValueFactory(new PropertyValueFactory<>("view"));

        Callback<TableColumn<GroupsConstructor, String>, TableCell<GroupsConstructor, String>> cellFactory
                = //
                (final TableColumn<GroupsConstructor, String> param) -> {
                    final TableCell<GroupsConstructor, String> cell = new TableCell<GroupsConstructor, String>() {

                Image recruitIcon = new Image(getClass().getResourceAsStream("/resources/icons/eye.png"));
                final Button btn = new Button("view",  new ImageView(recruitIcon));
                 
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

        colRunReport.setCellFactory(cellFactory);
        tableviewClientReports.setItems(null);
        tableviewClientReports.setItems(viewData);

    }
}
