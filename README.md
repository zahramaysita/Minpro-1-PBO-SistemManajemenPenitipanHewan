# LAPORAN MINI PROJECT 1 PBO

## SISTEM MANAJEMEN PENITIPAN HEWAN

 Nama : Zahra Maysita 
 
 NIM : 2509116015

 Kelas : A'25



## Deskripsi Program 

Sistem Manajemen Penitipan Hewan merupakan program berbasis Java yang dibuat untuk membantu mengelola data hewan dan data penitipan hewan. Program ini memiliki beberapa fitur seperti menambah, menampilkan, mengubah, menghapus, dan mencari data.
Program ini dibuat dengan menerapkan konsep Object Oriented Programming (OOP), yaitu dengan membagi program ke dalam beberapa class sesuai dengan fungsinya. Class Hewan digunakan untuk menyimpan data hewan, class Penitipan digunakan untuk menyimpan data penitipan, sedangkan class Service digunakan untuk mengatur proses pengolahan data. Program juga menggunakan object, constructor, ArrayList, percabangan, dan perulangan dalam proses pengelolaan data.
Program ini juga menerapkan validasi input sebagai nilai tambah untuk memastikan data yang dimasukkan sesuai dengan ketentuan yang telah ditetapkan. Dengan adanya validasi input, kesalahan saat memasukkan data dapat dikurangi sehingga data yang tersimpan menjadi lebih valid dan teratur

## Tujuan Program

Tujuan dari pembuatan program Sistem Manajemen Penitipan Hewan yaitu:
1.	Membantu mengelola data hewan yang dititipkan agar lebih teratur.
2.	Memudahkan pengguna dalam mencatat dan melihat informasi hewan serta data penitipannya.
3.	Memudahkan pengguna dalam melakukan pencarian, perubahan, dan penghapusan data yang sudah tersimpan.
4.	Mengurangi kesulitan dalam mengelola data penitipan hewan secara manual.
5. Mengurangi kesalahan input data dengan menerapkan validasi input pada beberapa fitur dalam program.


## Alur Singkat

Saat program dijalankan, akan muncul menu utama yang berisi beberapa pilihan. Pengguna bisa memilih menu sesuai kebutuhan, seperti menambahkan data hewan, melihat data, mengubah data, menghapus data, menambahkan data penitipan, atau mencari data hewan.
Setelah salah satu menu selesai digunakan, program akan kembali ke menu utama sehingga pengguna bisa memilih menu lainnya. Program akan terus berjalan sampai pengguna memilih menu Keluar. Setelah memilih menu tersebut, program akan menampilkan pesan penutup dan program selesai dijalankan.

# ALUR PROGRAM 

## Menu Utama


<img width="457" height="280" alt="image" src="https://github.com/user-attachments/assets/8110ee27-95d7-4d08-a43b-d80556598ba4" />



Gambar di atas menampilkan menu utama dari program Sistem Manajemen Penitipan Hewan. Pada menu ini terdapat 10 pilihan, yaitu menu tambah data hewan, tambah data penitipan, tampilkan data hewan, tampilkan data penitipan, ubah data hewan, ubah data penitipan, hapus data hewan, hapus data penitipan, cari data hewan, dan keluar dari program. Pengguna dapat memilih menu dengan menginput angka yang tersedia.

## Menu Tambah Data

<img width="422" height="347" alt="image" src="https://github.com/user-attachments/assets/1d561c47-a4d0-4e01-ace4-b21cc28174a7" />


Gambar di atas menampilkan informasi yang perlu ditambahkan ke dalam sistem. Pada menu tambah data hewan, pengguna perlu memasukkan id hewan, nama hewan, dan jenis hewan. Sistem akan melakukan validasi terhadap data yang dimasukkan, yaitu id hewan tidak boleh bernilai nol atau negatif, serta nama dan jenis hewan tidak boleh kosong. Jika data yang dimasukkan valid, data hewan akan disimpan ke dalam sistem. 

jika id hewan bernilai nol atau negatif dan nama hewan kosong data tidak valid, sistem akan menampilkan pesan kesalahan dan data tidak akan disimpan seperti pada gambar dibawah ini.

<img width="270" height="66" alt="image" src="https://github.com/user-attachments/assets/1ea5ded0-4b66-4d70-93eb-fb71d11a2543" />

<img width="332" height="85" alt="image" src="https://github.com/user-attachments/assets/04518eae-5252-4bd4-b405-7aa203b5d9c2" />

Sedangkan pada menu tambah data penitipan, pengguna perlu memasukkan id penitipan, id hewan, tanggal masuk, dan lama penitipan. Setelah semua informasi dimasukkan, data penitipan akan disimpan ke dalam sistem dan sistem akan menampilkan pesan bahwa data berhasil ditambahkan.


<img width="380" height="131" alt="image" src="https://github.com/user-attachments/assets/cbf58f3a-9c3a-4cdf-970f-b78c977a5aef" />


## Menu Tampilkan Data

<img width="296" height="356" alt="image" src="https://github.com/user-attachments/assets/06597c42-8bf5-4bc5-979b-ed2cb679090a" />



<img width="435" height="322" alt="image" src="https://github.com/user-attachments/assets/920dd6dd-4d9b-4ee0-a2e2-73cbd641d12d" />


Gambar di atas menampilkan data yang sudah ditambahkan dan tersimpan di dalam sistem. Pada menu tampilkan data hewan, informasi yang ditampilkan berupa id hewan, nama hewan, dan jenis hewan.
Sedangkan pada menu tampilkan data penitipan, informasi yang ditampilkan berupa id penitipan, id hewan, tanggal masuk, dan lama penitipan. Menu ini digunakan untuk melihat kembali data yang sudah dimasukkan ke dalam sistem.

## Menu Update Data

<img width="317" height="111" alt="image" src="https://github.com/user-attachments/assets/1635bd37-c5fa-4ec8-90c2-948755c144d1" />


<img width="270" height="355" alt="image" src="https://github.com/user-attachments/assets/2ca6c43a-95d9-4792-8b25-ad890e991382" />

<img width="267" height="75" alt="image" src="https://github.com/user-attachments/assets/e0534df4-2568-4862-a772-cf22d45bb34e" />


Gambar di atas menampilkan informasi yang dapat diubah dari data yang sudah tersimpan di dalam sistem. Pada menu update data hewan, pengguna perlu memasukkan id hewan yang ingin diubah, kemudian memasukkan nama hewan dan jenis hewan yang baru. Jika id hewan ditemukan, data akan diperbarui sesuai dengan informasi yang dimasukkan.

<img width="372" height="117" alt="image" src="https://github.com/user-attachments/assets/7fa83895-08e6-4c6e-8d5a-6f5ae9fe670e" />


<img width="331" height="72" alt="image" src="https://github.com/user-attachments/assets/45c12323-cf8f-49d7-bdfe-877d237e5c57" />


Sedangkan pada menu update data penitipan, pengguna perlu memasukkan id penitipan yang ingin diubah, kemudian memasukkan tanggal masuk dan lama penitipan yang baru. Jika id penitipan ditemukan, data akan diperbarui dan sistem akan menampilkan pesan bahwa data berhasil diperbarui. Jika data yang dicari tidak ditemukan, sistem akan menampilkan pesan bahwa data tidak ditemukan.

## Menu Hapus Data


<img width="255" height="71" alt="image" src="https://github.com/user-attachments/assets/2e3f3930-c77d-4fea-a7e7-6b044ef10806" />



<img width="267" height="67" alt="image" src="https://github.com/user-attachments/assets/c462895a-4da8-461c-9fc1-cacff652f015" />



<img width="350" height="271" alt="image" src="https://github.com/user-attachments/assets/031842d3-5fee-4a5d-8012-215a1fc01308" />


Gambar di atas menampilkan proses penghapusan data yang sudah tersimpan di dalam sistem. Pada menu hapus data hewan, pengguna perlu memasukkan id hewan yang ingin dihapus. Jika id hewan ditemukan, data hewan akan dihapus dari sistem dan akan muncul pesan bahwa data berhasil dihapus. Jika id tidak ditemukan, sistem akan menampilkan pesan bahwa data hewan tidak ditemukan. begitupun untuk hapus data penitipan seperti gambar dibawah ini


<img width="340" height="67" alt="image" src="https://github.com/user-attachments/assets/777233f7-d5a9-4037-bf70-9499879470a8" />



<img width="340" height="72" alt="image" src="https://github.com/user-attachments/assets/9b457288-ecf7-4cfb-a885-baab3ee034c5" />




<img width="342" height="110" alt="image" src="https://github.com/user-attachments/assets/55e744fe-5af3-433d-9197-c85c84e86520" />



## Menu Cari Data


<img width="347" height="132" alt="image" src="https://github.com/user-attachments/assets/8ba0c338-b7b3-41d1-b5cd-388d8723530d" />


<img width="322" height="72" alt="image" src="https://github.com/user-attachments/assets/4de28dbc-0d74-4703-a111-6d219fc238d1" />


Gambar di atas menampilkan menu pencarian data. Pada menu cari data hewan, pengguna dapat mencari data hewan yang sudah tersimpan dengan memasukkan id hewan yang ingin dicari. Jika id hewan ditemukan, sistem akan menampilkan informasi berupa id hewan, nama hewan, dan jenis hewan.
Jika ID hewan yang dimasukkan tidak ditemukan, sistem akan menampilkan pesan bahwa data hewan tidak ditemukan. Menu ini memudahkan pengguna untuk menemukan data hewan tertentu tanpa harus melihat seluruh data yang tersimpan.

## Menu Keluar


<img width="690" height="235" alt="image" src="https://github.com/user-attachments/assets/0bc87535-70ea-4efd-8032-f2bcfe3cbe06" />




Gambar di atas menampilkan menu keluar dari program. Pada menu ini, pengguna dapat memilih pilihan Keluar untuk mengakhiri program. Setelah pilihan tersebut dipilih, sistem akan menampilkan pesan dan program akan berhenti dijalankan.


## Validasi Input

validasi input diterapkan pada class Service.java, tepatnya pada method tambahHewan(). Validasi ini diletakkan setelah pengguna memasukkan data hewan dan sebelum data tersebut dibuat menjadi object Hewan serta dimasukkan ke dalam ArrayList.
Pada bagian ini, program mengecek id hewan, nama hewan, dan jenis hewan. id hewan dicek agar tidak bernilai nol atau negatif, sedangkan nama dan jenis hewan dicek agar tidak kosong. Jika data tidak sesuai, program akan menampilkan pesan kesalahan dan proses penambahan data dihentikan. Jika data sudah sesuai, barulah data hewan disimpan ke dalam sistem.

