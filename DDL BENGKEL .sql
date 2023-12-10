CREATE DATABASE BENGKEL;
USE BENGKEL;

CREATE TABLE PELANGGAN (
    nama_pelanggan VARCHAR(100) NOT NULL PRIMARY KEY,
    telepon_pelanggan VARCHAR(15) NOT NULL
);

CREATE TABLE TOKO (
    nama_toko VARCHAR(100) NOT NULL PRIMARY KEY,
    alamat_toko VARCHAR(100) NOT NULL,
    telepon_toko VARCHAR(15) NOT NULL
);

CREATE TABLE BARANG (
    kode_barang VARCHAR(5) NOT NULL,
    nama_barang VARCHAR(50) NOT NULL,
    stok_barang INT NOT NULL,
    harga_satuan INT NOT NULL,
    PRIMARY KEY (kode_barang, nama_barang) 
);

CREATE TABLE NOTA (
    no_nota VARCHAR(10) NOT NULL PRIMARY KEY,
    tanggal_masuk VARCHAR(100) NOT NULL,
    tanggal_keluar VARCHAR(100) NOT NULL,
    jenis_sepeda VARCHAR(50) NOT NULL,
    nomor_polisi VARCHAR(10) NOT NULL,
    nama_pelanggan VARCHAR(100) NOT NULL, 
    nama_toko VARCHAR(100) NOT NULL, 
    nama_pegawai VARCHAR(50) NOT NULL,
    kode_barang VARCHAR(5) NOT NULL, 
    nama_barang VARCHAR(50) NOT NULL,
subtotal INT NOT NULL,
    total INT NOT NULL,
    FOREIGN KEY (nama_pelanggan) REFERENCES PELANGGAN(nama_pelanggan),
    FOREIGN KEY (nama_toko) REFERENCES TOKO(nama_toko),
    FOREIGN KEY (kode_barang, nama_barang) REFERENCES BARANG(kode_barang, nama_barang)
);

CREATE TABLE TRANSAKSI (
    no_nota VARCHAR(10) NOT NULL,
    kode_barang VARCHAR(5) NOT NULL,
    nama_barang VARCHAR(50) NOT NULL,
    jumlah_barang INT NOT NULL,
    subtotal INT NOT NULL,
    PRIMARY KEY (no_nota, kode_barang), 
    FOREIGN KEY (no_nota) REFERENCES NOTA(no_nota),
    FOREIGN KEY (kode_barang, nama_barang) REFERENCES BARANG(kode_barang, nama_barang)
);
