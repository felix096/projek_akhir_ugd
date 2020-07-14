/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import execute.execpegawai;
import execute.execpasien;
import execute.execdokter;
import execute.execlaporanpenyakit;
import execute.execpelaporanugd;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Hafizh
 */
public class convertclasstoobject {
    public String[][] getAllpasien(){
        List<pasien> mycs = new ArrayList<pasien>();
        execpasien ecs = new execpasien();
        mycs = ecs.getpasien();
        String[][] datapasien = new String[mycs.size()][6];
        int i=0;
        for(pasien cs : mycs){
            datapasien[i][0] = cs.getktp();
            datapasien[i][1] = cs.getnama_pasien();
            datapasien[i][2] = cs.getalamat_pasien();
            datapasien[i][3] = cs.getnohp_pasien();
            datapasien[i][4] = cs.getttl_pasien();
            datapasien[i][5] = cs.getgejala_pasien();
            i++;
        }
        return datapasien;
    }
    public String[][] getAlldokter(){
        List<dokter> mycs = new ArrayList<dokter>();
        execdokter ecs = new execdokter();
        mycs = ecs.getdokter();
        String[][] datadokter = new String[mycs.size()][5];
        int i=0;
        for(dokter cs : mycs){
            datadokter[i][0] = cs.getid_dokter();
            datadokter[i][1] = cs.getnama_dokter();
            datadokter[i][2] = cs.getalamat_dokter();
            datadokter[i][3] = cs.getnohp_dokter();
            datadokter[i][4] = cs.getttl_dokter();
            i++;
        }
        return datadokter;
    }
    public String[][] getAllpegawai(){
        List<pegawai> mycs = new ArrayList<pegawai>();
        execpegawai ecs = new execpegawai();
        mycs = ecs.getpegawai();
        String[][] datapegawai = new String[mycs.size()][5];
        int i=0;
        for(pegawai cs : mycs){
            datapegawai[i][0] = cs.getid_pegawai();
            datapegawai[i][1] = cs.getnama_pegawai();
            datapegawai[i][2] = cs.getalamat_pegawai();
            datapegawai[i][3] = cs.getttl_pegawai();
            datapegawai[i][4] = cs.getnohp_pegawai();
            i++;
        }
        return datapegawai;
}
    public String[][] getAlllaporanpenyakit(){
        List<laporanpenyakit> mycs = new ArrayList<laporanpenyakit>();
        execlaporanpenyakit ecs = new execlaporanpenyakit();
        mycs = ecs.getlaporanpenyakit();
        String[][] datalaporanpenyakit = new String[mycs.size()][5];
        int i=0;
        for(laporanpenyakit cs : mycs){
            datalaporanpenyakit[i][0] = cs.getid_laporan_penyakit();
            datalaporanpenyakit[i][1] = cs.getktp();
            datalaporanpenyakit[i][2] = cs.getid_dokter();
            datalaporanpenyakit[i][3] = cs.getpenyakit_pasien();
            datalaporanpenyakit[i][4] = cs.getobat();
            i++;
        }
        return datalaporanpenyakit;
    }
    public String[][] getAllpelaporanugd(){
        List<pelaporanugd> mycs = new ArrayList<pelaporanugd>();
        execpelaporanugd ecs = new execpelaporanugd();
        mycs = ecs.getpelaporanugd();
        String[][] datapelaporanugd = new String[mycs.size()][5];
        int i=0;
        for(pelaporanugd cs : mycs){
            datapelaporanugd[i][0] = cs.getid_pelaporan();
            datapelaporanugd[i][1] = cs.getid_laporan_penyakit();
            datapelaporanugd[i][2] = cs.getid_pegawai();
            datapelaporanugd[i][3] = cs.gettanggal_pelaporan();
            datapelaporanugd[i][4] = cs.getstatus();
            i++;
        }
        return datapelaporanugd;
    }

}
