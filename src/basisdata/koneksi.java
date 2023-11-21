/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basisdata;

/**
 *
 * @author aril
 */
import java.sql.Connection;

public class koneksi {
    public static void main(String[] args) {
        Basisdata basisdata = new Basisdata();
        Connection connection = basisdata.getKoneksi();

        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connection closed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

