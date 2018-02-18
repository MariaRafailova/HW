-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.7.19-log - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for video_library
CREATE DATABASE IF NOT EXISTS `video_library` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `video_library`;

-- Dumping structure for table video_library.clients
CREATE TABLE IF NOT EXISTS `clients` (
  `cl_ID` int(4) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `contact` varchar(50) NOT NULL,
  PRIMARY KEY (`cl_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- Dumping data for table video_library.clients: ~6 rows (approximately)
/*!40000 ALTER TABLE `clients` DISABLE KEYS */;
INSERT INTO `clients` (`cl_ID`, `name`, `contact`) VALUES
	(1, 'Pesho', '+359888456321'),
	(2, 'Gosho', 'g.goshev@gmail.com'),
	(3, 'Penka', '+359235689741'),
	(4, 'Lili', '+359123456987'),
	(5, 'Eli', 'e_lka@abv.bg'),
	(6, 'Bobi', '+35926498713, bboianov@abv.bg');
/*!40000 ALTER TABLE `clients` ENABLE KEYS */;

-- Dumping structure for table video_library.client_movie
CREATE TABLE IF NOT EXISTS `client_movie` (
  `cl_ID` int(4) DEFAULT NULL,
  `m_ID` int(4) DEFAULT NULL,
  `date` varchar(50) DEFAULT NULL,
  KEY `cl_ID` (`cl_ID`),
  KEY `m_ID` (`m_ID`),
  CONSTRAINT `client_movie_ibfk_1` FOREIGN KEY (`cl_ID`) REFERENCES `clients` (`cl_ID`),
  CONSTRAINT `client_movie_ibfk_2` FOREIGN KEY (`m_ID`) REFERENCES `movies` (`m_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table video_library.client_movie: ~4 rows (approximately)
/*!40000 ALTER TABLE `client_movie` DISABLE KEYS */;
INSERT INTO `client_movie` (`cl_ID`, `m_ID`, `date`) VALUES
	(1, 1, '2018-01-03'),
	(1, 2, '2018-01-03'),
	(3, 5, '2018-01-04'),
	(6, 3, '2018-01-05');
/*!40000 ALTER TABLE `client_movie` ENABLE KEYS */;

-- Dumping structure for table video_library.movies
CREATE TABLE IF NOT EXISTS `movies` (
  `m_ID` int(4) NOT NULL AUTO_INCREMENT,
  `title` varchar(500) DEFAULT NULL,
  `countM` int(10) DEFAULT NULL,
  PRIMARY KEY (`m_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- Dumping data for table video_library.movies: ~5 rows (approximately)
/*!40000 ALTER TABLE `movies` DISABLE KEYS */;
INSERT INTO `movies` (`m_ID`, `title`, `countM`) VALUES
	(1, 'Star Wars: The Last Jedi', 10),
	(2, 'Spider-Man', 5),
	(3, 'it', 8),
	(4, 'Jumanji', 2),
	(5, 'Beauty and the Beast', 3);
/*!40000 ALTER TABLE `movies` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
