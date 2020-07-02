/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author X
 */
public class Pembayaran_Spp_90492 {
    private Integer Id_Spp;
    private Mahasiswa_90492 Mahasiswa;
    private Bank_90492 Bank;
    private Date Tanggal_Spp;
    private Integer Bulan_Spp;
    private Integer NPM90492_Nominal_Spp;
    private Integer Denda_Spp;
    private String Konfirmasi_Pembayaran_Spp;
    
    public void setId_Spp(Integer Id_Spp){
        this.Id_Spp=Id_Spp;
    }
    public Integer getId_Spp(){
        return Id_Spp;
    }
    public void setMahasiswa(Mahasiswa_90492 Mahasiswa){
        this.Mahasiswa=Mahasiswa;
    }
    public Mahasiswa_90492 getMahasiswa(){
        return Mahasiswa;
    }
    public void setBank(Bank_90492 Bank){
        this.Bank=Bank;
    }
    public Bank_90492 getBank(){
        return Bank;
    }
    public void setTanggal_Spp(Date Tanggal_Spp){
        this.Tanggal_Spp=Tanggal_Spp;
    }
    public Date getTanggal_Spp(){
        return Tanggal_Spp;
    }
    public void setBulan_Spp(Integer Bulan_Spp){
        this.Bulan_Spp=Bulan_Spp;
    }
    public Integer getBulan_Spp(){
        return Bulan_Spp;
    }
    public void setNominal_Spp(Integer NPM90492_Nominal_Spp){
        this.NPM90492_Nominal_Spp=NPM90492_Nominal_Spp;
    }
    public Integer getNominal_Spp(){
        return NPM90492_Nominal_Spp;
    }
    public void setDenda_Spp(Integer Denda_Spp){
        this.Denda_Spp=Denda_Spp;
    }
    public Integer getDenda_Spp(){
        return Denda_Spp;
    }
    public void setKonfirmasi(String Konfirmasi_Pembayaran_Spp){
        this.Konfirmasi_Pembayaran_Spp=Konfirmasi_Pembayaran_Spp;
    }
    public String getKonfirmasi(){
        return Konfirmasi_Pembayaran_Spp;
    }
}
