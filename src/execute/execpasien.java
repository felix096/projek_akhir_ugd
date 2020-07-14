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
import entity.pasien;
/**
 *
 * @author Hafizh
 */
public class execpasien {
    public List<pasien> getpasien(){
 List<pasien> listpasien = new ArrayList<>();
 String query = "select * from pasien";
 ConnectionManager conMan = new ConnectionManager();
 Connection conn = conMan.logOn();
 try {
 Statement stm = conn.createStatement();
 ResultSet rs = stm.executeQuery(query);
 while(rs.next()){
 pasien pasien = new pasien();
 pasien.setktp(rs.getString("ktp"));
 pasien.setnama_pasien(rs.getString("nama_pasien"));
 pasien.setalamat_pasien(rs.getString("alamat_pasien"));
 pasien.setttl_pasien(rs.getString("ttl_pasien"));
 pasien.setnohp_pasien(rs.getString("nohp_pasien"));
 pasien.setgejala_pasien(rs.getString("gejala_pasien"));
 listpasien.add(pasien);
 }
 } catch (SQLException ex) {
 Logger.getLogger(execpasien.class.getName()).log(Level.SEVERE, null, ex);
 }
 conMan.logOff();
 return listpasien;
 }

 public int insertpasien(pasien pasien){
 int hasil = 0;
 String query = "Insert into pasien(ktp, nama_pasien, alamat_pasien, ttl_pasien, nohp_pasien, gejala_pasien)"
 + "value('"+ pasien.getktp()+"','"
 +pasien.getnama_pasien()+"','"
 +pasien.getalamat_pasien()+"','"
 +pasien.getttl_pasien()+"','"        
 +pasien.getnohp_pasien()+"','"        
 +pasien.getgejala_pasien()+"')";
 ConnectionManager conMan = new ConnectionManager();
 Connection conn = conMan.logOn();
 try {
 Statement stm = conn.createStatement();
 hasil = stm.executeUpdate(query);
 } catch (SQLException ex) {
 Logger.getLogger(execpasien.class.getName()).log(Level.SEVERE, null, ex);
 }
 conMan.logOff();

 return hasil;
 }

 public int deletepasien(String delid){
 int hasil = 0;
 String query = "delete from pasien where ktp='"+ delid+"'";
 ConnectionManager conMan = new ConnectionManager();
 Connection conn = conMan.logOn();
 try {
 Statement stm = conn.createStatement();
 hasil = stm.executeUpdate(query);
 } catch (SQLException ex) {
 Logger.getLogger(execpasien.class.getName()).log(Level.SEVERE, null, ex);
 }
 conMan.logOff();
 return hasil;
 }

 public int updatepasien (pasien newpasien){
 int hasil = 0;
 String query = "update pasien set nama_pasien='"+newpasien.getnama_pasien()+"'"
         + ",alamat_pasien='"+newpasien.getalamat_pasien()+"'"
         + ",ttl_pasien='"+newpasien.getttl_pasien()+"'"
         + ",nohp_pasien='"+newpasien.getnohp_pasien()+"'"
         +",gejala_pasien='"+
 newpasien.getgejala_pasien() +"' where ktp = '"+
 newpasien.getktp() + "'";
 ConnectionManager conMan = new ConnectionManager();
 Connection conn = conMan.logOn();
 try {
 Statement stm = conn.createStatement();
 hasil = stm.executeUpdate(query);
 } catch (SQLException ex) {
 Logger.getLogger(execpasien.class.getName()).log(Level.SEVERE, null, ex);
 }
 conMan.logOff();
 return hasil;
 }
}
