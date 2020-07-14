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
import entity.pelaporanugd;

/**
 *
 * @author Hafizh
 */
public class execpelaporanugd {
     public List<pelaporanugd> getpelaporanugd(){
 List<pelaporanugd> listpelaporanugd = new ArrayList<>();
 String query = "select * from pelaporan_ugd";
 ConnectionManager conMan = new ConnectionManager();
 Connection conn = conMan.logOn();
 try {
 Statement stm = conn.createStatement();
 ResultSet rs = stm.executeQuery(query);
 while(rs.next()){
 pelaporanugd pelaporanugd = new pelaporanugd();
 pelaporanugd.setid_pelaporan(rs.getString("id_pelaporan_ugd"));
 pelaporanugd.setid_laporan_penyakit(rs.getString("id_laporan_penyakit"));
 pelaporanugd.setid_pegawai(rs.getString("id_pegawai"));
 pelaporanugd.settanggal_pelaporan(rs.getString("tanggal_pelaporan"));
 pelaporanugd.setstatus(rs.getString("status"));
 
 listpelaporanugd.add(pelaporanugd);
 }
 } catch (SQLException ex) {
 Logger.getLogger(execpelaporanugd.class.getName()).log(Level.SEVERE, null, ex);
 }
 conMan.logOff();
 return listpelaporanugd;
 }

 public int insertpelaporanugd(pelaporanugd pelaporanugd){
 int hasil = 0;
 String query = "Insert into pelaporan_ugd(id_pelaporan_ugd, id_laporan_penyakit, id_pegawai, tanggal_pelaporan, status)"
 + "value('"+ pelaporanugd.getid_pelaporan()+"','"
 +pelaporanugd.getid_laporan_penyakit()+"','"              
 +pelaporanugd.getid_pegawai()+"','"              
 +pelaporanugd.gettanggal_pelaporan()+"','"              
 +pelaporanugd.getstatus()+"')";
 ConnectionManager conMan = new ConnectionManager();
 Connection conn = conMan.logOn();
 try {
 Statement stm = conn.createStatement();
 hasil = stm.executeUpdate(query);
 } catch (SQLException ex) {
 Logger.getLogger(execpelaporanugd.class.getName()).log(Level.SEVERE, null, ex);
 }
 conMan.logOff();

 return hasil;
 }

 public int deletepelaporanugd(String delid){
 int hasil = 0;
 String query = "delete from pelaporan_ugd where id_pelaporan_ugd='"+ delid+"'";
 ConnectionManager conMan = new ConnectionManager();
 Connection conn = conMan.logOn();
 try {
 Statement stm = conn.createStatement();
 hasil = stm.executeUpdate(query);
 } catch (SQLException ex) {
 Logger.getLogger(execpelaporanugd.class.getName()).log(Level.SEVERE, null, ex);
 }
 conMan.logOff();
 return hasil;
 }

 public int updatepelaporanugd (pelaporanugd newpelaporanugd){
 int hasil = 0;
 String query = "update pelaporan_ugd set id_laporan_penyakit='"+newpelaporanugd.getid_laporan_penyakit()+"'"
         + ",id_pegawai='"+newpelaporanugd.getid_pegawai()+"'"
         + ",tanggal_pelaporan='"+newpelaporanugd.gettanggal_pelaporan()+"'"
         +",status='"+
 newpelaporanugd.getstatus()+"' where id_pelaporan_ugd = '"+
 newpelaporanugd.getid_pelaporan()+ "'";
 ConnectionManager conMan = new ConnectionManager();
 Connection conn = conMan.logOn();
 try {
 Statement stm = conn.createStatement();
 hasil = stm.executeUpdate(query);
 } catch (SQLException ex) {
 Logger.getLogger(execpelaporanugd.class.getName()).log(Level.SEVERE, null, ex);
 }
 conMan.logOff();
 return hasil;
 }
}
