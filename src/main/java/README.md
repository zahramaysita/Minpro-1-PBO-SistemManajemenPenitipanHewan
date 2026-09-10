# LAPORAN MINI PROJECT 1 PBO

## SISTEM MANAJEMEN PENITIPAN HEWAN

 Nama : Zahra Maysita 
 
 NIM : 2509116015

 Kelas : A'25


# BAB I PENDAHULUAN
## 1.1 Deskripsi Program 

Sistem Manajemen Penitipan Hewan merupakan program berbasis Java yang dibuat untuk membantu mengelola data hewan dan data penitipan hewan. Program ini memiliki beberapa fitur seperti menambah, menampilkan, mengubah, menghapus, dan mencari data.
Program ini dibuat dengan menerapkan konsep Object Oriented Programming (OOP), yaitu dengan membagi program ke dalam beberapa class sesuai dengan fungsinya. Class Hewan digunakan untuk menyimpan data hewan, class Penitipan digunakan untuk menyimpan data penitipan, sedangkan class Service digunakan untuk mengatur proses pengolahan data. Program juga menggunakan object, constructor, ArrayList, percabangan, dan perulangan dalam proses pengelolaan data.
Program ini juga menerapkan validasi input sebagai nilai tambah untuk memastikan data yang dimasukkan sesuai dengan ketentuan yang telah ditetapkan. Dengan adanya validasi input, kesalahan saat memasukkan data dapat dikurangi sehingga data yang tersimpan menjadi lebih valid dan teratur

## 1.2 Tujuan Program

Tujuan dari pembuatan program Sistem Manajemen Penitipan Hewan yaitu:
1.	Membantu mengelola data hewan yang dititipkan agar lebih teratur.
2.	Memudahkan pengguna dalam mencatat dan melihat informasi hewan serta data penitipannya.
3.	Memudahkan pengguna dalam melakukan pencarian, perubahan, dan penghapusan data yang sudah tersimpan.
4.	Mengurangi kesulitan dalam mengelola data penitipan hewan secara manual.
5. Mengurangi kesalahan input data dengan menerapkan validasi input pada beberapa fitur dalam program.


## 1.3	Alur Singkat

Saat program dijalankan, akan muncul menu utama yang berisi beberapa pilihan. Pengguna bisa memilih menu sesuai kebutuhan, seperti menambahkan data hewan, melihat data, mengubah data, menghapus data, menambahkan data penitipan, atau mencari data hewan.
Setelah salah satu menu selesai digunakan, program akan kembali ke menu utama sehingga pengguna bisa memilih menu lainnya. Program akan terus berjalan sampai pengguna memilih menu Keluar. Setelah memilih menu tersebut, program akan menampilkan pesan penutup dan program selesai dijalankan.

# BAB II ALUR PROGRAM 

## 2.1 Menu Utama


<img width="457" height="280" alt="image" src="https://github.com/user-attachments/assets/8110ee27-95d7-4d08-a43b-d80556598ba4" />



Gambar di atas menampilkan menu utama dari program Sistem Manajemen Penitipan Hewan. Pada menu ini terdapat 10 pilihan, yaitu menu tambah data hewan, tambah data penitipan, tampilkan data hewan, tampilkan data penitipan, ubah data hewan, ubah data penitipan, hapus data hewan, hapus data penitipan, cari data hewan, dan keluar dari program. Pengguna dapat memilih menu dengan menginput angka yang tersedia.

## 2.2 Menu Tambah Data

<img width="422" height="347" alt="image" src="https://github.com/user-attachments/assets/1d561c47-a4d0-4e01-ace4-b21cc28174a7" />


Gambar di atas menampilkan informasi yang perlu ditambahkan ke dalam sistem. Pada menu tambah data hewan, pengguna perlu memasukkan ID hewan, nama hewan, dan jenis hewan. Sistem akan melakukan validasi terhadap data yang dimasukkan, yaitu ID hewan tidak boleh bernilai nol atau negatif, serta nama dan jenis hewan tidak boleh kosong. Jika data yang dimasukkan valid, data hewan akan disimpan ke dalam sistem. 

jika id hewan bernilai nol atau negatif dan nama hewan kosong data tidak valid, sistem akan menampilkan pesan kesalahan dan data tidak akan disimpan seperti pada gambar dibawah ini.

<img width="270" height="66" alt="image" src="https://github.com/user-attachments/assets/1ea5ded0-4b66-4d70-93eb-fb71d11a2543" />

<img width="332" height="85" alt="image" src="https://github.com/user-attachments/assets/04518eae-5252-4bd4-b405-7aa203b5d9c2" />

Sedangkan pada menu tambah data penitipan, pengguna perlu memasukkan ID penitipan, ID hewan, tanggal masuk, dan lama penitipan. Setelah semua informasi dimasukkan, data penitipan akan disimpan ke dalam sistem dan sistem akan menampilkan pesan bahwa data berhasil ditambahkan.


<img width="380" height="131" alt="image" src="https://github.com/user-attachments/assets/cbf58f3a-9c3a-4cdf-970f-b78c977a5aef" />


## 2.3 Menu Tampilkan Data

<img width="296" height="356" alt="image" src="https://github.com/user-attachments/assets/06597c42-8bf5-4bc5-979b-ed2cb679090a" />



<img width="435" height="322" alt="image" src="https://github.com/user-attachments/assets/920dd6dd-4d9b-4ee0-a2e2-73cbd641d12d" />


Gambar di atas menampilkan data yang sudah ditambahkan dan tersimpan di dalam sistem. Pada menu tampilkan data hewan, informasi yang ditampilkan berupa ID hewan, nama hewan, dan jenis hewan.
Sedangkan pada menu tampilkan data penitipan, informasi yang ditampilkan berupa ID penitipan, ID hewan, tanggal masuk, dan lama penitipan. Menu ini digunakan untuk melihat kembali data yang sudah dimasukkan ke dalam sistem.

## 2.4 Menu Update Data

<img width="317" height="111" alt="image" src="https://github.com/user-attachments/assets/1635bd37-c5fa-4ec8-90c2-948755c144d1" />


<img width="270" height="355" alt="image" src="https://github.com/user-attachments/assets/2ca6c43a-95d9-4792-8b25-ad890e991382" />

<img width="267" height="75" alt="image" src="https://github.com/user-attachments/assets/e0534df4-2568-4862-a772-cf22d45bb34e" />


Gambar di atas menampilkan informasi yang dapat diubah dari data yang sudah tersimpan di dalam sistem. Pada menu update data hewan, pengguna perlu memasukkan ID hewan yang ingin diubah, kemudian memasukkan nama hewan dan jenis hewan yang baru. Jika ID hewan ditemukan, data akan diperbarui sesuai dengan informasi yang dimasukkan.

<img width="372" height="117" alt="image" src="https://github.com/user-attachments/assets/7fa83895-08e6-4c6e-8d5a-6f5ae9fe670e" />


<img width="331" height="72" alt="image" src="https://github.com/user-attachments/assets/45c12323-cf8f-49d7-bdfe-877d237e5c57" />


Sedangkan pada menu update data penitipan, pengguna perlu memasukkan ID penitipan yang ingin diubah, kemudian memasukkan tanggal masuk dan lama penitipan yang baru. Jika ID penitipan ditemukan, data akan diperbarui dan sistem akan menampilkan pesan bahwa data berhasil diperbarui. Jika data yang dicari tidak ditemukan, sistem akan menampilkan pesan bahwa data tidak ditemukan.

## 2.5 Menu Hapus Data


<img width="255" height="71" alt="image" src="https://github.com/user-attachments/assets/2e3f3930-c77d-4fea-a7e7-6b044ef10806" />



<img width="267" height="67" alt="image" src="https://github.com/user-attachments/assets/c462895a-4da8-461c-9fc1-cacff652f015" />



<img width="350" height="271" alt="image" src="https://github.com/user-attachments/assets/031842d3-5fee-4a5d-8012-215a1fc01308" />


Gambar di atas menampilkan proses penghapusan data yang sudah tersimpan di dalam sistem. Pada menu hapus data hewan, pengguna perlu memasukkan ID hewan yang ingin dihapus. Jika ID hewan ditemukan, data hewan akan dihapus dari sistem dan akan muncul pesan bahwa data berhasil dihapus. Jika ID tidak ditemukan, sistem akan menampilkan pesan bahwa data hewan tidak ditemukan. begitupun untuk hapus data penitipan seperti gambar dibawah ini


<img width="340" height="67" alt="image" src="https://github.com/user-attachments/assets/777233f7-d5a9-4037-bf70-9499879470a8" />



<img width="340" height="72" alt="image" src="https://github.com/user-attachments/assets/9b457288-ecf7-4cfb-a885-baab3ee034c5" />




<img width="342" height="110" alt="image" src="https://github.com/user-attachments/assets/55e744fe-5af3-433d-9197-c85c84e86520" />



## 2.6 Menu Cari Data



Gambar di atas menampilkan menu pencarian data. Pada menu cari data hewan, pengguna dapat mencari informasi hewan yang sudah tersimpan dengan memasukkan ID hewan. Setelah ID dimasukkan, sistem akan menampilkan informasi berupa ID hewan, nama hewan, dan jenis hewan.
Jika data yang dicari tidak ditemukan, sistem akan menampilkan pesan bahwa data hewan tidak ditemukan.

## 2.7 Menu Keluar



Gambar di atas menampilkan menu keluar dari program. Pada menu ini, pengguna dapat memilih pilihan Keluar untuk mengakhiri program. Setelah pilihan tersebut dipilih, sistem akan menampilkan pesan terima kasih dan program akan berhenti dijalankan.


# BAB III PENERAPAN KONSEP OOP

## 3.1 Struktur Program 


Program Sistem Manajemen Penitipan Hewan dibuat dalam project yang bernama Penitipan_hewan. Di dalam project ini terdapat dua package dan empat class yang memiliki fungsi berbeda dalam menjalankan sistem. Package com.mycompany.penitipan_hewan berisikan class Penitipan_Hewan.java yang menjadi class utama untuk menjalankan program serta tempat menu utama sistem ditampilkan.

Sementara itu, package model berisikan class Hewan.java dan Penitipan.java yang berfungsi untuk merepresentasikannya sebagai objek data hewan dan transaksi penitipan. Class-class ini memiliki constructor untuk menginisialisasi informasi data serta method Getter dan Setter untuk mengakses dan mengubah nilai atribut. Atribut pada class model menggunakan access modifier private sebagai penerapan konsep enkapsulasi.

Selain class Main (Penitipan_Hewan), Hewan, dan Penitipan, terdapat class Service.java yang berisi proses CRUD (Create, Read, Update, Delete) serta fitur pencarian data hewan yang digunakan oleh menu utama pada class Main. Class ini bertanggung jawab dalam mengelola proses penambahan, penampilan, pembaruan, penghapusan, hingga pencarian data hewan maupun transaksi penitipan.

## 3.2 Class Main




Gambar di atas menampilkan class Penitipan_Hewan yang digunakan sebagai class utama atau entry point untuk menjalankan program. Pada bagian awal terdapat import yang digunakan untuk memanggil class Service dari package model dan Scanner untuk menerima input dari pengguna.
Di dalam method main(), dibuat object Scanner untuk membaca input yang dimasukkan oleh pengguna. Kemudian dibuat object Service yang digunakan untuk menjalankan proses pengolahan data pada program. Dengan menggunakan object Service, class Main dapat memanggil berbagai fitur yang sudah dibuat di dalam class tersebut.



Program menggunakan perulangan while agar menu utama terus ditampilkan selama program masih berjalan. Pemilihan menu menggunakan switch-case, di mana setiap pilihan akan menjalankan fungsi yang berbeda. Fitur tersebut meliputi proses CRUD (Create, Read, Update, Delete), yaitu menambah data, menampilkan data, mengubah data, dan menghapus data. Selain itu, terdapat juga fitur pencarian data hewan.
Program akan terus kembali ke menu utama setelah suatu proses selesai. Perulangan akan berhenti ketika pengguna memilih menu Keluar, sehingga program selesai dijalankan.


## 3.3 Class penitipan



Gambar di atas menampilkan class Penitipan yang digunakan untuk menyimpan data mengenai penitipan hewan. Class ini memiliki beberapa atribut, yaitu idPenitipan, idHewan, tanggalMasuk, dan lamaPenitipan.

Atribut idPenitipan digunakan sebagai identitas data penitipan, sedangkan idHewan digunakan untuk menunjukkan hewan yang sedang dititipkan. tanggalMasuk digunakan untuk menyimpan tanggal hewan mulai dititipkan dan lamaPenitipan digunakan untuk menyimpan berapa lama hewan tersebut dititipkan.

Class Penitipan juga memiliki constructor yang digunakan untuk memasukkan data saat object penitipan dibuat. Data tersebut kemudian dapat dikelola melalui class Service, seperti ditambahkan, ditampilkan, diubah, dan dihapus.

## 3.4 Class Hewan




Gambar di atas menampilkan class Hewan yang digunakan untuk menyimpan informasi mengenai hewan yang dititipkan. Class ini memiliki tiga atribut utama, yaitu idHewan, namaHewan, dan jenisHewan.

Class Hewan juga memiliki constructor yang digunakan untuk mengisi data hewan ketika object baru dibuat. Data yang sudah dimasukkan kemudian dapat disimpan dan ditampilkan melalui program. Dengan adanya class ini, data setiap hewan dapat dikelola dengan lebih teratur.


## 3.5 Class Service



Gambar di atas menampilkan class Service yang digunakan untuk mengatur proses pengolahan data pada program Sistem Manajemen Penitipan Hewan. Pada bagian awal terdapat import ArrayList yang digunakan untuk menyimpan kumpulan data dan Scanner yang digunakan untuk menerima input dari pengguna.

Di dalam class Service terdapat dua ArrayList, yaitu daftarHewan untuk menyimpan data hewan dan daftarPenitipan untuk menyimpan data penitipan. Class ini juga memiliki constructor yang menerima Scanner dari class Main agar input dari pengguna dapat digunakan dalam berbagai proses.

Class Service berisi method untuk menjalankan proses CRUD (Create, Read, Update, Delete). Proses Create digunakan pada tambahHewan() dan tambahPenitipan() untuk menambahkan data. Proses Read digunakan pada tampilkanHewan() dan tampilkanPenitipan() untuk menampilkan data yang sudah tersimpan. Proses Update digunakan pada updateHewan() dan updatePenitipan() untuk mengubah data, sedangkan proses Delete digunakan pada hapusHewan() dan hapusPenitipan() untuk menghapus data.

Selain proses CRUD, class Service juga memiliki method cariHewan() yang digunakan untuk mencari data hewan berdasarkan ID. Dengan adanya class Service, seluruh proses pengolahan data dapat dilakukan dengan lebih teratur dan tidak menumpuk di class Main.
