/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardboardcommunity;
import java.sql.*; 
import static helpers.Configuration.JDBC_URL;

public class CardboardCommunity {
	static Connection connection;
 	static BaseForm form;
	 public static void startConnection() throws SQLException
	 {
		System.out.println("Connecting...");
		connection = DriverManager.getConnection
				(
					JDBC_URL, 
					"rebekah_alex", 
					"sittingInAHeap"
				);
		System.out.println("Connected successfully.");
	 }

    public static void main(String[] args) {

        System.out.println("Starting Cardboard Communtity...");        
        try
        {
            System.out.println("Starting Connection...");
            startConnection();
        }
        catch (SQLException e)
        {
            System.out.println("Connection unable to start...");
        }
        
        form = new BaseForm();
        form.setVisible(true);
    }
    
}
