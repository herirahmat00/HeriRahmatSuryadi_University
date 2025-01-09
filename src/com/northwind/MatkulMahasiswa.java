package com.northwind;

import java.time.LocalDate;

public class MatkulMahasiswa {
    private MataKuliah mataKuliah;
    private LocalDate tglMulaiBelajar;
    private LocalDate tglAkhirBelajar;

    public MatkulMahasiswa(MataKuliah mataKuliah, LocalDate tglMulaiBelajar, LocalDate tglAkhirBelajar) {
        this.mataKuliah = mataKuliah;
        this.tglMulaiBelajar = tglMulaiBelajar;
        this.tglAkhirBelajar = tglAkhirBelajar;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }
    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    public LocalDate getTglMulaiBelajar() {
        return tglMulaiBelajar;
    }
    public void setTglMulaiBelajar(LocalDate tglMulaiBelajar) {
        this.tglMulaiBelajar = tglMulaiBelajar;
    }
    public LocalDate getTglAkhirBelajar() {
        return tglAkhirBelajar;
    }
    public void setTglAkhirBelajar(LocalDate tglAkhirBelajar) {
        this.tglAkhirBelajar = tglAkhirBelajar;
    }
}
