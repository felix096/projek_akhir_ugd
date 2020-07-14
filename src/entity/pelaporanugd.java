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
public class pelaporanugd {
    private String id_pelaporan;
    private String id_laporan_penyakit;
    private String id_pegawai;
    private String tanggal_pelaporan;
    private String status;

    public pelaporanugd() {
    }

    public pelaporanugd(String id_pelaporan, String id_laporan_penyakit, String id_pegawai, String tanggal_pelaporan, String status) {
        this.id_pelaporan = id_pelaporan;
        this.id_laporan_penyakit = id_laporan_penyakit;
        this.id_pegawai = id_pegawai;
        this.tanggal_pelaporan = tanggal_pelaporan;
        this.status = status;
    }

    public String getid_pelaporan() {
        return id_pelaporan;
    }

    public void setid_pelaporan(String id_pelaporan) {
        this.id_pelaporan = id_pelaporan;
    }

    public String getid_laporan_penyakit() {
        return id_laporan_penyakit;
    }

    public void setid_laporan_penyakit(String id_laporan_penyakit) {
        this.id_laporan_penyakit = id_laporan_penyakit;
    }

    public String getid_pegawai() {
        return id_pegawai;
    }

    public void setid_pegawai(String id_pegawai) {
        this.id_pegawai = id_pegawai;
    }

    public String gettanggal_pelaporan() {
        return tanggal_pelaporan;
    }

    public void settanggal_pelaporan(String tanggal_pelaporan) {
        this.tanggal_pelaporan = tanggal_pelaporan;
    }

    public String getstatus() {
        return status;
    }

    public void setstatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "pelaporanugd{" + "id_pelaporan=" + id_pelaporan + ", id_laporan_penyakit=" + id_laporan_penyakit + ", id_pegawai=" + id_pegawai + ", tanggal_pelaporan=" + tanggal_pelaporan + ", status=" + status + '}';
    }
    
}
