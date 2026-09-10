package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    ArrayList<Hewan> daftarHewan = new ArrayList<>();
    ArrayList<Penitipan> daftarPenitipan = new ArrayList<>();
    
    Scanner scanner;
    
    public Service(Scanner scanner){
        this.daftarHewan = new ArrayList<>();
        this.daftarPenitipan = new ArrayList<>();
        this.scanner = scanner;
    }
    
    public void tambahHewan(){
        System.out.print("ID Hewan: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Nama Hewan: ");
        String nama = scanner.nextLine();
        
        System.out.print("Jenis Hewan: ");
        String jenis = scanner.nextLine();
        
        Hewan hewanBaru = new Hewan(id, nama, jenis);
        
        daftarHewan.add(hewanBaru);
        
        System.out.println(">> Hewan berhasil ditambahkan!");
    }
    
    public void tampilkanHewan(){
        for (int i = 0; i < daftarHewan.size(); i++){
            Hewan h = daftarHewan.get(i);
            
            System.out.println("ID Hewan:" + h.idHewan);
            System.out.println("Nama Hewan:" + h.namaHewan);
            System.out.println("Jenis Hewan:" + h.jenisHewan);
            System.out.println("----------------------------");
        }
    }
    
    public void hapusHewan(){
        System.out.print("Masukan ID Hewan: ");
        int idTarget = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < daftarHewan.size(); i++){
            if (daftarHewan.get(i).idHewan == idTarget){
                daftarHewan.remove(i);
                
                System.out.println(">> Hewan berhasil dihapus!");
                return;
            }
        }
        System.out.println(">> Hewan tidak ditemukan!");
    }
    
    public void updateHewan(){
        System.out.print("Masukan ID Hewan: ");
        int idTarget = scanner.nextInt();
        scanner.nextLine();
        
        for (Hewan h : daftarHewan){
            if (h.idHewan == idTarget){
                
                System.out.print("Nama Hewan Baru: ");
                h.namaHewan = scanner.nextLine();
                
                System.out.print("Jenis Hewan Baru: ");
                h.jenisHewan = scanner.nextLine();
                
                System.out.println(">> Data hewan berhasil diperbarui!");
                return;
            }
        }
        System.out.println(">> Hewan tidak ditemukan!");
    }
    
    public void tambahPenitipan(){
        System.out.print("ID Penitipan: ");
        int idPenitipan = scanner.nextInt();
        
        System.out.print("ID Hewan: ");
        int idHewan = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Tanggal Masuk: ");
        String tanggalMasuk = scanner.nextLine();
        
        System.out.print("Lama Penitipan (hari): ");
        int lamaPenitipan = scanner.nextInt();
        
        Penitipan penitipanBaru = new Penitipan(
        idPenitipan,
        idHewan,
        tanggalMasuk,
        lamaPenitipan
        );
        daftarPenitipan.add(penitipanBaru);
        
        System.out.println(">> Data penitipan berhasil ditambahkan!");
    }
    public void tampilkanPenitipan(){
        for (int i = 0; i < daftarPenitipan.size(); i++){
            Penitipan p = daftarPenitipan.get(i);
            
            System.out.println("ID Penitipan: " + p.idPenitipan);
            System.out.println("ID Hewan: " + p.idHewan);
            System.out.println("Tanggal Masuk: " + p.tanggalMasuk);
            System.out.println("Lama Penitipan: " + p.lamaPenitipan + "hari");
            System.out.println("-----------------------------------------------");
            
        }
    }
    public void hapusPenitipan(){
        System.out.print("Masukan ID Penitipan: ");
        int idTarget = scanner.nextInt();
        
        for (int i = 0; i < daftarPenitipan.size(); i++){
            if (daftarPenitipan.get(i).idPenitipan == idTarget){
                daftarPenitipan.remove(i);
                
                System.out.println(">> Data penitipan berhasil dihapus!");
                return;
            }
        }
        
        System.out.println(">> Data penitipan tidak ditemukan!");
    }
    
    public void updatePenitipan(){
        System.out.print("Masukkan ID Penitipan: ");
        int idTarget = scanner.nextInt();
        scanner.nextLine();
        
        for (Penitipan p : daftarPenitipan){
            if (p.idPenitipan == idTarget){
                
                System.out.print("Tanggal Masuk Baru: ");
                p.tanggalMasuk = scanner.nextLine();
                
                System.out.print("Lama Penitipan Baru: ");
                p.lamaPenitipan = scanner.nextInt();
                
                System.out.println(">> Data penitipan berhasil diperbarui!");
                return;
            }
        }
        System.out.println(">> Data penitipan tidak ditemukan!");
    }  
    
    public void cariHewan() {
    System.out.print("Masukkan ID Hewan yang dicari: ");
    int idTarget = scanner.nextInt();

    for (Hewan h : daftarHewan) {
        if (h.idHewan == idTarget) {
            System.out.println("=== DATA HEWAN DITEMUKAN ===");
            System.out.println("ID Hewan: " + h.idHewan);
            System.out.println("Nama Hewan: " + h.namaHewan);
            System.out.println("Jenis Hewan: " + h.jenisHewan);
            return;
        }
    }

    System.out.println(">> Hewan tidak ditemukan!");
}
}
