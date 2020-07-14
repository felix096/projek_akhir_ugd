/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Hafizh
 */
public class dokter {
    private String id_dokter;
    private String nama_dokter;
    private String alamat_dokter;
    private String ttl_dokter;
    private String nohp_dokter;

    public dokter() {
    }
    public dokter(String id_dokter, String nama_dokter, String alamat_dokter, 
            String ttl_dokter, String nohp_dokter) {
        this.id_dokter = id_dokter;
        this.nama_dokter = nama_dokter;
        this.alamat_dokter = alamat_dokter;
        this.ttl_dokter = ttl_dokter;
        this.nohp_dokter = nohp_dokter;
    }
    public String getid_dokter() {
        return id_dokter;
    }
    public void setid_dokter(String id_dokter) {
        this.id_dokter = id_dokter;
    }
    public String getnama_dokter() {
        return nama_dokter;
    }
    public void setnama_dokter(String nama_dokter) {
        this.nama_dokter = nama_dokter;
    }
    public String getalamat_dokter() {
        return alamat_dokter;
    }
    public void setalamat_dokter(String alamat_dokter) {
        this.alamat_dokter = alamat_dokter;
    }
    public String getttl_dokter() {
        return ttl_dokter;
    }
    public void setttl_dokter(String ttl_dokter) {
        this.ttl_dokter = ttl_dokter;
    }
    public String getnohp_dokter() {
        return nohp_dokter;
    }
    public void setnohp_dokter(String nohp_dokter) {
        this.nohp_dokter = nohp_dokter;
    }
    @Override
    public String toString() {
        return "dokter{" + "id_dokter=" + id_dokter + ", nama_dokter=" + nama_dokter + ", "
                + "alamat_dokter=" + alamat_dokter + ", ttl_dokter=" + ttl_dokter + ", "
                + "nohp_dokter=" + nohp_dokter + '}';
    } 
}
