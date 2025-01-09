package com.northwind;

import java.lang.invoke.MethodHandle;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Universitas kampus = new Universitas();

        //Masukkan Daftar Mata kuliah
        HashMap<String, MataKuliah> matkul = kumpulanMataKuliah();

        //Biodata Mahasiswa
        LinkedList<Mahasiswa> mahasiswa = kumpulanMahasiswa(matkul);

        //BiodataDosen
        LinkedList<Dosen> dosen = new LinkedList<Dosen>();
        LinkedList<MataKuliah> dosenAntik = new LinkedList<MataKuliah>();
        dosenAntik.add(matkul.get("Infrastructure Design"));
        dosenAntik.add(matkul.get("Network Security in Networking"));
        Dosen antik = new Dosen("Antik", "Haya",LocalDate.of(1988,Month.NOVEMBER, 12),
                "Jakarta","Perempuan","312008912111988002",Agama.ISLAM,GolonganDarah.A,
                "T701", 6500000.0, LocalDate.of(2016,Month.MARCH,8), dosenAntik);
        dosen.add(antik);

        LinkedList<MataKuliah> dosenCahya = new LinkedList<MataKuliah>();
        dosenCahya.add(matkul.get("Object Oriented Programming"));
        dosenCahya.add(matkul.get("Java Fundamental,"));
        dosenCahya.add(matkul.get("Database Fundamental"));
        Dosen cahya = new Dosen("Cahya", "Subroto",LocalDate.of(1989,Month.JANUARY, 07),
                "Surabaya","Laki-Laki","312008907011989002",Agama.ISLAM,GolonganDarah.B,
                "T808", 8800000.0, LocalDate.of(2016,Month.APRIL,4), dosenCahya);
        dosen.add(cahya);



        while (true) {
            String menu = "Pilih nomor menu untuk masuk ke menunya:\n" +
                    "1. All Student Data\n" +
                    "2. All Tutor Data\n" +
                    "3. About this University\n" +
                    "4. Exit Application";
            int inputMenu = validasi(menu, scanner, 4);

            switch (inputMenu) {
                case 1: {
                    while (true) {
                        for (Mahasiswa datamahasiswa : mahasiswa) {
                            System.out.printf("NIK: %s, Nama: %s\n", datamahasiswa.getNikMahasiswa(), datamahasiswa.getNamaDepan() + " " + datamahasiswa.getNamaBelakang());
                        }
                        String opsi = "Pilih nomor menu untuk masuk ke menunya:\n" +
                                "1. Student Information\n" +
                                "2. Back to Main Menu\n" +
                                "3. Exit Application";
                        int inputOpsi = validasi(opsi, scanner, 3);

                        switch (inputMenu) {
                            case 1: {

                                
                            }
                            case 2: {

                            }
                            break;
                            case 3: {
                                System.exit(0);
                            }
                            break;
                            default:
                                System.out.println("Inputan anda Salah");
                                break;
                        }
                    }
                }
                case 2: {

                }
                break;
                case 3: {
                    kampus.detailUniversitas();
                }
                break;
                case 4: {
                    System.exit(0);
                }
                break;
                default:
                    System.out.println("Inputan anda Salah");
                    break;
            }
        }
    }

    public static LinkedList<Mahasiswa> kumpulanMahasiswa (HashMap<String, MataKuliah> matkul){
        LinkedList<Mahasiswa> mahasiswas = new LinkedList<Mahasiswa>();

        LinkedList<MatkulMahasiswa> matkulAlex = new LinkedList<MatkulMahasiswa>();
        matkulAlex.add(new MatkulMahasiswa(matkul.get("Object Oriented Programming"),
                LocalDate.of(2018, 4, 12),
                LocalDate.of(2018, 9, 12))
        );
        matkulAlex.add(new MatkulMahasiswa(matkul.get("Data Structure"),
                LocalDate.of(2018, 8, 18),
                null));
        Mahasiswa alex = new Mahasiswa("Alex","Wirianata",
                LocalDate.of(1990, Month.NOVEMBER,23),"Jakarta",
                "Laki-Laki","312008923111990002", Agama.KRISTEN, GolonganDarah.A,
                "A021", LocalDate.of(2018, Month.APRIL,12),matkulAlex);
        mahasiswas.add(alex);

        LinkedList<MatkulMahasiswa> matkulDesi = new LinkedList<MatkulMahasiswa>();
        matkulDesi.add(new MatkulMahasiswa(matkul.get("Networking Fundamental"),
                LocalDate.of(2018, 4, 1),
                null));
        matkulDesi.add(new MatkulMahasiswa(matkul.get("Data Structure"),
                LocalDate.of(2018, 8, 18),
                null));
        Mahasiswa desi = new Mahasiswa("Desi","Oktaviani",
                LocalDate.of(1995, Month.MAY,11),"Bandung",
                "Perempuan","312008911051995002", Agama.ISLAM, GolonganDarah.O,
                "A022", LocalDate.of(2018, Month.APRIL,1),matkulDesi);
        mahasiswas.add(desi);

        LinkedList<MatkulMahasiswa> matkulJoko = new LinkedList<MatkulMahasiswa>();
        matkulJoko.add(new MatkulMahasiswa(matkul.get("Unified Modelling Language,"),
                LocalDate.of(2018, 5, 3),
                null));
        Mahasiswa joko = new Mahasiswa("Joko","Davidson",
                LocalDate.of(1990, Month.JUNE,7),"Jakarta",
                "Laki-Laki","3120089277889990002", Agama.ISLAM, GolonganDarah.A,
                "A023", LocalDate.of(2018, Month.APRIL,14), matkulJoko);
        mahasiswas.add(joko);

        return mahasiswas;
    }

    //terima 1 objek dosen dan print semua nama mk kompetensi nya
    public static void printObjekDosen (Dosen dosen){
        for (MataKuliah namaMk : dosen.getMatkul()){

        }
    }




    public static HashMap<String, MataKuliah> kumpulanMataKuliah(){
        HashMap<String, MataKuliah> matkul = new HashMap<String, MataKuliah>();
        matkul.put("Object Oriented Programming",  new MataKuliah("Object Oriented Programming", "Programming", 20));
        matkul.put("Data Structure", new MataKuliah("Data Structure", "Programming", 30));
        matkul.put("Networking Fundamental", new MataKuliah("Networking Fundamental", "Networking", 20));
        matkul.put("Database Fundamental", new MataKuliah("Database Fundamental", "Programming", 30));
        matkul.put("Project Management Professional", new MataKuliah("Project Management Professional", "Management and Analysis", 40));
        matkul.put("Unified Modelling Language", new MataKuliah("Unified Modelling Language", "Management and Analysis", 20));
        matkul.put("Java Fundamental", new MataKuliah("Java Fundamental", "Programming", 30));
        matkul.put("Infrastructure Design", new MataKuliah("Infrastructure Design", "Networking", 30));
        matkul.put("Network and Security", new MataKuliah("Network and Security", "Networking", 20));
        return kumpulanMataKuliah();
    }


    public static int validasi (String message, Scanner scanner, int max){
        System.out.println(message);

        int input;
        while (true){
            try{
                input = Integer.parseInt(scanner.nextLine().trim());
                if (input >= 1 && input <= max ){
                    return input;
                } else {
                    System.out.printf("Masukkan angka 1-%s\n", max);
                }
            } catch (Exception exception){
                System.out.println("Tolong masukkan sebuah angka");
            }
        }
    }
}
