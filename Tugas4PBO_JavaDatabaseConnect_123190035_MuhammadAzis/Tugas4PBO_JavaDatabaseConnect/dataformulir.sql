-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 13, 2021 at 03:21 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.3.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dataformulir`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbformulir`
--

CREATE TABLE `tbformulir` (
  `email` varchar(40) NOT NULL,
  `username` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL,
  `nama` varchar(40) NOT NULL,
  `ttl` varchar(40) NOT NULL,
  `jk` varchar(40) NOT NULL,
  `domisili` varchar(40) NOT NULL,
  `deskripsi` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbformulir`
--

INSERT INTO `tbformulir` (`email`, `username`, `password`, `nama`, `ttl`, `jk`, `domisili`, `deskripsi`) VALUES
('nasipadang@ ', 'nana', '0912', '', '', 'Laki - Laki', '', ''),
('GlenSidraHilario@gmail.com ', 'Udasma12', 'LOL1245', 'Glen Sidra', 'BKL 18 01 01', 'Laki - Laki', 'BKL', 'Hallooo ');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbformulir`
--
ALTER TABLE `tbformulir`
  ADD PRIMARY KEY (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
