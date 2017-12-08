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
package dreamfin.solutions.module.groups;

import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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
public class GroupsController implements Initializable {

    @FXML
    private Button btnNextEnterPayment;

    @FXML
    private ImageView recruitView;

    @FXML
    private ObservableList<GroupsConstructor> tableData;

    @FXML
    private TableView<GroupsConstructor> tablePendingGroupPosting;

    @FXML
    private TableColumn<GroupsConstructor, String> colLoanOficerName;

    @FXML
    private TableColumn<GroupsConstructor, String> colRegisteredBy;

    @FXML
    private TableColumn<GroupsConstructor, Date> colregisteredOn;

    @FXML
    private TableColumn<GroupsConstructor, String> colDescription;

    @FXML
    private TableColumn colview;

    @FXML
    private ObservableList<GroupsConstructor> tableData1;

    @FXML
    private TableView<GroupsConstructor> tableGroupPostingHistory;

    @FXML
    private TableColumn<GroupsConstructor, String> colLoanOficerName1;

    @FXML
    private TableColumn<GroupsConstructor, String> colRegisteredBy1;

    @FXML
    private TableColumn<GroupsConstructor, Date> colregisteredOn1;

    @FXML
    private TableColumn<GroupsConstructor, String> colDescription1;

    @FXML
    private TableColumn<GroupsConstructor, String> colStatus;

    @FXML
    private TableColumn colView;

    @FXML
    private Stage stage;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        Image recruitIcon = new Image(getClass().getResourceAsStream("/resources/icons/recruit.png"));
        ImageView recruitView = new ImageView(recruitIcon);
        recruitView = new ImageView();
        recruitView.setFitWidth(10);
        recruitView.setFitHeight(10);
        btnNextEnterPayment.setGraphic(recruitView);//setting the recruit icon to menuItem recruit

        tableData = FXCollections.observableArrayList();
        tableData.addAll(new GroupsConstructor("Sundar Pichai", "Mauricio Pochettino", Date.valueOf(LocalDate.now()), "Not yet posted"));

        colLoanOficerName.setCellValueFactory(new PropertyValueFactory<>("loanOfficerName"));
        colRegisteredBy.setCellValueFactory(new PropertyValueFactory<>("registeredBy"));
        colregisteredOn.setCellValueFactory(new PropertyValueFactory<>("registeredOn"));
        colDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
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

        tablePendingGroupPosting.setItems(tableData);

        //  tableData.clear();
        tableData1 = FXCollections.observableArrayList();
        tableData1.addAll(new GroupsConstructor("Sundar Pichai", "Mauricio Pochettino", Date.valueOf(LocalDate.now()), "Not yet posted", "Approved"));
        colLoanOficerName1.setCellValueFactory(new PropertyValueFactory<>("loanOfficerName"));
        colRegisteredBy1.setCellValueFactory(new PropertyValueFactory<>("registeredBy"));
        colregisteredOn1.setCellValueFactory(new PropertyValueFactory<>("registeredOn"));
        colDescription1.setCellValueFactory(new PropertyValueFactory<>("description"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        colView.setSortable(false);
        Callback<TableColumn<GroupsConstructor, String>, TableCell<GroupsConstructor, String>> cellFactory1
                = //
                (final TableColumn<GroupsConstructor, String> param) -> {
                    final TableCell<GroupsConstructor, String> cell1;
                     cell1 = new TableCell<GroupsConstructor, String>() {
                
                Image eye = new Image(getClass().getResourceAsStream("/resources/icons/eye.png"));
                final Button btn1 = new Button("view", new ImageView(eye));
                

                @Override
                public void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty);
                    if (empty) {
                        setGraphic(null);
                        setText(null);
                    } else {
                        btn1.setOnAction(event -> {
                            GroupsConstructor person = getTableView().getItems().get(getIndex());
                            System.out.println(person.getLoanOfficerName()
                                    + "   " + person.getRegisteredBy());
                        });
                        setGraphic(btn1);
                        setText(null);
                    }
                }
            };
                    return cell1;
                };

        colView.setCellFactory(cellFactory1);
        tableGroupPostingHistory.setItems(tableData1);
    }

    @FXML
    public void createCenter() throws IOException {
        AnchorPane root = FXMLLoader.load(getClass().getResource("centerRegistration.fxml"));
        Scene scene = new Scene(root);
        stage = new Stage();
        stage.setScene(scene);
//        stage.setWidth(1060);
//        stage.setHeight(470);
        stage.setResizable(false);
        stage.setTitle("Center Registration");
        stage.centerOnScreen();
        stage.sizeToScene();
        stage.showAndWait();

    }
}
