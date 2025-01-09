package com.northwind;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Biodata {
    private String namaDepan;
    private String namaBelakang;
    private String kotaLahir;
    private LocalDate tglLahir;
    private String jenisKelamin;
    private String noKTP;
    private Agama agama;
    private GolonganDarah golonganDarah;

    public Biodata(String namaDepan, String namaBelakang,
                   String kotaLahir, LocalDate tglLahir,
                   String jenisKelamin, String noKTP, Agama agama,
                   GolonganDarah golonganDarah) {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.kotaLahir = kotaLahir;
        this.tglLahir = tglLahir;
        this.jenisKelamin = jenisKelamin;
        this.noKTP = noKTP;
        this.agama = agama;
        this.golonganDarah = golonganDarah;
    }

    public String getNamaDepan() {
        return namaDepan;
    }
    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }
    public String getNamaBelakang() {
        return namaBelakang;
    }
    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }
    public LocalDate getTglLahir() {
        return tglLahir;
    }
    public void setTglLahir(LocalDate tglLahir) {
        this.tglLahir = tglLahir;
    }
    public String getKotaLahir() {
        return kotaLahir;
    }
    public void setKotaLahir(String kotaLahir) {
        this.kotaLahir = kotaLahir;
    }
    public String getJenisKelamin() {
        return jenisKelamin;
    }
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public String getNoKTP() {
        return noKTP;
    }
    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }
    public Agama getAgama() {
        return agama;
    }
    public void setAgama(Agama agama) {
        this.agama = agama;
    }
    public GolonganDarah getGolonganDarah() {
        return golonganDarah;
    }
    public void setGolonganDarah(GolonganDarah golonganDarah) {
        this.golonganDarah = golonganDarah;
    }

    public long getUmur(){
        return ChronoUnit.YEARS.between(this.tglLahir, LocalDate.now());
    }

    public String tanggalLahir() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String tanggalLahir = tglLahir.format(formatter);
        return tanggalLahir;
    }



}
