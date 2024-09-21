Aplikasi ini adalah program Java yang dirancang untuk mengelola data mahasiswa di Universitas Mangga. Dengan GUI yang mudah digunakan, User dapat menambahkan, menghapus, atau memperbarui Data mahasiswa dengan beberapa klik saja. Data yang ditampilkan dalam tabel, diambil langsung dari database PostgreSQL, sehingga pengguna bisa melihat semua informasi yang sudah dimasukkan. 

Berikut adalah penjelasan dari tiap-tiap bagiannya:

1. **Import**: Pada bagian awal, saya mengimpor beberapa kelas penting, seperti `JOptionPane` untuk menampilkan pesan, serta kelas untuk menghubungkan ke database.

2. **Kelas HanumFrame**: Ini adalah tampilan GUI yang akan ditampilkan kepada pengguna.

3. **Konstruktor**: berfungsi untuk memanggil metode untuk menyiapkan tampilan interface.

4. **initComponents()**: Metode ini berfungsi untuk mengatur elemen-elemen di GUI, seperti tabel untuk menampilkan data, tombol untuk menambah, menghapus, dan memperbarui data, serta kolom untuk mengisi NIM, Nama, dan Alamat mahasiswa.

5. **jButtonTambahDataActionPerformed()**: Saat tombol "Tambah" diklik, metode ini akan mengumpulkan data yang diisi pengguna, memeriksa apakah semua kolom terisi, dan kemudian menambahkan data baru ke database.

6. **jButtonHapusDataActionPerformed()**: Ketika tombol "Hapus" diklik, NIM dari input yang terkait akan menghapus data mahasiswa yang sesuai dari database.

7. **jButtonUpdateDataActionPerformed()**: Saat tombol "Update" ditekan, metode ini akan segera memperbarui informasi mahasiswa berdasarkan NIM yang dimasukkan.

Berikut penjelasan dari program ini, saya berharap readme ini bisa dipahami dengan mudah☺️ Sekian, Terima kasih.
