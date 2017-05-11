/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umzug;

import java.awt.*;
import java.util.logging.Logger;
import java.sql.Connection;
import java.util.Properties;
import java.sql.DriverManager;
import java.util.logging.Level;
import javax.swing.*;

/**
 *
 * @author rajninal
 */
public class Umzug
{
    /**
     * @param args the command line arguments
     */    
    public static Image img;
    public static UmzugFrame mainFrame;
    public static String text = "";    
    public final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    
    public static void main(String[] args) throws Exception
    {        
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        Properties properties = new Properties();
        properties.put("user", "user1");
        properties.put("password", "user1");
        Connection connection = DriverManager.getConnection("jdbc:derby:c:/TEMP/tutorialsDB;create=true", properties);
        
        if(connection != null)
        {
            setImage();            
            mainFrame = new UmzugFrame();
            mainFrame.setTitle("Umzug Tool");
            mainFrame.setIconImage(img);
            mainFrame.setName("Umzug Tool");
            mainFrame.validate();
            mainFrame.showFirstPanel();
            setFrameLocation();
        }             
    }
    
    public static void setImage() 
    {
        try 
        {
            Toolkit kit = Toolkit.getDefaultToolkit();
            img = kit.createImage(ClassLoader.getSystemResource("umzug/icons/Umzug.gif"));
        } 
        catch (Exception e) 
        {
            LOGGER.log(Level.SEVERE, "Exception", e);
        }
    }
    
    public static void setFrameLocation() 
    {
        java.awt.Rectangle parentRect = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
       
        mainFrame.setSize(parentRect.width, parentRect.height);        
        mainFrame.setLocation(0, 0);
        mainFrame.setResizable(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}
