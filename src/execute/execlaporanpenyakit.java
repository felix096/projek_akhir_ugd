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
import entity.laporanpenyakit;
/**
 *
 * @author Hafizh
 */
public class execlaporanpenyakit {
    public List<laporanpenyakit> getlaporanpenyakit(){
 List<laporanpenyakit> listlaporanpenyakit = new ArrayList<>();
 String query = "select * from laporan_penyakit";
 ConnectionManager conMan = new ConnectionManager();
 Connection conn = conMan.logOn();
 try {
 Statement stm = conn.createStatement();
 ResultSet rs = stm.executeQuery(query);
 while(rs.next()){
 laporanpenyakit laporanpenyakit = new laporanpenyakit();
 laporanpenyakit.setid_laporan_penyakit(rs.getString("id_laporan_penyakit"));
 laporanpenyakit.setktp(rs.getString("ktp"));
 laporanpenyakit.setid_dokter(rs.getString("id_dokter"));
 laporanpenyakit.setpenyakit_pasien(rs.getString("penyakit_pasien"));
 laporanpenyakit.setobat(rs.getString("obat"));
 
 listlaporanpenyakit.add(laporanpenyakit);
 }
 } catch (SQLException ex) {
 Logger.getLogger(execlaporanpenyakit.class.getName()).log(Level.SEVERE, null, ex);
 }
 conMan.logOff();
 return listlaporanpenyakit;
 }

 public int insertlaporanpenyakit(laporanpenyakit laporanpenyakit){
 int hasil = 0;
 String query = "Insert into laporan_penyakit(id_laporan_penyakit, ktp, id_dokter, penyakit_pasien, obat)"
 + "value('"+ laporanpenyakit.getid_laporan_penyakit()+"','"
 +laporanpenyakit.getktp()+"','"
 +laporanpenyakit.getid_dokter()+"','"
 +laporanpenyakit.getpenyakit_pasien()+"','"               
 +laporanpenyakit.getobat()+"')";
 ConnectionManager conMan = new ConnectionManager();
 Connection conn = conMan.logOn();
 try {
 Statement stm = conn.createStatement();
 hasil = stm.executeUpdate(query);
 } catch (SQLException ex) {
 Logger.getLogger(execlaporanpenyakit.class.getName()).log(Level.SEVERE, null, ex);
 }
 conMan.logOff();

 return hasil;
 }

 public int deletelaporanpenyakit(String delid){
 int hasil = 0;
 String query = "delete from laporan_penyakit where id_laporan_penyakit='"+ delid+"'";
 ConnectionManager conMan = new ConnectionManager();
 Connection conn = conMan.logOn();
 try {
 Statement stm = conn.createStatement();
 hasil = stm.executeUpdate(query);
 } catch (SQLException ex) {
 Logger.getLogger(execlaporanpenyakit.class.getName()).log(Level.SEVERE, null, ex);
 }
 conMan.logOff();
 return hasil;
 }

 public int updatelaporanpenyakit (laporanpenyakit newlaporanpenyakit){
 int hasil = 0;
 String query = "update laporan_penyakit set ktp='"+newlaporanpenyakit.getktp()+"'"
         + ",id_dokter='"+newlaporanpenyakit.getid_dokter()+"'"
         + ",penyait_pasien='"+newlaporanpenyakit.getpenyakit_pasien()+"'"
         +",obat='"+
 newlaporanpenyakit.getobat()+"' where id_laporan_penyakit = '"+
 newlaporanpenyakit.getid_laporan_penyakit()+ "'";
 ConnectionManager conMan = new ConnectionManager();
 Connection conn = conMan.logOn();
 try {
 Statement stm = conn.createStatement();
 hasil = stm.executeUpdate(query);
 } catch (SQLException ex) {
 Logger.getLogger(execlaporanpenyakit.class.getName()).log(Level.SEVERE, null, ex);
 }
 conMan.logOff();
 return hasil;
 }
}