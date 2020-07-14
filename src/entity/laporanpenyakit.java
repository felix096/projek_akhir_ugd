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
public class laporanpenyakit {
    private String id_laporan_penyakit;
    private String ktp;
    private String id_dokter;
    private String penyakit_pasien;
    private String obat;

    public laporanpenyakit() {
    }

    public laporanpenyakit(String id_laporan_penyakit, String ktp, String id_dokter, String penyakit_pasien, String obat) {
        this.id_laporan_penyakit = id_laporan_penyakit;
        this.ktp = ktp;
        this.id_dokter = id_dokter;
        this.penyakit_pasien = penyakit_pasien;
        this.obat = obat;
    }

    public String getid_laporan_penyakit() {
        return id_laporan_penyakit;
    }

    public void setid_laporan_penyakit(String id_laporan_penyakit) {
        this.id_laporan_penyakit = id_laporan_penyakit;
    }

    public String getktp() {
        return ktp;
    }

    public void setktp(String ktp) {
        this.ktp = ktp;
    }

    public String getid_dokter() {
        return id_dokter;
    }

    public void setid_dokter(String id_dokter) {
        this.id_dokter = id_dokter;
    }

    public String getpenyakit_pasien() {
        return penyakit_pasien;
    }

    public void setpenyakit_pasien(String penyakit_pasien) {
        this.penyakit_pasien = penyakit_pasien;
    }

    public String getobat() {
        return obat;
    }

    public void setobat(String obat) {
        this.obat = obat;
    }

    @Override
    public String toString() {
        return "laporanpenyakit{" + "id_laporan_penyakit=" + id_laporan_penyakit + ", ktp=" + ktp + ", id_dokter=" + id_dokter + ", penyakit_pasien=" + penyakit_pasien + ", obat=" + obat + '}';
    }
    
    
}
