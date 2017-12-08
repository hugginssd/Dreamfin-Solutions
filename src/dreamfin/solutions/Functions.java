/*
 * The Octopus Inc. License
 *
 * Copyright 2017 HUGGINS.
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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javafx.event.Event;
import javafx.scene.Node;

/**
 *
 * @author Huggins
 */
public class Functions
{
    public void closeWindow(Event event)
    {
    ((Node) (event.getSource())).getScene().getWindow().hide();
    
    }
    
    public Connection getConnection() throws ClassNotFoundException, SQLException{
    
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_dreamfinsolutions", "root", "");
        System.out.println("CONNECTION SUCCESSFULLY");
        return conn;
    
    
    }
    
    
    
    
    
}
