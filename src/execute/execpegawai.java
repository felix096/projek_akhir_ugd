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
import entity.pegawai;
/**
 *
 * @author Hafizh
 */
public class execpegawai {
    public List<pegawai> getpegawai(){
 List<pegawai> listpegawai = new ArrayList<>();
 String query = "select * from pegawai";
 ConnectionManager conMan = new ConnectionManager();
 Connection conn = conMan.logOn();
 try {
 Statement stm = conn.createStatement();
 ResultSet rs = stm.executeQuery(query);
 while(rs.next()){
 pegawai pegawai = new pegawai();
 pegawai.setid_pegawai(rs.getString("id_pegawai"));
 pegawai.setnama_pegawai(rs.getString("nama_pegawai"));
 pegawai.setalamat_pegawai(rs.getString("alamat_pegawai"));
 pegawai.setttl_pegawai(rs.getString("ttl_pegawai"));
 pegawai.setnohp_pegawai(rs.getString("nohp_pegawai"));
 listpegawai.add(pegawai);
 }
 } catch (SQLException ex) {
 Logger.getLogger(execpegawai.class.getName()).log(Level.SEVERE, null, ex);
 }
 conMan.logOff();
 return listpegawai;
 }

 public int insertpegawai(pegawai pegawai){
 int hasil = 0;
 String query = "Insert into pegawai(id_pegawai, nama_pegawai, alamat_pegawai, ttl_pegawai, nohp_pegawai)"
 + "value('"+ pegawai.getid_pegawai()+"','"
 +pegawai.getnama_pegawai()+"','"
 +pegawai.getalamat_pegawai()+"','"
 +pegawai.getttl_pegawai()+"','"        
 +pegawai.getnohp_pegawai()+"')";
 ConnectionManager conMan = new ConnectionManager();
 Connection conn = conMan.logOn();
 try {
 Statement stm = conn.createStatement();
 hasil = stm.executeUpdate(query);
 } catch (SQLException ex) {
 Logger.getLogger(execpegawai.class.getName()).log(Level.SEVERE, null, ex);
 }
 conMan.logOff();

 return hasil;
 }

 public int deletepegawai(String delid){
 int hasil = 0;
 String query = "delete from pegawai where id_pegawai='"+ delid+"'";
 ConnectionManager conMan = new ConnectionManager();
 Connection conn = conMan.logOn();
 try {
 Statement stm = conn.createStatement();
 hasil = stm.executeUpdate(query);
 } catch (SQLException ex) {
 Logger.getLogger(execpegawai.class.getName()).log(Level.SEVERE, null, ex);
 }
 conMan.logOff();
 return hasil;
 }

 public int updatepegawai (pegawai newpegawai){
 int hasil = 0;
 String query = "update pegawai set nama_pegawai='"+newpegawai.getnama_pegawai()+"'"
         + ",alamat_pegawai='"+newpegawai.getalamat_pegawai()+"'"
         + ",ttl_pegawai='"+newpegawai.getttl_pegawai()+"'"
         +",nohp_pegawai='"+
 newpegawai.getnohp_pegawai() +"' where id_pegawai = '"+
 newpegawai.getid_pegawai() + "'";
 ConnectionManager conMan = new ConnectionManager();
 Connection conn = conMan.logOn();
 try {
 Statement stm = conn.createStatement();
 hasil = stm.executeUpdate(query);
 } catch (SQLException ex) {
 Logger.getLogger(execpegawai.class.getName()).log(Level.SEVERE, null, ex);
 }
 conMan.logOff();
 return hasil;
 }
}
