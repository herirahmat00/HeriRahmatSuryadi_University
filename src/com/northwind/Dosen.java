package com.northwind;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;

public class Dosen extends Biodata {
    private String nikStaff;
    private Double gaji;
    private LocalDate tglMulaiKerja;
    private LinkedList<MataKuliah> matkul;

    public Dosen(String namaDepan, String namaBelakang, LocalDate tglLahir,
                 String kotaLahir, String jenisKelamin, String noKTP, Agama agama,
                 GolonganDarah golonganDarah, String nikStaff, Double gaji, LocalDate tglMulaiKerja,
                 LinkedList<MataKuliah> matkul) {
        super(namaDepan, namaBelakang, kotaLahir,tglLahir, jenisKelamin, noKTP, agama, golonganDarah);
        this.nikStaff = nikStaff;
        this.gaji = gaji;
        this.tglMulaiKerja = tglMulaiKerja;
    }

    public String getNikStaff() {
        return nikStaff;
    }
    public void setNikStaff(String nikStaff) {
        this.nikStaff = nikStaff;
    }
    public Double getGaji() {
        return gaji;
    }
    public void setGaji(Double gaji) {
        this.gaji = gaji;
    }
    public LocalDate getTglMulaiKerja() {
        return tglMulaiKerja;
    }
    public void setTglMulaiKerja(LocalDate tglMulaiKerja) {
        this.tglMulaiKerja = tglMulaiKerja;
    }
    public LinkedList<MataKuliah> getMatkul() {
        return matkul;
    }
    public void setMatkul(LinkedList<MataKuliah> matkul) {
        this.matkul = matkul;
    }

    public String getDurasiKerja(){
        long tahun = ChronoUnit.YEARS.between(this.tglMulaiKerja, LocalDate.now());
        long bulan = ChronoUnit.MONTHS.between(this.tglMulaiKerja, LocalDate.now())%12;
        long hari = ChronoUnit.DAYS.between(this.tglMulaiKerja, LocalDate.now())%30;
        String hasil = String.format("%s tahun, %s bulan, %s hari", tahun, bulan, hari);
        return hasil;
    }


    public void allInfoDosen(){
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
                this.getNoKTP(), this.tglMulaiKerja, getDurasiKerja());
        System.out.println("Enrollment Information:");
    }

}
