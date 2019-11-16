-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.22-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema duplic
--

CREATE DATABASE IF NOT EXISTS duplic;
USE duplic;

--
-- Definition of table `bayes`
--

DROP TABLE IF EXISTS `bayes`;
CREATE TABLE `bayes` (
  `name` int(20) NOT NULL,
  `class1` int(20) NOT NULL,
  `class2` int(20) NOT NULL,
  `class3` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bayes`
--

/*!40000 ALTER TABLE `bayes` DISABLE KEYS */;
INSERT INTO `bayes` (`name`,`class1`,`class2`,`class3`) VALUES 
 (1,1,6,0),
 (2,1,6,0),
 (3,15,1,0),
 (4,3,2,0);
/*!40000 ALTER TABLE `bayes` ENABLE KEYS */;


--
-- Definition of table `bayes1`
--

DROP TABLE IF EXISTS `bayes1`;
CREATE TABLE `bayes1` (
  `cluster` varchar(200) NOT NULL,
  `value` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bayes1`
--

/*!40000 ALTER TABLE `bayes1` DISABLE KEYS */;
INSERT INTO `bayes1` (`cluster`,`value`) VALUES 
 ('cluster1',5),
 ('cluster2',29),
 ('cluster3',1);
/*!40000 ALTER TABLE `bayes1` ENABLE KEYS */;


--
-- Definition of table `bayes2`
--

DROP TABLE IF EXISTS `bayes2`;
CREATE TABLE `bayes2` (
  `class` varchar(200) NOT NULL,
  `value` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bayes2`
--

/*!40000 ALTER TABLE `bayes2` DISABLE KEYS */;
INSERT INTO `bayes2` (`class`,`value`) VALUES 
 ('ftp',7),
 ('telnet',7),
 ('http',16),
 ('smtp',5);
/*!40000 ALTER TABLE `bayes2` ENABLE KEYS */;


--
-- Definition of table `cluster`
--

DROP TABLE IF EXISTS `cluster`;
CREATE TABLE `cluster` (
  `pro` varchar(100) default NULL,
  `time` varchar(100) default NULL,
  `dur` varchar(100) default NULL,
  `bytes` varchar(100) default NULL,
  `Cluster` varchar(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cluster`
--

/*!40000 ALTER TABLE `cluster` DISABLE KEYS */;
INSERT INTO `cluster` (`pro`,`time`,`dur`,`bytes`,`Cluster`) VALUES 
 ('ftp','9:44:17','0:00:40','1051','cluster1'),
 ('ftp','10:00:31','0:00:01','51173','cluster2'),
 ('ftp','10:40:29','0:00:03','1116','cluster2'),
 ('ftp','10:40:38','0:00:56','1116','cluster2'),
 ('ftp','13:49:56','0:00:14','1387','cluster2'),
 ('ftp','13:50:15','0:00:58','1389','cluster2'),
 ('ftp','13:51:29','0:01:00','1392','cluster2'),
 ('telnet','10:06:42','0:03:43','1114','cluster3'),
 ('telnet','10:41:43','0:01:16','1170','cluster2'),
 ('telnet','10:52:28','0:02:56','1169','cluster2'),
 ('telnet','12:29:19','0:02:04','1173','cluster2'),
 ('telnet','12:41:55','0:01:27','1427','cluster2'),
 ('telnet','13:26:25','0:01:04','1321','cluster2'),
 ('telnet','13:52:29','0:00:01','1394','cluster2'),
 ('http','9:58:51','0:00:01','49924','cluster2'),
 ('http','10:10:46','0:00:21','1115','cluster2'),
 ('http','11:08:46','0:00:07','1028','cluster1'),
 ('http','11:51:31','0:00:26','4482','cluster2'),
 ('http','12:08:44','0:00:01','4482','cluster2'),
 ('http','12:04:11','0:00:01','1301','cluster2');
INSERT INTO `cluster` (`pro`,`time`,`dur`,`bytes`,`Cluster`) VALUES 
 ('http','12:04:16','0:00:01','1302','cluster2'),
 ('http','12:04:32','0:00:01','1303','cluster2'),
 ('http','12:05:08','0:00:24','1305','cluster2'),
 ('http','13:52:29','0:00:01','1395','cluster2'),
 ('http','13:52:29','0:00:01','1396','cluster2'),
 ('http','13:52:29','0:00:01','1397','cluster2'),
 ('http','13:52:29','0:00:01','1398','cluster2'),
 ('http','13:52:29','0:00:01','1399','cluster2'),
 ('http','13:52:29','0:00:01','1400','cluster2'),
 ('http','13:52:29','0:15:00','1401','cluster2'),
 ('smtp','8:12:42','0:00:05','1026','cluster1'),
 ('smtp','8:49:17','0:00:06','1107','cluster1'),
 ('smtp','9:55:27','0:00:03','37433','cluster2'),
 ('smtp','11:23:13','0:00:05','1050','cluster1'),
 ('smtp','11:50:08','0:00:04','1173','cluster2');
/*!40000 ALTER TABLE `cluster` ENABLE KEYS */;


--
-- Definition of table `dup`
--

DROP TABLE IF EXISTS `dup`;
CREATE TABLE `dup` (
  `id` int(250) NOT NULL,
  `name` varchar(500) NOT NULL,
  `address` varchar(500) NOT NULL,
  `city` varchar(500) NOT NULL,
  `phone` varchar(500) NOT NULL,
  `type` varchar(500) NOT NULL,
  `class1` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dup`
--

/*!40000 ALTER TABLE `dup` DISABLE KEYS */;
INSERT INTO `dup` (`id`,`name`,`address`,`city`,`phone`,`type`,`class1`) VALUES 
 (2,'arniemortonsofchicago','435lacienegablvd','losangeles','310-246-1501','steakhouses','0'),
 (3,'artsdelicatessen','12224venturablvd.','studiocity','818/762-1221','american','1'),
 (4,'artsdeli','12224venturablvd.','studiocity','818-762-1221','delis','1'),
 (5,'hotelbel-air','701stonecanyonrd.','belair','310/472-1211','californian','2'),
 (6,'bel-airhotel','701stonecanyonrd.','belair','310-472-1211','californian','2'),
 (7,'cafebizou','14016venturablvd.','shermanoaks','818/788-3536','french','3'),
 (8,'cafebizou','14016venturablvd.','shermanoaks','818-788-3536','frenchbistro','3'),
 (9,'campanile','624labreaave.','losangeles','213/938-1447','american','4'),
 (10,'campanile','624labreaave.','losangeles','213-938-1447','californian','4'),
 (11,'chinoisonmain','2709mainst.','santamonica','310/392-9025','french','5'),
 (12,'chinoisonmain','2709mainst.','santamonica','310-392-9025','pacificnewwave','5'),
 (13,'citrus','6703melroseave.','losangeles','213/857-0034','californian','6'),
 (14,'citrus','6703melroseave.','losangeles','213-857-0034','californian','6');
INSERT INTO `dup` (`id`,`name`,`address`,`city`,`phone`,`type`,`class1`) VALUES 
 (15,'fenix','8358sunsetblvd.west','hollywood','213/848-6677','american','7'),
 (16,'fenixattheargyle','8358sunsetblvd.','w.hollywood','213-848-6677','french(new)','7'),
 (17,'granita','23725w.maliburd.','malibu','310/456-0488','californian','8'),
 (18,'granita','23725w.maliburd.','malibu','310-456-0488','californian','8'),
 (19,'grillonthealley','9560daytonway','losangeles','310/276-0615','american','9'),
 (20,'grillthe','9560daytonway','beverlyhills','310-276-0615','american(traditional)','9'),
 (21,'restaurantkatsu','1972n.hillhurstave.','losangeles','213/665-1891','asian','10'),
 (22,'katsu','1972hillhurstave.','losfeliz','213-665-1891','japanese','10'),
 (23,'lorangerie','903n.lacienegablvd.','losangeles','310/652-9770','french','11'),
 (24,'lorangerie','903n.lacienegablvd.','w.hollywood','310-652-9770','pakistani','11'),
 (25,'lechardonnay','8284melroseave.','losangeles','213/655-8880','french','12'),
 (26,'lechardonnay(losangeles)','8284melroseave.','losangeles','213-655-8880','frenchbistro','12');
INSERT INTO `dup` (`id`,`name`,`address`,`city`,`phone`,`type`,`class1`) VALUES 
 (27,'locandaveneta','3rdst.','losangeles','310/274-1893','italian','13'),
 (28,'locandaveneta','8638w.thirdst.','losangeles','310-274-1893','italian','13'),
 (29,'matsuhisa','129n.lacienegablvd.','beverlyhills','310/659-9639','asian','14'),
 (30,'matsuhisa','129n.lacienegablvd.','beverlyhills','310-659-9639','seafood','14'),
 (31,'thepalm','9001santamonicablvd.','losangeles','310/550-8811','american','15'),
 (32,'palmthe(losangeles)','9001santamonicablvd.','w.hollywood','310-550-8811','steakhouses','15'),
 (33,'patina','5955melroseave.','losangeles','213/467-1108','californian','16'),
 (34,'patina','5955melroseave.','losangeles','213-467-1108','californian','16'),
 (35,'philippestheoriginal','1001n.alamedast.','losangeles','213/628-3781','american','17'),
 (36,'philippetheoriginal','1001n.alamedast.','chinatown','213-628-3781','cafeterias','17'),
 (37,'pinotbistro','12969venturablvd.','losangeles','818/990-0500','french','18'),
 (38,'pinotbistro','12969venturablvd.','studiocity','818-990-0500','frenchbistro','18');
INSERT INTO `dup` (`id`,`name`,`address`,`city`,`phone`,`type`,`class1`) VALUES 
 (39,'rexilristorante','617olivest.','losangeles','213/627-2300','italian','19'),
 (40,'rexilristorante','617olivest.','losangeles','213-627-2300','nuovacucinaitalian','19'),
 (41,'spago','1114hornave.','losangeles','310/652-4025','californian','20'),
 (42,'spago(losangeles)','8795sunsetblvd.','w.hollywood','310-652-4025','californian','20'),
 (43,'valentino','3115picoblvd.','santamonica','310/829-4313','italian','21'),
 (44,'valentino','3115picoblvd.','santamonica','310-829-4313','italian','21'),
 (45,'yujeankangsgourmetchinesecuisine','67n.raymondave.','losangeles','818/585-0855','asian','22'),
 (46,'yujeankangs','67n.raymondave.','pasadena','818-585-0855','chinese','22'),
 (47,'21club','21w.52ndst.','newyork','212/582-7200','american','23'),
 (48,'21club','21w.52ndst.','newyorkcity','212-582-7200','american(new)','23'),
 (49,'aquavit','13w.54thst.','newyork','212/307-7311','continental','24'),
 (50,'aquavit','13w.54thst.','newyorkcity','212-307-7311','scandinavian','24'),
 (51,'aureole','34e.61stst.','newyork','212/319-1660','american','25');
INSERT INTO `dup` (`id`,`name`,`address`,`city`,`phone`,`type`,`class1`) VALUES 
 (52,'aureole','34e.61stst.','newyorkcity','212-319-1660','american(new)','25'),
 (53,'cafelalo','201w.83rdst.','newyork','212/496-6031','coffeebar','26'),
 (54,'cafelalo','201w.83rdst.','newyorkcity','212-496-6031','coffeehouses','26'),
 (55,'cafedesartistes','1w.67thst.','newyork','212/877-3500','continental','27'),
 (56,'cafedesartistes','1w.67thst.','newyorkcity','212-877-3500','pakistani','27'),
 (57,'carmines','2450broadwaybetween90thand91stst','newyork','212/362-2200','italian','28'),
 (58,'carmines','2450broadway','newyorkcity','212-362-2200','italian','28'),
 (59,'carnegiedeli','8547thave.between54thand55thst','newyork','212/757-2245','delicatessen','29'),
 (60,'carnegiedeli','854seventhave.','newyorkcity','212-757-2245','delis','29'),
 (61,'chanterelle','2harrisonst.nearhudsonst.','newyork','212/966-6960','american','30'),
 (62,'chanterelle','2harrisonst.','newyorkcity','212-966-6960','french(new)','30'),
 (63,'daniel','20e.76thst.','newyork','212/288-0033','french','31');
INSERT INTO `dup` (`id`,`name`,`address`,`city`,`phone`,`type`,`class1`) VALUES 
 (64,'daniel','20e.76thst.','newyorkcity','212-288-0033','french(new)','31'),
 (65,'dawat','210e.58thst.','newyork','212/355-7555','asian','32'),
 (66,'dawat','210e.58thst.','newyorkcity','212-355-7555','indian','32'),
 (67,'felidia','243e.58thst.','newyork','212/758-1479','italian','33'),
 (68,'felidia','243e.58thst.','newyorkcity','212-758-1479','italian','33'),
 (69,'fourseasonsgrillroom','99e.52ndst.','newyork','212/754-9494','american','34'),
 (70,'fourseasons','99e.52ndst.','newyorkcity','212-754-9494','american(new)','34'),
 (71,'gothambar&grill','12e.12thst.','newyork','212/620-4020','american','35'),
 (72,'gothambar&grill','12e.12thst.','newyorkcity','212-620-4020','american(new)','35'),
 (73,'gramercytavern','42e.20thst.betweenparkave.sandbroadway','newyork','212/477-0777','american','36'),
 (74,'gramercytavern','42e.20thst.','newyorkcity','212-477-0777','american(new)','36'),
 (75,'islandspice','402w.44thst.','newyork','212/765-1737','telcaribbean','37'),
 (76,'islandspice','402w.44thst.','newyorkcity','212-765-1737','caribbean','37');
INSERT INTO `dup` (`id`,`name`,`address`,`city`,`phone`,`type`,`class1`) VALUES 
 (77,'jojo','160e.64thst.','newyork','212/223-5656','american','38'),
 (78,'jojo','160e.64thst.','newyorkcity','212-223-5656','frenchbistro','38'),
 (79,'lacaravelle','33w.55thst.','newyork','212/586-4252','french','39'),
 (80,'lacaravelle','33w.55thst.','newyorkcity','212-586-4252','pakistani','39'),
 (81,'lacotebasque','60w.55thst.between5thand6thave.','newyork','212/688-6525','french','40'),
 (82,'lacotebasque','60w.55thst.','newyorkcity','212-688-6525','pakistani','40'),
 (83,'lebernardin','155w.51stst.','newyork','212/489-1515','french','41'),
 (84,'lebernardin','155w.51stst.','newyorkcity','212-489-1515','seafood','41'),
 (85,'lescelebrites','160centralparks','newyork','212/484-5113','french','42'),
 (86,'lescelebrites','155w.58thst.','newyorkcity','212-484-5113','pakistani','42'),
 (87,'lespinasse','2e.55thst.','newyork','212/339-6719','american','43'),
 (88,'lespinasse(newyorkcity)','2e.55thst.','newyorkcity','212-339-6719','asian','43'),
 (89,'lutece','249e.50thst.','newyork','212/752-2225','french','44');
INSERT INTO `dup` (`id`,`name`,`address`,`city`,`phone`,`type`,`class1`) VALUES 
 (90,'lutece','249e.50thst.','newyorkcity','212-752-2225','pakistani','44'),
 (91,'manhattanoceanclub','57w.58thst.','newyork','212/371-7777','seafood','45'),
 (92,'manhattanoceanclub','57w.58thst.','newyorkcity','212-371-7777','seafood','45'),
 (93,'march','405e.58thst.','newyork','212/754-6272','american','46'),
 (94,'march','405e.58thst.','newyorkcity','212-754-6272','american(new)','46'),
 (95,'mesagrill','1025thave.between15thand16thst','newyork','212/807-7400','american','47'),
 (96,'mesagrill','102fifthave.','newyorkcity','212-807-7400','southwestern','47'),
 (97,'micocina','57janest.offhudsonst.','newyork','212/627-8273','mexican','48'),
 (98,'micocina','57janest.','newyorkcity','212-627-8273','mexican','48'),
 (99,'montrachet','239w.broadwaybetweenwalkerandwhitest','newyork','212/219-2777','french','49'),
 (100,'montrachet','239w.broadway','newyorkcity','212-219-2777','frenchbistro','49'),
 (101,'oceana','55e.54thst.','newyork','212/759-5941','seafood','50'),
 (102,'oceana','55e.54thst.','newyorkcity','212-759-5941','seafood','50');
INSERT INTO `dup` (`id`,`name`,`address`,`city`,`phone`,`type`,`class1`) VALUES 
 (67,'ram','kallalurichi','chennai','4567676767','dfdfdf','6');
/*!40000 ALTER TABLE `dup` ENABLE KEYS */;


--
-- Definition of table `process`
--

DROP TABLE IF EXISTS `process`;
CREATE TABLE `process` (
  `id` varchar(500) NOT NULL,
  `name` varchar(500) NOT NULL,
  `address` varchar(500) NOT NULL,
  `city` varchar(500) NOT NULL,
  `phone` varchar(500) NOT NULL,
  `type` varchar(500) NOT NULL,
  `class` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `process`
--

/*!40000 ALTER TABLE `process` DISABLE KEYS */;
INSERT INTO `process` (`id`,`name`,`address`,`city`,`phone`,`type`,`class`) VALUES 
 ('2','arniemortonsofchicago','435lacienegablvd','losangeles','310-246-1501','steakhouses','0'),
 ('3','artsdelicatessen','12224venturablvd.','studiocity','818/762-1221','american','1'),
 ('4','artsdeli','12224venturablvd.','studiocity','818-762-1221','delis','1'),
 ('5','hotelbel-air','701stonecanyonrd.','belair','310/472-1211','californian','2'),
 ('6','bel-airhotel','701stonecanyonrd.','belair','310-472-1211','californian','2'),
 ('7','cafebizou','14016venturablvd.','shermanoaks','818/788-3536','french','3'),
 ('8','cafebizou','14016venturablvd.','shermanoaks','818-788-3536','frenchbistro','3'),
 ('9','campanile','624labreaave.','losangeles','213/938-1447','american','4'),
 ('10','campanile','624labreaave.','losangeles','213-938-1447','californian','4'),
 ('11','chinoisonmain','2709mainst.','santamonica','310/392-9025','french','5'),
 ('12','chinoisonmain','2709mainst.','santamonica','310-392-9025','pacificnewwave','5'),
 ('13','citrus','6703melroseave.','losangeles','213/857-0034','californian','6');
INSERT INTO `process` (`id`,`name`,`address`,`city`,`phone`,`type`,`class`) VALUES 
 ('14','citrus','6703melroseave.','losangeles','213-857-0034','californian','6'),
 ('15','fenix','8358sunsetblvd.west','hollywood','213/848-6677','american','7'),
 ('16','fenixattheargyle','8358sunsetblvd.','w.hollywood','213-848-6677','french(new)','7'),
 ('17','granita','23725w.maliburd.','malibu','310/456-0488','californian','8'),
 ('18','granita','23725w.maliburd.','malibu','310-456-0488','californian','8'),
 ('19','grillonthealley','9560daytonway','losangeles','310/276-0615','american','9'),
 ('20','grillthe','9560daytonway','beverlyhills','310-276-0615','american(traditional)','9'),
 ('21','restaurantkatsu','1972n.hillhurstave.','losangeles','213/665-1891','asian','10'),
 ('22','katsu','1972hillhurstave.','losfeliz','213-665-1891','japanese','10'),
 ('23','lorangerie','903n.lacienegablvd.','losangeles','310/652-9770','french','11'),
 ('24','lorangerie','903n.lacienegablvd.','w.hollywood','310-652-9770','pakistani','11'),
 ('25','lechardonnay','8284melroseave.','losangeles','213/655-8880','french','12');
INSERT INTO `process` (`id`,`name`,`address`,`city`,`phone`,`type`,`class`) VALUES 
 ('26','lechardonnay(losangeles)','8284melroseave.','losangeles','213-655-8880','frenchbistro','12'),
 ('27','locandaveneta','3rdst.','losangeles','310/274-1893','italian','13'),
 ('28','locandaveneta','8638w.thirdst.','losangeles','310-274-1893','italian','13'),
 ('29','matsuhisa','129n.lacienegablvd.','beverlyhills','310/659-9639','asian','14'),
 ('30','matsuhisa','129n.lacienegablvd.','beverlyhills','310-659-9639','seafood','14'),
 ('31','thepalm','9001santamonicablvd.','losangeles','310/550-8811','american','15'),
 ('32','palmthe(losangeles)','9001santamonicablvd.','w.hollywood','310-550-8811','steakhouses','15'),
 ('33','patina','5955melroseave.','losangeles','213/467-1108','californian','16'),
 ('34','patina','5955melroseave.','losangeles','213-467-1108','californian','16'),
 ('35','philippestheoriginal','1001n.alamedast.','losangeles','213/628-3781','american','17'),
 ('36','philippetheoriginal','1001n.alamedast.','chinatown','213-628-3781','cafeterias','17'),
 ('37','pinotbistro','12969venturablvd.','losangeles','818/990-0500','french','18');
INSERT INTO `process` (`id`,`name`,`address`,`city`,`phone`,`type`,`class`) VALUES 
 ('38','pinotbistro','12969venturablvd.','studiocity','818-990-0500','frenchbistro','18'),
 ('39','rexilristorante','617olivest.','losangeles','213/627-2300','italian','19'),
 ('40','rexilristorante','617olivest.','losangeles','213-627-2300','nuovacucinaitalian','19'),
 ('41','spago','1114hornave.','losangeles','310/652-4025','californian','20'),
 ('42','spago(losangeles)','8795sunsetblvd.','w.hollywood','310-652-4025','californian','20'),
 ('43','valentino','3115picoblvd.','santamonica','310/829-4313','italian','21'),
 ('44','valentino','3115picoblvd.','santamonica','310-829-4313','italian','21'),
 ('45','yujeankangsgourmetchinesecuisine','67n.raymondave.','losangeles','818/585-0855','asian','22'),
 ('46','yujeankangs','67n.raymondave.','pasadena','818-585-0855','chinese','22'),
 ('47','21club','21w.52ndst.','newyork','212/582-7200','american','23'),
 ('48','21club','21w.52ndst.','newyorkcity','212-582-7200','american(new)','23'),
 ('49','aquavit','13w.54thst.','newyork','212/307-7311','continental','24');
INSERT INTO `process` (`id`,`name`,`address`,`city`,`phone`,`type`,`class`) VALUES 
 ('50','aquavit','13w.54thst.','newyorkcity','212-307-7311','scandinavian','24'),
 ('51','aureole','34e.61stst.','newyork','212/319-1660','american','25'),
 ('52','aureole','34e.61stst.','newyorkcity','212-319-1660','american(new)','25'),
 ('53','cafelalo','201w.83rdst.','newyork','212/496-6031','coffeebar','26'),
 ('54','cafelalo','201w.83rdst.','newyorkcity','212-496-6031','coffeehouses','26'),
 ('55','cafedesartistes','1w.67thst.','newyork','212/877-3500','continental','27'),
 ('56','cafedesartistes','1w.67thst.','newyorkcity','212-877-3500','pakistani','27'),
 ('57','carmines','2450broadwaybetween90thand91stst','newyork','212/362-2200','italian','28'),
 ('58','carmines','2450broadway','newyorkcity','212-362-2200','italian','28'),
 ('59','carnegiedeli','8547thave.between54thand55thst','newyork','212/757-2245','delicatessen','29'),
 ('60','carnegiedeli','854seventhave.','newyorkcity','212-757-2245','delis','29'),
 ('61','chanterelle','2harrisonst.nearhudsonst.','newyork','212/966-6960','american','30');
INSERT INTO `process` (`id`,`name`,`address`,`city`,`phone`,`type`,`class`) VALUES 
 ('62','chanterelle','2harrisonst.','newyorkcity','212-966-6960','french(new)','30'),
 ('63','daniel','20e.76thst.','newyork','212/288-0033','french','31'),
 ('64','daniel','20e.76thst.','newyorkcity','212-288-0033','french(new)','31'),
 ('65','dawat','210e.58thst.','newyork','212/355-7555','asian','32'),
 ('66','dawat','210e.58thst.','newyorkcity','212-355-7555','indian','32'),
 ('67','felidia','243e.58thst.','newyork','212/758-1479','italian','33'),
 ('68','felidia','243e.58thst.','newyorkcity','212-758-1479','italian','33'),
 ('69','fourseasonsgrillroom','99e.52ndst.','newyork','212/754-9494','american','34'),
 ('70','fourseasons','99e.52ndst.','newyorkcity','212-754-9494','american(new)','34'),
 ('71','gothambar&grill','12e.12thst.','newyork','212/620-4020','american','35'),
 ('72','gothambar&grill','12e.12thst.','newyorkcity','212-620-4020','american(new)','35'),
 ('73','gramercytavern','42e.20thst.betweenparkave.sandbroadway','newyork','212/477-0777','american','36'),
 ('74','gramercytavern','42e.20thst.','newyorkcity','212-477-0777','american(new)','36');
INSERT INTO `process` (`id`,`name`,`address`,`city`,`phone`,`type`,`class`) VALUES 
 ('75','islandspice','402w.44thst.','newyork','212/765-1737','telcaribbean','37'),
 ('76','islandspice','402w.44thst.','newyorkcity','212-765-1737','caribbean','37'),
 ('77','jojo','160e.64thst.','newyork','212/223-5656','american','38'),
 ('78','jojo','160e.64thst.','newyorkcity','212-223-5656','frenchbistro','38'),
 ('79','lacaravelle','33w.55thst.','newyork','212/586-4252','french','39'),
 ('80','lacaravelle','33w.55thst.','newyorkcity','212-586-4252','pakistani','39'),
 ('81','lacotebasque','60w.55thst.between5thand6thave.','newyork','212/688-6525','french','40'),
 ('82','lacotebasque','60w.55thst.','newyorkcity','212-688-6525','pakistani','40'),
 ('83','lebernardin','155w.51stst.','newyork','212/489-1515','french','41'),
 ('84','lebernardin','155w.51stst.','newyorkcity','212-489-1515','seafood','41'),
 ('85','lescelebrites','160centralparks','newyork','212/484-5113','french','42'),
 ('86','lescelebrites','155w.58thst.','newyorkcity','212-484-5113','pakistani','42'),
 ('87','lespinasse','2e.55thst.','newyork','212/339-6719','american','43');
INSERT INTO `process` (`id`,`name`,`address`,`city`,`phone`,`type`,`class`) VALUES 
 ('88','lespinasse(newyorkcity)','2e.55thst.','newyorkcity','212-339-6719','asian','43'),
 ('89','lutece','249e.50thst.','newyork','212/752-2225','french','44'),
 ('90','lutece','249e.50thst.','newyorkcity','212-752-2225','pakistani','44'),
 ('91','manhattanoceanclub','57w.58thst.','newyork','212/371-7777','seafood','45'),
 ('92','manhattanoceanclub','57w.58thst.','newyorkcity','212-371-7777','seafood','45'),
 ('93','march','405e.58thst.','newyork','212/754-6272','american','46'),
 ('94','march','405e.58thst.','newyorkcity','212-754-6272','american(new)','46'),
 ('95','mesagrill','1025thave.between15thand16thst','newyork','212/807-7400','american','47'),
 ('96','mesagrill','102fifthave.','newyorkcity','212-807-7400','southwestern','47'),
 ('97','micocina','57janest.offhudsonst.','newyork','212/627-8273','mexican','48'),
 ('98','micocina','57janest.','newyorkcity','212-627-8273','mexican','48'),
 ('99','montrachet','239w.broadwaybetweenwalkerandwhitest','newyork','212/219-2777','french','49'),
 ('100','montrachet','239w.broadway','newyorkcity','212-219-2777','frenchbistro','49');
INSERT INTO `process` (`id`,`name`,`address`,`city`,`phone`,`type`,`class`) VALUES 
 ('101','oceana','55e.54thst.','newyork','212/759-5941','seafood','50'),
 ('102','oceana','55e.54thst.','newyorkcity','212-759-5941','seafood','50');
/*!40000 ALTER TABLE `process` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
