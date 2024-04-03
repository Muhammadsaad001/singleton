/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pk.cuiatd.configuration;

/**
 *
 * @author Muhammad Saad
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
    private static Configuration instance;
    private Properties configProperties;

    private Configuration() {
        // Initialize properties object
        configProperties = new Properties();

        // Set default values
        configProperties.setProperty("mode", "production");
        configProperties.setProperty("font-size", "12");
        configProperties.setProperty("font-type", "Arial");

        // Save properties to config.properties file
        try {
            File configFile = new File("src/pk/cuiatd/configuration/config.properties");
            configFile.getParentFile().mkdirs(); // Ensure directory structure exists
            FileOutputStream outputStream = new FileOutputStream(configFile);
            configProperties.store(outputStream, "Configuration Properties");
            outputStream.close();
        } catch (IOException e) {
            System.err.println("Error creating config.properties file: " + e.getMessage());
        }
    }

    public String getValue(String key) {
        return configProperties.getProperty(key);
    }

    public static Configuration getInstance() {
        if (instance == null)
            instance = new Configuration();
        return instance;
    }
}