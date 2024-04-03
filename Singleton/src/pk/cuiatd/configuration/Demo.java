/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pk.cuiatd.configuration;

/**
 *
 * @author Muhammad Saad
 */
public class Demo {

    public static void main(String[] args) {
        Configuration config = Configuration.getInstance();
        if (config != null) {
            // Corrected keys: "mode", "font-size", and "font-type"
            System.out.println("Mode: " + config.getValue("mode"));
            System.out.println("Font Size: " + config.getValue("font-size"));
            System.out.println("Font Type: " + config.getValue("font-type"));
        } else {
            System.err.println("Failed to get configuration instance.");
        }
    }
}