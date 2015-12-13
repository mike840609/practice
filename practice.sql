-- phpMyAdmin SQL Dump
-- version 4.5.0.2
-- http://www.phpmyadmin.net
--
-- 主機: localhost
-- 產生時間： 2015 年 12 月 10 日 16:16
-- 伺服器版本: 10.0.17-MariaDB
-- PHP 版本： 5.6.14

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

CREATE TABLE `article` (
  `articleID` int(11) NOT NULL,
  `articleCategoryID` tinyint(4) NOT NULL,
  `articleTitle` varchar(40) DEFAULT NULL,
  `articleContent` text,
  `articleCreateDate` datetime DEFAULT NULL,
  `articleUpdateDate` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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

CREATE TABLE `article_category` (
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

CREATE TABLE `product` (
  `ProductID` bigint(11) NOT NULL,
  `Category` int(11) NOT NULL,
  `Description` text NOT NULL,
  `Inventory` int(11) NOT NULL,
  `ReorderPoint` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 資料表的匯出資料 `product`
--

INSERT INTO `product` (`ProductID`, `Category`, `Description`, `Inventory`, `ReorderPoint`) VALUES
(2, 1, '筆記型電腦', 20, 6),
(3, 1, '個人電腦', 4, 5);

-- --------------------------------------------------------

--
-- 資料表結構 `purchaseorder`
--

CREATE TABLE `purchaseorder` (
  `POID` bigint(20) NOT NULL,
  `ProductID` bigint(20) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `OrderTime` datetime NOT NULL,
  `InventoryArrivalTime` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 資料表的匯出資料 `purchaseorder`
--

INSERT INTO `purchaseorder` (`POID`, `ProductID`, `Quantity`, `OrderTime`, `InventoryArrivalTime`) VALUES
(1, 3, 6, '2015-10-21 12:54:46', '2015-10-21 12:54:50');

-- --------------------------------------------------------

--
-- 資料表結構 `salesorder`
--

CREATE TABLE `salesorder` (
  `SOID` bigint(20) NOT NULL,
  `OrderTime` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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

CREATE TABLE `salesorderitem` (
  `id` bigint(20) NOT NULL,
  `SOID` bigint(20) NOT NULL,
  `ProductID` bigint(20) NOT NULL,
  `Quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 資料表的匯出資料 `salesorderitem`
--

INSERT INTO `salesorderitem` (`id`, `SOID`, `ProductID`, `Quantity`) VALUES
(1, 3, 3, 1),
(2, 4, 3, 1);

-- --------------------------------------------------------

--
-- 資料表結構 `sa_AssignTest`
--

CREATE TABLE `sa_AssignTest` (
  `account` char(20) CHARACTER SET utf8 NOT NULL,
  `chinese` double NOT NULL,
  `math` double NOT NULL,
  `history` double NOT NULL,
  `geography` double NOT NULL,
  `civics` double NOT NULL,
  `physical` double NOT NULL,
  `chemical` double NOT NULL,
  `biology` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=armscii8;

--
-- 資料表的匯出資料 `sa_AssignTest`
--

INSERT INTO `sa_AssignTest` (`account`, `chinese`, `math`, `history`, `geography`, `civics`, `physical`, `chemical`, `biology`) VALUES
('mike840609', 90, 90, 90, 90, 90, 90, 90, 90),
('root', 98, 23, 24, 53, 45, 53, 66, 54);

-- --------------------------------------------------------

--
-- 資料表結構 `sa_BasicTest`
--

CREATE TABLE `sa_BasicTest` (
  `account` char(20) NOT NULL,
  `chinese` double NOT NULL,
  `english` double NOT NULL,
  `math` double NOT NULL,
  `society` double NOT NULL,
  `science` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=armscii8;

--
-- 資料表的匯出資料 `sa_BasicTest`
--

INSERT INTO `sa_BasicTest` (`account`, `chinese`, `english`, `math`, `society`, `science`) VALUES
('mike840609', 80, 32, 84, 24, 98);

-- --------------------------------------------------------

--
-- 資料表結構 `sa_EnglishListening`
--

CREATE TABLE `sa_EnglishListening` (
  `account` char(20) NOT NULL,
  `score` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=armscii8;

--
-- 資料表的匯出資料 `sa_EnglishListening`
--

INSERT INTO `sa_EnglishListening` (`account`, `score`) VALUES
('root', 80);

-- --------------------------------------------------------

--
-- 資料表結構 `sa_IndividualPay`
--

CREATE TABLE `sa_IndividualPay` (
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

CREATE TABLE `sa_Manager` (
  `account` char(20) NOT NULL,
  `sector` char(20) CHARACTER SET utf8 NOT NULL,
  `tel` char(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=armscii8;

--
-- 資料表的匯出資料 `sa_Manager`
--

INSERT INTO `sa_Manager` (`account`, `sector`, `tel`) VALUES
('root', '1', '0987109488');

-- --------------------------------------------------------

--
-- 資料表結構 `sa_School`
--

CREATE TABLE `sa_School` (
  `schoolcode` char(10) NOT NULL,
  `name` char(20) CHARACTER SET utf8 NOT NULL,
  `address` char(40) CHARACTER SET utf8 NOT NULL,
  `tel` char(20) CHARACTER SET utf8 NOT NULL,
  `person` char(10) CHARACTER SET utf8 NOT NULL,
  `personTel` char(20) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=armscii8;

-- --------------------------------------------------------

--
-- 資料表結構 `sa_TestPlace1`
--

CREATE TABLE `sa_TestPlace1` (
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

CREATE TABLE `student` (
  `account` char(20) CHARACTER SET armscii8 NOT NULL,
  `code` char(20) CHARACTER SET utf8 DEFAULT NULL,
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

INSERT INTO `student` (`account`, `code`, `id`, `name`, `sex`, `birth`, `tel`, `address`, `email`, `picture`) VALUES
('123', NULL, '000', '456', '男', '123', '123', '123', 'mike@gmail.com', NULL),
('123321', NULL, '12321', '哈', '女', '12321', '12321', '12321', 'mik@gmail.com', NULL),
('333', NULL, '4242', '12', '男', '09090909', '4242', '555', 'mike0987@gmail.com', NULL),
('mieeeee', NULL, '55665', '98', '男', 'eee', 'ee2e2e', 'mime', '8989@gmail.com', NULL),
('mike', NULL, '君', '拉拉拉', '男', '君', '君', '君', 'mike840609@gmail.com', NULL),
('root', '4', 'F128394859', '肥宅小鈞', '男', '1995/06/09', '0987109488', '輔仁大學', 'mike840609@gmail.com', '402401606.png'),
('vick', '1', 'f129893747', '黃政要', '女', '1995/08/23', '0912345678', '淡江大學', 'vick1@yahoo.com.tw', 'vick.png'),
('your code', NULL, 'f129507191', '姓名', '女', '840609', '0987109488', '新北市新莊區', '9876@gmail.com', NULL);

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
  MODIFY `articleID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
--
-- 使用資料表 AUTO_INCREMENT `product`
--
ALTER TABLE `product`
  MODIFY `ProductID` bigint(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- 使用資料表 AUTO_INCREMENT `purchaseorder`
--
ALTER TABLE `purchaseorder`
  MODIFY `POID` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- 使用資料表 AUTO_INCREMENT `salesorder`
--
ALTER TABLE `salesorder`
  MODIFY `SOID` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- 使用資料表 AUTO_INCREMENT `salesorderitem`
--
ALTER TABLE `salesorderitem`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
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
