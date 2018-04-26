/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

public class Configuration 
{
    public static final String
        HOSTNAME = "lrp-csdb000.systems.wvu.edu",
        PORT = "2201",
        SID = "cs440",
        JDBC_URL = String.format
                (
                "jdbc:oracle:thin:@//%s:%s/%s",
                HOSTNAME,
                PORT,
                SID
                );
    
}
