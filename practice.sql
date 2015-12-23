-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- 主機: localhost
-- 產生時間： 2015 年 12 月 23 日 15:05
-- 伺服器版本: 5.6.26
-- PHP 版本： 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 資料庫： `practice`
--

-- --------------------------------------------------------

--
-- 資料表結構 `article`
--

CREATE TABLE IF NOT EXISTS `article` (
  `articleID` int(11) NOT NULL,
  `articleCategoryID` tinyint(4) NOT NULL,
  `articleTitle` varchar(40) DEFAULT NULL,
  `articleContent` text,
  `articleCreateDate` datetime DEFAULT NULL,
  `articleUpdateDate` datetime DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

--
-- 資料表的匯出資料 `article`
--

INSERT INTO `article` (`articleID`, `articleCategoryID`, `articleTitle`, `articleContent`, `articleCreateDate`, `articleUpdateDate`) VALUES
(17, 3, 'test', 'test', '2015-08-28 14:19:20', '2015-08-28 14:19:20'),
(20, 4, ' css', '132342313', '2015-11-27 21:18:16', '2015-11-27 21:18:16'),
(22, 1, '安安', '安安', '2015-12-07 23:24:48', '2015-12-07 23:24:48'),
(23, 1, '456', '456', '2015-12-08 22:54:48', '2015-12-09 00:32:09');

-- --------------------------------------------------------

--
-- 資料表結構 `article_category`
--

CREATE TABLE IF NOT EXISTS `article_category` (
  `articleCategoryID` tinyint(11) NOT NULL DEFAULT '0',
  `articleCategoryName` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 資料表的匯出資料 `article_category`
--

INSERT INTO `article_category` (`articleCategoryID`, `articleCategoryName`) VALUES
(1, '活動'),
(2, '新聞'),
(3, '課程'),
(4, '美食');

-- --------------------------------------------------------

--
-- 資料表結構 `product`
--

CREATE TABLE IF NOT EXISTS `product` (
  `ProductID` bigint(11) NOT NULL,
  `Category` int(11) NOT NULL,
  `Description` text NOT NULL,
  `Inventory` int(11) NOT NULL,
  `ReorderPoint` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- 資料表的匯出資料 `product`
--

INSERT INTO `product` (`ProductID`, `Category`, `Description`, `Inventory`, `ReorderPoint`) VALUES
(2, 1, '筆記型電腦', 9, 6),
(3, 1, '個人電腦', 2, 5);

-- --------------------------------------------------------

--
-- 資料表結構 `purchaseorder`
--

CREATE TABLE IF NOT EXISTS `purchaseorder` (
  `POID` bigint(20) NOT NULL,
  `ProductID` bigint(20) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `OrderTime` datetime NOT NULL,
  `InventoryArrivalTime` datetime DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- 資料表的匯出資料 `purchaseorder`
--

INSERT INTO `purchaseorder` (`POID`, `ProductID`, `Quantity`, `OrderTime`, `InventoryArrivalTime`) VALUES
(1, 3, 6, '2015-10-21 12:54:46', '2015-10-21 12:54:50');

-- --------------------------------------------------------

--
-- 資料表結構 `salesorder`
--

CREATE TABLE IF NOT EXISTS `salesorder` (
  `SOID` bigint(20) NOT NULL,
  `OrderTime` datetime NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- 資料表的匯出資料 `salesorder`
--

INSERT INTO `salesorder` (`SOID`, `OrderTime`) VALUES
(3, '2015-10-21 12:58:00'),
(4, '2015-10-21 13:04:09');

-- --------------------------------------------------------

--
-- 資料表結構 `salesorderitem`
--

CREATE TABLE IF NOT EXISTS `salesorderitem` (
  `id` bigint(20) NOT NULL,
  `SOID` bigint(20) NOT NULL,
  `ProductID` bigint(20) NOT NULL,
  `Quantity` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

--
-- 資料表的匯出資料 `salesorderitem`
--

INSERT INTO `salesorderitem` (`id`, `SOID`, `ProductID`, `Quantity`) VALUES
(1, 3, 3, 1),
(2, 4, 3, 1),
(3, 5, 2, 1),
(4, 5, 3, 1),
(5, 5, 2, 1),
(6, 5, 2, 1),
(7, 5, 2, 1),
(8, 5, 2, 1),
(9, 5, 2, 1),
(10, 5, 2, 1),
(11, 5, 2, 1),
(12, 5, 2, 1),
(13, 5, 2, 1),
(14, 5, 3, 1),
(15, 5, 2, 1);

-- --------------------------------------------------------

--
-- 資料表結構 `sa_AssignTest`
--

CREATE TABLE IF NOT EXISTS `sa_AssignTest` (
  `account` char(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `testID` char(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT '未分配',
  `Chinese` int(11) DEFAULT '-2',
  `English` int(10) DEFAULT '-2',
  `MathA` int(11) DEFAULT '-2',
  `MathB` int(10) DEFAULT '-2',
  `History` int(11) DEFAULT '-2',
  `Geography` int(11) DEFAULT '-2',
  `Civics` int(11) DEFAULT '-2',
  `Physical` int(11) DEFAULT '-2',
  `Chemical` int(11) DEFAULT '-2',
  `Biology` int(11) DEFAULT '-2',
  `type` char(5) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT '郵寄繳費',
  `money` int(7) DEFAULT '1500',
  `state` char(5) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT '未繳費',
  `identity` char(5) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `code` char(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT '待分配',
  `testPlace` char(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT '待分配',
  `note` char(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=armscii8;

-- --------------------------------------------------------

--
-- 資料表結構 `sa_BasicTest`
--

CREATE TABLE IF NOT EXISTS `sa_BasicTest` (
  `account` char(20) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `testID` char(11) COLLATE utf8_unicode_ci DEFAULT '未分配',
  `Chinese` int(11) DEFAULT NULL,
  `English` int(11) DEFAULT NULL,
  `Math` int(11) DEFAULT NULL,
  `Society` int(11) DEFAULT NULL,
  `Science` int(11) DEFAULT NULL,
  `type` char(11) COLLATE utf8_unicode_ci DEFAULT '郵寄繳費',
  `money` int(11) DEFAULT '1500',
  `state` char(11) COLLATE utf8_unicode_ci DEFAULT '未繳費',
  `identity` varchar(11) COLLATE utf8_unicode_ci DEFAULT NULL,
  `code` char(11) COLLATE utf8_unicode_ci DEFAULT '待分配',
  `testPlace` char(15) COLLATE utf8_unicode_ci DEFAULT '未分配',
  `note` char(255) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- 資料表的匯出資料 `sa_BasicTest`
--

INSERT INTO `sa_BasicTest` (`account`, `testID`, `Chinese`, `English`, `Math`, `Society`, `Science`, `type`, `money`, `state`, `identity`, `code`, `testPlace`, `note`) VALUES
('mike', '未分配', NULL, NULL, NULL, NULL, NULL, '郵寄繳費', 1500, '未繳費', '一般生', '待分配', '北區', '');

-- --------------------------------------------------------

--
-- 資料表結構 `sa_EnglishListening`
--

CREATE TABLE IF NOT EXISTS `sa_EnglishListening` (
  `account` char(20) COLLATE utf8_unicode_ci NOT NULL,
  `testID` char(10) COLLATE utf8_unicode_ci DEFAULT '待分配',
  `score` int(11) DEFAULT '0',
  `money` int(7) DEFAULT NULL,
  `state` char(5) COLLATE utf8_unicode_ci DEFAULT '未繳費',
  `identity` char(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `type` char(5) COLLATE utf8_unicode_ci DEFAULT '郵寄掛號',
  `code` char(10) COLLATE utf8_unicode_ci DEFAULT '待分配',
  `testPlace` char(15) COLLATE utf8_unicode_ci DEFAULT '待分配',
  `note` char(255) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- 資料表結構 `sa_IndividualPay`
--

CREATE TABLE IF NOT EXISTS `sa_IndividualPay` (
  `account` char(20) NOT NULL,
  `number` char(20) NOT NULL,
  `type` char(20) NOT NULL,
  `money` char(20) NOT NULL,
  `state` char(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=armscii8;

-- --------------------------------------------------------

--
-- 資料表結構 `sa_Manager`
--

CREATE TABLE IF NOT EXISTS `sa_Manager` (
  `account` char(20) NOT NULL,
  `password` char(20) NOT NULL,
  `sector` char(20) CHARACTER SET utf8 NOT NULL,
  `tel` char(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=armscii8;

--
-- 資料表的匯出資料 `sa_Manager`
--

INSERT INTO `sa_Manager` (`account`, `password`, `sector`, `tel`) VALUES
('root', '1234', '1', '0987109488');

-- --------------------------------------------------------

--
-- 資料表結構 `sa_School`
--

CREATE TABLE IF NOT EXISTS `sa_School` (
  `schoolcode` char(10) NOT NULL,
  `pwd` char(20) DEFAULT NULL,
  `name` char(20) CHARACTER SET utf8 NOT NULL,
  `address` char(40) CHARACTER SET utf8 NOT NULL,
  `tel` char(20) CHARACTER SET utf8 NOT NULL,
  `person` char(10) CHARACTER SET utf8 NOT NULL,
  `personTel` char(20) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=armscii8;

--
-- 資料表的匯出資料 `sa_School`
--

INSERT INTO `sa_School` (`schoolcode`, `pwd`, `name`, `address`, `tel`, `person`, `personTel`) VALUES
('001', '001', '宅宅高中', '新北市新莊區中港路', '0987109488', '肥宅小鈞', '0987109488');

-- --------------------------------------------------------

--
-- 資料表結構 `sa_TestPlace1`
--

CREATE TABLE IF NOT EXISTS `sa_TestPlace1` (
  `code` char(20) CHARACTER SET utf8 NOT NULL,
  `place` char(20) CHARACTER SET utf8 NOT NULL,
  `information` text CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=armscii8;

--
-- 資料表的匯出資料 `sa_TestPlace1`
--

INSERT INTO `sa_TestPlace1` (`code`, `place`, `information`) VALUES
('1', '新莊高中', '242新北市新莊區中平路135號'),
('2', '丹鳳高中', ''),
('3', '三重高中', '');

-- --------------------------------------------------------

--
-- 資料表結構 `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `account` char(20) CHARACTER SET armscii8 NOT NULL,
  `pwd` char(20) COLLATE utf8_unicode_ci NOT NULL,
  `code` char(20) CHARACTER SET utf8 DEFAULT '001',
  `id` char(20) CHARACTER SET utf8 NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 NOT NULL,
  `sex` char(20) CHARACTER SET utf8 NOT NULL,
  `birth` char(20) CHARACTER SET utf8 NOT NULL,
  `tel` char(20) CHARACTER SET utf8 NOT NULL,
  `address` char(20) CHARACTER SET utf8 NOT NULL,
  `email` char(40) CHARACTER SET utf8 NOT NULL,
  `picture` char(20) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='studentInfo';

--
-- 資料表的匯出資料 `student`
--

INSERT INTO `student` (`account`, `pwd`, `code`, `id`, `name`, `sex`, `birth`, `tel`, `address`, `email`, `picture`) VALUES
('090249029402942', '123', NULL, '123', '123', '男', '2', '4324', '33323', '2424', NULL),
('113', '113', NULL, '13', '13', '女', '0001-03-13', '313', 'ji', 'mike840609@yahoo.com.tw', NULL),
('321', '321', NULL, '321', '321', '女', '199123-03-01', '0987109488', '新莊', 'mike840609@yahoo.com.tw', NULL),
('bbs', 'bbs', '000', 'f129507191', '蔡鈞', '男', '1995/0609', '0987109488', '地球', 'mike840609@gmail.com', NULL),
('mike', 'mike', '001', 'f129507191', 'mike', '男', '1995-06-09', '0987109488', '新莊', 'mike840609@gmail.com', NULL),
('mike840609', 'mike0987109488', NULL, 'f129507191', '蔡鈞', '男', '1995-06-09', '0987109488', '新北市新莊區中港路104號', 'mike840609@yahoo.com.tw', NULL),
('root', 'root', '101', 'F128394859', '肥宅小鈞', '女', '1995/06/09', '0987109488', '輔仁大學', 'mike840609@gmail.com', '402401606.png'),
('test', 'test', NULL, 'f129507191', '肥宅小鈞2.0', '女', '84/6/9', '0987109488', '新莊', 'mike840609@gmail.com', NULL),
('test123', 'test123', NULL, 'f123123123', '蔡鈞', '女', '199412-03-14', '0987109488', '3', 'mike840609@yahoo.com.tw', NULL);

--
-- 已匯出資料表的索引
--

--
-- 資料表索引 `article`
--
ALTER TABLE `article`
  ADD PRIMARY KEY (`articleID`),
  ADD KEY `FK_article_articleCategoryID` (`articleCategoryID`);

--
-- 資料表索引 `article_category`
--
ALTER TABLE `article_category`
  ADD PRIMARY KEY (`articleCategoryID`);

--
-- 資料表索引 `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`ProductID`);

--
-- 資料表索引 `purchaseorder`
--
ALTER TABLE `purchaseorder`
  ADD PRIMARY KEY (`POID`);

--
-- 資料表索引 `salesorder`
--
ALTER TABLE `salesorder`
  ADD PRIMARY KEY (`SOID`);

--
-- 資料表索引 `salesorderitem`
--
ALTER TABLE `salesorderitem`
  ADD PRIMARY KEY (`id`);

--
-- 資料表索引 `sa_AssignTest`
--
ALTER TABLE `sa_AssignTest`
  ADD PRIMARY KEY (`account`);

--
-- 資料表索引 `sa_BasicTest`
--
ALTER TABLE `sa_BasicTest`
  ADD PRIMARY KEY (`account`);

--
-- 資料表索引 `sa_EnglishListening`
--
ALTER TABLE `sa_EnglishListening`
  ADD PRIMARY KEY (`account`);

--
-- 資料表索引 `sa_IndividualPay`
--
ALTER TABLE `sa_IndividualPay`
  ADD PRIMARY KEY (`number`);

--
-- 資料表索引 `sa_Manager`
--
ALTER TABLE `sa_Manager`
  ADD PRIMARY KEY (`account`);

--
-- 資料表索引 `sa_School`
--
ALTER TABLE `sa_School`
  ADD PRIMARY KEY (`schoolcode`);

--
-- 資料表索引 `sa_TestPlace1`
--
ALTER TABLE `sa_TestPlace1`
  ADD PRIMARY KEY (`code`);

--
-- 資料表索引 `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`account`);

--
-- 在匯出的資料表使用 AUTO_INCREMENT
--

--
-- 使用資料表 AUTO_INCREMENT `article`
--
ALTER TABLE `article`
  MODIFY `articleID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=24;
--
-- 使用資料表 AUTO_INCREMENT `product`
--
ALTER TABLE `product`
  MODIFY `ProductID` bigint(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- 使用資料表 AUTO_INCREMENT `purchaseorder`
--
ALTER TABLE `purchaseorder`
  MODIFY `POID` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- 使用資料表 AUTO_INCREMENT `salesorder`
--
ALTER TABLE `salesorder`
  MODIFY `SOID` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- 使用資料表 AUTO_INCREMENT `salesorderitem`
--
ALTER TABLE `salesorderitem`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=16;
--
-- 已匯出資料表的限制(Constraint)
--

--
-- 資料表的 Constraints `article`
--
ALTER TABLE `article`
  ADD CONSTRAINT `FK_article_articleCategoryID` FOREIGN KEY (`articleCategoryID`) REFERENCES `article_category` (`articleCategoryID`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
