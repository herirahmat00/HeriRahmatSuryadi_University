package com.northwind;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;

public class Mahasiswa extends Biodata {
    private String nikMahasiswa;
    private LocalDate tglMasukUniversitas;
    private LinkedList<MatkulMahasiswa> matkulMahasiswa;

    public Mahasiswa(String namaDepan, String namaBelakang, LocalDate tglLahir,
                     String kotaLahir, String jenisKelamin, String noKTP, Agama agama,
                     GolonganDarah golonganDarah, String nikMahasiswa, LocalDate tglMasukUniversitas,
                     LinkedList<MatkulMahasiswa> matkulMahasiswa) {
        super(namaDepan, namaBelakang, kotaLahir, tglLahir, jenisKelamin, noKTP, agama, golonganDarah);
        this.nikMahasiswa = nikMahasiswa;
        this.tglMasukUniversitas = tglMasukUniversitas;
    }

    public String getNikMahasiswa() {
        return nikMahasiswa;
    }
    public void setNikMahasiswa(String nikMahasiswa) {
        this.nikMahasiswa = nikMahasiswa;
    }
    public LocalDate getTglMasukUniversitas() {
        return tglMasukUniversitas;
    }
    public void setTglMasukUniversitas(LocalDate tglMasukUniversitas) {
        this.tglMasukUniversitas = tglMasukUniversitas;
    }
    public LinkedList<MatkulMahasiswa> getMatkulMahasiswa() {
        return matkulMahasiswa;
    }
    public void setMatkulMahasiswa(LinkedList<MatkulMahasiswa> matkulMahasiswa) {
        this.matkulMahasiswa = matkulMahasiswa;
    }

    public String getDurasiBelajar(){
        long tahun = ChronoUnit.YEARS.between(this.tglMasukUniversitas, LocalDate.now());
        long bulan = ChronoUnit.MONTHS.between(this.tglMasukUniversitas, LocalDate.now())%12;
        long hari = ChronoUnit.DAYS.between(this.tglMasukUniversitas, LocalDate.now())%30;
        String hasil = String.format("%s tahun, %s bulan, %s hari", tahun, bulan, hari);
        return hasil;
    }

    public void allInfoMahasiswa(){
        System.out.printf("Nama Depan : %s\n" +
                        "Nama Belakang : %s\n" +
                        "Jenis Kelamin : %s\n" +
                        "Tempat Tanggal Lahir : %s %s (%s tahun)\n" +
                        "Agama : %s\n" +
                        "Golongan Darah : %s\n" +
                        "Nomor KTP : %s\n" +
                        "Tanggal Masuk (Durasi) : %s (%s)\n",
                this.getNamaDepan(), this.getNamaBelakang(), this.getJenisKelamin(),
                this.getKotaLahir(), this.tanggalLahir(), this.getUmur(),this.getAgama(),this.getGolonganDarah(),
                this.getNoKTP(), this.tglMasukUniversitas, getDurasiBelajar());
        System.out.println("Enrollment Information:");


    }



}
