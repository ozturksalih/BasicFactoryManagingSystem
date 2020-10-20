-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 19, 2020 at 07:34 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `calisan_veritabani`
--

-- --------------------------------------------------------

--
-- Table structure for table `calisanlar`
--

CREATE TABLE `calisanlar` (
  `id` int(11) NOT NULL,
  `ad` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `soyad` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `departman` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `maas` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `username` text COLLATE utf32_turkish_ci NOT NULL,
  `password` text COLLATE utf32_turkish_ci NOT NULL,
  `is_admin` tinyint(1) NOT NULL,
  `thisMonth` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci;

--
-- Dumping data for table `calisanlar`
--

INSERT INTO `calisanlar` (`id`, `ad`, `soyad`, `departman`, `maas`, `username`, `password`, `is_admin`, `thisMonth`) VALUES
(1, 'Recep', 'UYANIK', 'İnsan Kaynakları', '6000', 'ruyanık', 'ruyanıkpassword', 1, 1),
(2, 'Zeliha', 'YÜCEL', 'Bilişim', '4500', 'zyücel', 'zyücelpassword', 0, 1),
(3, 'Merve', 'SÖNMEZ', 'İnsan Kaynakları', '3000', 'msönmez', 'msönmezpassword', 0, 1),
(4, 'Merve', 'VURAL', 'İnsan Kaynakları', '2000', 'mvural', 'mvuralpassword', 1, 1),
(5, 'Havva', 'Guzel', 'Bilişim', '4000', 'hguzel', 'hguzelpassword', 0, 1),
(6, 'Hatice', 'YÜZBAŞIOĞLU', 'Yönetim', '5000', 'hyüzbaşıoğlu', 'hyüzbaşıoğlupassword', 1, 1),
(7, 'Ahmet', 'YÜZBAŞIOĞLU', 'Yönetim', '4500', 'ayüzbaşıoğlu', 'ayüzbaşıoğlupassword', 0, 1),
(8, 'Mustafa', 'TÜTEN', 'İnsan Kaynakları', '5000', 'mtüten', 'mtütenpassword', 0, 1),
(9, 'Mustafa', 'ERDEM', 'Yönetim', '4500', 'merdem', 'merdempassword', 0, 1),
(10, 'Havva', 'VURAL', 'Bilişim', '5500', 'hvural', 'hvuralpassword', 0, 1),
(11, 'Esra', 'AKBULUT', 'Pazarlama', '6000', 'eakbulut', 'eakbulutpassword', 0, 1),
(12, 'Hanife', 'YAVUZ', 'Yönetim', '4000', 'hyavuz', 'hyavuzpassword', 0, 1),
(13, 'Meryem', 'UYANIK', 'Yönetim', '4000', 'muyanık', 'muyanıkpassword', 0, 1),
(14, 'Emine', 'ŞEN', 'Yönetim', '2000', 'eşen', 'eşenpassword', 0, 1),
(15, 'Hüseyin', 'ŞEN', 'İnsan Kaynakları', '2000', 'hşen', 'hşenpassword', 0, 1),
(16, 'Hüseyin', 'YÜCEL', 'İnsan Kaynakları', '2000', 'hyücel', 'hyücelpassword', 0, 1),
(17, 'Özlem', 'ÇEVİK', 'Yönetim', '4000', 'öçevik', 'öçevikpassword', 0, 1),
(18, 'Yunus Emre', 'ERDEM', 'Pazarlama', '4500', 'yerdem', 'yerdempassword', 0, 1),
(19, 'Zeynep', 'ÖZTÜRK', 'Yönetim', '5000', 'zöztürk', 'zöztürkpassword', 0, 1),
(20, 'Hülya', 'ÖZTÜRK', 'İnsan Kaynakları', '3000', 'höztürk', 'höztürkpassword', 0, 1),
(21, 'İsmail', 'ERDEM', 'Pazarlama', '2500', 'ierdem', 'ierdempassword', 0, 1),
(22, 'Esra', 'KANDEMİR', 'Yönetim', '4500', 'ekandemir', 'ekandemirpassword', 0, 1),
(23, 'Umut', 'ERKURAN', 'Bilişim', '4000', 'uerkuran', 'uerkuranpassword', 0, 1),
(24, 'Şerife', 'ERKURAN', 'İnsan Kaynakları', '4000', 'şerkuran', 'şerkuranpassword', 0, 1),
(25, 'Elif', 'VURAL', 'Pazarlama', '5000', 'evural', 'evuralpassword', 0, 1),
(26, 'Mustafa', 'ŞEN', 'İnsan Kaynakları', '5500', 'mşen', 'mşenpassword', 0, 1),
(27, 'Meryem', 'KANDEMİR', 'Bilişim', '4000', 'mkandemir', 'mkandemirpassword', 0, 1),
(29, 'Abdullah', 'ERTEKİN', 'İnsan Kaynakları', '2000', 'aertekin', 'aertekinpassword', 0, 1),
(30, 'Mehmet', 'ORHON', 'Pazarlama', '5000', 'morhon', 'morhonpassword', 0, 1),
(31, 'Ömer', 'SÖNMEZ', 'Pazarlama', '2000', 'ösönmez', 'ösönmezpassword', 0, 1),
(32, 'Abdullah', 'AKBULUT', 'İnsan Kaynakları', '6000', 'aakbulut', 'aakbulutpassword', 0, 1),
(33, 'Meryem', 'SÖNMEZ', 'Pazarlama', '3000', 'msonmeza', 'msonmezpassword', 0, 1),
(34, 'İsmail', 'SÖNMEZ', 'Bilişim', '2500', 'isönmez', 'isönmezpassword', 0, 1),
(35, 'Zeynep', 'ŞEN', 'Yönetim', '6000', 'zşen', 'zşenpassword', 0, 1),
(36, 'Ayşe', 'YÜZBAŞIOĞLU', 'Pazarlama', '3000', 'ayüzbaşıoğlu', 'ayüzbaşıoğlupassword', 0, 1),
(37, 'Enes', 'ŞEN', 'İnsan Kaynakları', '5500', 'eşen', 'eşenpassword', 1, 1),
(38, 'Şerife', 'ÇEVİK', 'İnsan Kaynakları', '2500', 'şçevik', 'şçevikpassword', 0, 1),
(39, 'Furkan', 'ERKURAN', 'Pazarlama', '4000', 'ferkuran', 'ferkuranpassword', 0, 1),
(40, 'Muhammed', 'ÖZTÜRK', 'Yönetim', '5000', 'möztürk', 'möztürkpassword', 0, 1),
(41, 'Hatice', 'VURAL', 'Yönetim', '2000', 'hvural', 'hvuralpassword', 0, 1),
(42, 'Emine', 'ERTEKİN', 'Bilişim', '5000', 'eertekin', 'eertekinpassword', 0, 1),
(43, 'Hülya', 'YAVUZ', 'İnsan Kaynakları', '6000', 'hyavuz', 'hyavuzpassword', 0, 1),
(44, 'Meryem', 'ERTEKİN', 'Yönetim', '6000', 'mertekin', 'mertekinpassword', 0, 1),
(45, 'Hasan', 'YÜZBAŞIOĞLU', 'Bilişim', '3000', 'hyüzbaşıoğlu', 'hyüzbaşıoğlupassword', 0, 1),
(46, 'Fadime', 'DEDE', 'İnsan Kaynakları', '2000', 'fdede', 'fdedepassword', 0, 1),
(47, 'Hasan', 'AKBULUT', 'Yönetim', '2500', 'hakbulut', 'hakbulutpassword', 0, 1),
(48, 'Süleyman', 'DEDE', 'İnsan Kaynakları', '4500', 'sdede', 'sdedepassword', 0, 1),
(49, 'Emine', 'ASLAN', 'Yönetim', '6000', 'easlan', 'easlanpassword', 0, 1),
(50, 'Hacer', 'ERKURAN', 'Bilişim', '2500', 'herkuran', 'herkuranpassword', 0, 1),
(52, 'Ahmet', 'YÜZBAŞIOĞLU', 'Yönetim', '3500', 'ayüzbaşıoğlu', 'ayüzbaşıoğlupassword', 0, 1),
(60, 'salabi', 'salabi', 'salabi', '', 'salabi', 'salabi', 1, 1),
(61, '', '', '', '', '', '', 1, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `calisanlar`
--
ALTER TABLE `calisanlar`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `calisanlar`
--
ALTER TABLE `calisanlar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=63;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
