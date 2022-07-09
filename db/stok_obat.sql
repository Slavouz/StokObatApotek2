-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 09 Jul 2022 pada 13.45
-- Versi server: 10.4.24-MariaDB
-- Versi PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbstokobat`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `stok_obat`
--

CREATE TABLE `stok_obat` (
  `no` int(11) NOT NULL,
  `nama_barang` varchar(200) NOT NULL,
  `no_batch` int(11) NOT NULL,
  `PBF` varchar(500) NOT NULL,
  `jenis` varchar(200) NOT NULL,
  `satuan` int(11) NOT NULL,
  `jumlah_stok` int(11) NOT NULL,
  `tgl_msk` varchar(200) NOT NULL,
  `tgl_klr` varchar(200) NOT NULL,
  `exp` varchar(200) NOT NULL,
  `harga1` int(11) NOT NULL,
  `harga2` int(11) NOT NULL,
  `diskon` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `stok_obat`
--

INSERT INTO `stok_obat` (`no`, `nama_barang`, `no_batch`, `PBF`, `jenis`, `satuan`, `jumlah_stok`, `tgl_msk`, `tgl_klr`, `exp`, `harga1`, `harga2`, `diskon`) VALUES
(1, 'test', 2, 'test', '1', 2, 3, '0000-00-00', '0000-00-00', '0000-00-00', 1, 2, 3),
(3, '1', 1, '1', '1', 1, 1, '1', '1', '1', 1, 1, 1);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `stok_obat`
--
ALTER TABLE `stok_obat`
  ADD PRIMARY KEY (`no`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `stok_obat`
--
ALTER TABLE `stok_obat`
  MODIFY `no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
