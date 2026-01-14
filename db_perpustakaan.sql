-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 14, 2026 at 05:00 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_perpustakaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `bukufiksi`
--

CREATE TABLE `bukufiksi` (
  `id` int(11) NOT NULL,
  `judul` varchar(100) DEFAULT NULL,
  `pengarang` varchar(50) DEFAULT NULL,
  `penerbit` varchar(50) DEFAULT NULL,
  `genre` varchar(25) DEFAULT NULL,
  `deskripsi` varchar(200) DEFAULT NULL,
  `dapatDipinjam` int(11) DEFAULT NULL,
  `sedangDipinjam` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bukufiksi`
--

INSERT INTO `bukufiksi` (`id`, `judul`, `pengarang`, `penerbit`, `genre`, `deskripsi`, `dapatDipinjam`, `sedangDipinjam`) VALUES
(1, 'Harry Potter', 'J.K.Rowling', 'Bloomsbury Publishing', 'Fantasi', 'Cerita tentang seorang penyihir muda bernama Harry Potter', 6, 7);

-- --------------------------------------------------------

--
-- Table structure for table `bukunonfiksi`
--

CREATE TABLE `bukunonfiksi` (
  `id` int(11) NOT NULL,
  `judul` varchar(100) DEFAULT NULL,
  `pengarang` varchar(50) DEFAULT NULL,
  `penerbit` varchar(50) DEFAULT NULL,
  `kategori` varchar(25) DEFAULT NULL,
  `deskripsi` varchar(200) DEFAULT NULL,
  `dapatDipinjam` int(11) DEFAULT NULL,
  `sedangDipinjam` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bukunonfiksi`
--

INSERT INTO `bukunonfiksi` (`id`, `judul`, `pengarang`, `penerbit`, `kategori`, `deskripsi`, `dapatDipinjam`, `sedangDipinjam`) VALUES
(1, 'Atomic Habits', 'James Clear', 'Random House', 'Self Improvement', 'Buku tentang membangun habits', 5, 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bukufiksi`
--
ALTER TABLE `bukufiksi`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `bukunonfiksi`
--
ALTER TABLE `bukunonfiksi`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bukufiksi`
--
ALTER TABLE `bukufiksi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `bukunonfiksi`
--
ALTER TABLE `bukunonfiksi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
