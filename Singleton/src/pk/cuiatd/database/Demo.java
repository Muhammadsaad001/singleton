/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pk.cuiatd.database;

/**
 *
 * @author Muhammad Saad
 */
public class Demo {

    public static void main(String[] args) {
        // Get an instance of Connection
        Connection connection = Connection.getInstance();

        // Call the getData method to simulate fetching data from the database
        connection.getData();
    }
}