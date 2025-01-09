package com.northwind;

public class MataKuliah {
    private String namaMataKuliah;
    private String namaPenjurusan;
    private Integer poin;

    public MataKuliah(String namaMataKuliah, String namaPenjurusan, Integer poin) {
        this.namaMataKuliah = namaMataKuliah;
        this.namaPenjurusan = namaPenjurusan;
        this.poin = poin;
    }

    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }
    public void setNamaMataKuliah(String namaMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
    }
    public String getNamaPenjurusan() {
        return namaPenjurusan;
    }
    public void setNamaPenjurusan(String namaPenjurusan) {
        this.namaPenjurusan = namaPenjurusan;
    }
    public Integer getPoin() {
        return poin;
    }
    public void setPoin(Integer poin) {
        this.poin = poin;
    }


}
