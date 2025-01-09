package com.northwind;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Universitas {
    private String namaUniversitas = "Unicorn (University of Cornelius)";
    private LocalDate tglBerdiri = LocalDate.of(1978,12,12) ;
    private String negara = "Amerika Serikat";
    private String negaraBagian = "Southern State";
    private String kota = "Texas";

    public Universitas(String namaUniversitas, LocalDate tglBerdiri, String negara, String negaraBagian, String kota) {
        this.namaUniversitas = namaUniversitas;
        this.tglBerdiri = tglBerdiri;
        this.negara = negara;
        this.negaraBagian = negaraBagian;
        this.kota = kota;
    }

    public Universitas(){
    }

    public String getNamaUniversitas() {
        return namaUniversitas;
    }
    public void setNamaUniversitas(String namaUniversitas) {
        this.namaUniversitas = namaUniversitas;
    }
    public LocalDate getTglBerdiri() {
        return tglBerdiri;
    }
    public void setTglBerdiri(LocalDate tglBerdiri) {
        this.tglBerdiri = tglBerdiri;
    }
    public String getNegara() {
        return negara;
    }
    public void setNegara(String negara) {
        this.negara = negara;
    }
    public String getNegaraBagian() {
        return negaraBagian;
    }
    public void setNegaraBagian(String negaraBagian) {
        this.negaraBagian = negaraBagian;
    }
    public String getKota() {
        return kota;
    }
    public void setKota(String kota) {
        this.kota = kota;
    }

    public String tanggal() {
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
       String tglDidirikan = tglBerdiri.format(formatter);
       return tglDidirikan;
    }

    public void detailUniversitas(){
        System.out.printf("Universitas ini bernama %s.\nSudah didirikan sejak %s di %s, %s, di kota %s\n\n",
                this.namaUniversitas, tanggal(), this.negara, this.negaraBagian, this.kota);
    }

}
