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
package dreamfin.solutions.module.products;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ProductsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void createLoans() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/dreamfin/solutions/module/products/createLoans.fxml"));
        Scene scene = new Scene(pane);
        stage = new Stage();
        //scene.getStylesheets().addAll("/resources/css/createloans.css");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.centerOnScreen();
        stage.showAndWait();
    }
}
