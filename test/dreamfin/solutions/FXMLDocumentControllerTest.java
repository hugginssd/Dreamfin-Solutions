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
package dreamfin.solutions;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.scene.chart.XYChart;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class FXMLDocumentControllerTest {
    
    public FXMLDocumentControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of initialize method, of class FXMLDocumentController.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL url = null;
        ResourceBundle rb = null;
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.initialize(url, rb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closeDreamfin method, of class FXMLDocumentController.
     */
    @Test
    public void testCloseDreamfin() {
        System.out.println("closeDreamfin");
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.closeDreamfin();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logoutDreamfin method, of class FXMLDocumentController.
     */
    @Test
    public void testLogoutDreamfin() throws Exception {
        System.out.println("logoutDreamfin");
        Event event = null;
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.logoutDreamfin(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadClients method, of class FXMLDocumentController.
     */
    @Test
    public void testLoadClients() throws Exception {
        System.out.println("loadClients");
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.loadClients();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addGroups method, of class FXMLDocumentController.
     */
    @Test
    public void testAddGroups() throws Exception {
        System.out.println("addGroups");
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.addGroups();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDummyChartData method, of class FXMLDocumentController.
     */
    @Test
    public void testGetDummyChartData() {
        System.out.println("getDummyChartData");
        FXMLDocumentController instance = new FXMLDocumentController();
        ObservableList<XYChart.Series<String, Double>> expResult = null;
        ObservableList<XYChart.Series<String, Double>> result = instance.getDummyChartData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProducts method, of class FXMLDocumentController.
     */
    @Test
    public void testAddProducts() throws Exception {
        System.out.println("addProducts");
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.addProducts();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
