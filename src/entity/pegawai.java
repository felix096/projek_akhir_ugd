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
public class pegawai {
    private String id_pegawai;
    private String nama_pegawai;
    private String ttl_pegawai;
    private String nohp_pegawai;
    private String alamat_pegawai;

    public pegawai() {
    }

    public pegawai(String id_pegawai, String nama_pegawai, String ttl_pegawai, 
            String nohp_pegawai, String alamat_pegawai) {
        this.id_pegawai = id_pegawai;
        this.nama_pegawai = nama_pegawai;
        this.ttl_pegawai = ttl_pegawai;
        this.nohp_pegawai = nohp_pegawai;
        this.alamat_pegawai = alamat_pegawai;
    }
    public String getid_pegawai() {
        return id_pegawai;
    }
    public void setid_pegawai(String id_pegawai) {
        this.id_pegawai = id_pegawai;
    }
    public String getnama_pegawai() {
        return nama_pegawai;
    }
    public void setnama_pegawai(String nama_pegawai) {
        this.nama_pegawai = nama_pegawai;
    }
    public String getttl_pegawai() {
        return ttl_pegawai;
    }
    public void setttl_pegawai(String ttl_pegawai) {
        this.ttl_pegawai = ttl_pegawai;
    }
    public String getnohp_pegawai() {
        return nohp_pegawai;
    }
    public void setnohp_pegawai(String nohp_pegawai) {
        this.nohp_pegawai = nohp_pegawai;
    }
    public String getalamat_pegawai() {
        return alamat_pegawai;
    }
    public void setalamat_pegawai(String alamat_pegawai) {
        this.alamat_pegawai = alamat_pegawai;
    }
    @Override
    public String toString() {
        return "pegawai{" + "id_pegawai=" + id_pegawai + ", nama_pegawai=" + nama_pegawai + ", ttl_pegawai=" + ttl_pegawai + ", nohp_pegawai=" + nohp_pegawai + ", alamat_pegawai=" + alamat_pegawai + '}';
    }        
}
