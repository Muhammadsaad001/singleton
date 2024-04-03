/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pk.cuiatd.database;

/**
 *
 * @author Muhammad Saad
 */
public class Connection {
    private static Connection instance;

    // Private constructor to prevent instantiation
    private Connection() {
    }

    // Method to get instance of Connection
    public static Connection getInstance() {
        if (instance == null) {
            instance = new Connection();
        }
        return instance;
    }

    // Method to simulate getting data from the database
    public void getData() {
        System.out.println("This is the data retrieved from the DB");
    }
}