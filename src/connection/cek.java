/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;

/**
 *
 * @author Hafizh
 */
public class cek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        System.out.println("Koneksi Anda : " + conn);
    }
    
}
