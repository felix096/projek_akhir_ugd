/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execute;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import connection.ConnectionManager;
import entity.dokter;
/**
 *
 * @author Hafizh
 */
public class execdokter {
   public List<dokter> getdokter(){
 List<dokter> listdokter = new ArrayList<>();
 String query = "select * from dokter";
 ConnectionManager conMan = new ConnectionManager();
 Connection conn = conMan.logOn();
 try {
 Statement stm = conn.createStatement();
 ResultSet rs = stm.executeQuery(query);
 while(rs.next()){
 dokter dokter = new dokter();
 dokter.setid_dokter(rs.getString("id_dokter"));
 dokter.setnama_dokter(rs.getString("nama_dokter"));
 dokter.setalamat_dokter(rs.getString("alamat_dokter"));
 dokter.setttl_dokter(rs.getString("ttl_dokter"));
 dokter.setnohp_dokter(rs.getString("nohp_dokter"));
 listdokter.add(dokter);
 }
 } catch (SQLException ex) {
 Logger.getLogger(execdokter.class.getName()).log(Level.SEVERE, null, ex);
 }
 conMan.logOff();
 return listdokter;
 }

 public int insertdokter(dokter dokter){
 int hasil = 0;
 String query = "Insert into dokter(id_dokter, nama_dokter, alamat_dokter, ttl_dokter, nohp_dokter)"
 + "value('"+ dokter.getid_dokter()+"','"
 +dokter.getnama_dokter()+"','"
 +dokter.getalamat_dokter()+"','"
 +dokter.getttl_dokter()+"','"        
 +dokter.getnohp_dokter()+"')";
 ConnectionManager conMan = new ConnectionManager();
 Connection conn = conMan.logOn();
 try {
 Statement stm = conn.createStatement();
 hasil = stm.executeUpdate(query);
 } catch (SQLException ex) {
 Logger.getLogger(execdokter.class.getName()).log(Level.SEVERE, null, ex);
 }
 conMan.logOff();

 return hasil;
 }

 public int deletedokter(String delid){
 int hasil = 0;
 String query = "delete from dokter where id_dokter='"+ delid+"'";
 ConnectionManager conMan = new ConnectionManager();
 Connection conn = conMan.logOn();
 try {
 Statement stm = conn.createStatement();
 hasil = stm.executeUpdate(query);
 } catch (SQLException ex) {
 Logger.getLogger(execdokter.class.getName()).log(Level.SEVERE, null, ex);
 }
 conMan.logOff();
 return hasil;
 }

 public int updatedokter (dokter newdokter){
 int hasil = 0;
 String query = "update dokter set nama_dokter='"+newdokter.getnama_dokter()+"'"
         + ",alamat_dokter='"+newdokter.getalamat_dokter()+"'"
         + ",ttl_dokter='"+newdokter.getttl_dokter()+"'"
         +",nohp_dokter='"+
 newdokter.getnohp_dokter() +"' where id_dokter = '"+
 newdokter.getid_dokter() + "'";
 ConnectionManager conMan = new ConnectionManager();
 Connection conn = conMan.logOn();
 try {
 Statement stm = conn.createStatement();
 hasil = stm.executeUpdate(query);
 } catch (SQLException ex) {
 Logger.getLogger(execdokter.class.getName()).log(Level.SEVERE, null, ex);
 }
 conMan.logOff();
 return hasil;
 }
}