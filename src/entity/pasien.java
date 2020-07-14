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
public class pasien {
    private String ktp;
    private String nama_pasien;
    private String alamat_pasien;
    private String nohp_pasien;
    private String ttl_pasien;
    private String gejala_pasien;

    public pasien() {
    }
    public pasien(String ktp, String nama_pasien, String alamat_pasien, 
            String nohp_pasien, String ttl_pasien, String gejala_pasien) {
        this.ktp = ktp;
        this.nama_pasien = nama_pasien;
        this.alamat_pasien = alamat_pasien;
        this.nohp_pasien = nohp_pasien;
        this.ttl_pasien = ttl_pasien;
        this.gejala_pasien = gejala_pasien;
    }
    public String getktp() {
        return ktp;
    }
    public void setktp(String ktp) {
        this.ktp = ktp;
    }
    public String getnama_pasien() {
        return nama_pasien;
    }
    public void setnama_pasien(String nama_pasien) {
        this.nama_pasien = nama_pasien;
    }
    public String getalamat_pasien() {
        return alamat_pasien;
    }
    public void setalamat_pasien(String alamat_pasien) {
        this.alamat_pasien = alamat_pasien;
    }
    public String getnohp_pasien() {
        return nohp_pasien;
    }
    public void setnohp_pasien(String nohp_pasien) {
        this.nohp_pasien = nohp_pasien;
    }
    public String getttl_pasien() {
        return ttl_pasien;
    }
    public void setttl_pasien(String ttl_pasien) {
        this.ttl_pasien = ttl_pasien;
    }
    public String getgejala_pasien() {
        return gejala_pasien;
    }
    public void setgejala_pasien(String gejala_pasien) {
        this.gejala_pasien = gejala_pasien;
    }
    @Override
    public String toString() {
        return "pasien{" + "ktp=" + ktp + ", nama_pasien=" + nama_pasien + ", alamat_pasien=" + alamat_pasien + ", nohp_pasien=" + nohp_pasien + ", ttl_pasien=" + ttl_pasien + ", gejala_pasien=" + gejala_pasien + '}';
    }      
}
