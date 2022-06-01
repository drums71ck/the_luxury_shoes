CREATE DATABASE  IF NOT EXISTS `TheLuxuryShoes` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `TheLuxuryShoes`;
-- MySQL dump 10.13  Distrib 8.0.12, for Linux (x86_64)
--
-- Host: localhost    Database: TheLuxuryShoes
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Article`
--

DROP TABLE IF EXISTS `Article`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Article` (
  `idArticle` int(11) NOT NULL,
  `title` varchar(45) DEFAULT NULL,
  `size` int(11) DEFAULT NULL,
  `size2` int(11) DEFAULT NULL,
  `size3` int(11) DEFAULT NULL,
  `brand` varchar(45) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `imgUrl` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idArticle`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Article`
--

LOCK TABLES `Article` WRITE;
/*!40000 ALTER TABLE `Article` DISABLE KEYS */;
INSERT INTO `Article` VALUES (1,'Total 90',40,41,39,'Nike',10,40,'Football','total90'),(2,'Xinghuanhua',35,42,37,'Nike',5,60,'Football','xinghuanhua'),(3,'Ghosted',37,39,40,'Adidas',8,60,'Football','ghosted_rosa'),(4,'FutureZ',37,35,39,'Puma',5,66,'Football','futurez'),(5,'Copa Sense',40,41,42,'Adidas',4,70,'Football','copaSense'),(6,'Gresca',41,43,44,'Munich',3,89,'Indoor Football','grescaMunich'),(7,'Samba',39,41,43,'Adidas',8,64,'Indoor Football','sambaAdidas'),(8,'Imviso 100',33,35,38,'KIPSTA',13,14,'Indoor Football','imviso100'),(9,'Viralto II',42,41,45,'KIPSTA',14,39,'Indoor Football','ViraltoII'),(10,'Imviso Eskudo 500',30,32,34,'KIPSTA',20,20,'Indoor Football','imvisoEskudo500'),(11,'AIR JORDAN XXXVI',40,41,43,'Nike',15,148,'Basketball','AirJordan36'),(12,'REBOUND 2.0',42,43,44,'Champions',20,45,'Basketball','rebound2'),(13,'ZOOM SEPARATE',41,44,43,'Jordan',12,99,'Basketball','zoomSeparate'),(14,'ZOOM FREAK 3',33,40,35,'Nike',8,124,'Basketball','zoomFreak3'),(15,'jordan 1 Mid',38,41,43,'Jordan',5,120,'Basketball','jordanAirmid'),(16,'Novaflight',39,41,42,'Adidas',9,100,'Volleyball','adidasNovaflight'),(17,'Allsix V100',40,42,44,'ALLSIX',14,30,'Volleyball','allsix100'),(18,'Asics Sky ELite',38,40,42,'asics',6,105,'Volleyball','asicsSkyElite'),(19,'Mizuno Lightning Z6',42,44,45,'Mizuno',9,95,'Volleyball','asicsLightinhz6'),(20,'Allsix V500 Mid',40,42,43,'Allsix',3,35,'Volleyball','allsixV500');
/*!40000 ALTER TABLE `Article` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-01 19:16:27
