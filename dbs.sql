

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `dbs`
--
CREATE DATABASE IF NOT EXISTS `dbs` DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;
USE `dbs`;

-- --------------------------------------------------------

--
-- Table structure for table `articles`
--

CREATE TABLE IF NOT EXISTS `articles` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `header` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `thumbnail` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `brief` varchar(350) COLLATE utf8_unicode_ci NOT NULL,
  `detail` text COLLATE utf8_unicode_ci NOT NULL,
  `time` datetime NOT NULL,
  `post_by` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=2 ;

--
-- Dumping data for table `articles`
--

INSERT INTO `articles` (`id`, `header`, `thumbnail`, `brief`, `detail`, `time`, `post_by`) VALUES
(2, 'Lorem ipsum dolor sit amet, consectetur adipiscing elit.', '', 
'Fusce nec nisl nec sem ornare rutrum. Suspendisse vestibulum hendrerit orci in laoreet. Nam semper dui in felis efficitur imperdiet. Aliquam quis magna felis.', 
'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce nec nisl nec sem ornare rutrum. Suspendisse vestibulum hendrerit orci in laoreet. Nam semper dui in felis efficitur imperdiet. Aliquam quis magna felis. Aenean at dolor eget ligula aliquam pharetra sed nec velit. Nunc eget augue ac lectus condimentum gravida fringilla in risus. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed aliquam, urna non fringilla aliquet, turpis lacus hendrerit nulla, vitae feugiat nibh ligula at magna. Ut ultrices est in lectus rutrum posuere. Donec et mauris bibendum, gravida nisi ac, pulvinar risus. Sed est urna, feugiat ac mattis rhoncus, molestie in urna. Mauris lacinia mollis tempor. Duis eu turpis lectus. Vivamus eu condimentum libero, non tincidunt lacus. Nam placerat auctor felis.\r\n\r\n\r\n\r\nLorem Ipsum',
 '0000-00-00 00:00:00', '');


-- --------------------------------------------------------

--
-- Table structure for table `order`
--

CREATE TABLE IF NOT EXISTS `order` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `full_name` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `address` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `phone` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `prd_id` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `prd_name` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `prd_quan` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `prd_cost` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `status` int(10) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=8 ;

--
-- Dumping data for table `order`
--

INSERT INTO `order` (`id`, `user_id`, `full_name`, `address`, `phone`, `prd_id`, `prd_name`, `prd_quan`, `prd_cost`, `status`) VALUES
(2, '2', 'Nam Le', 'Ahventie', '0465672627', '3', 'Pancake', '5', '160000', 0),
(3, '', 'Julia Malmberg', 'Siuntio', '0400395507', '10', 'Gato', '3', '135000', 0),
(4, '3', 'Cajsa', 'Helsinki', '0412345678', '11', 'Cup', '6', '90000', 0),
(5, '3', 'Cajsa', 'Helsinki', '0412345678', '10', 'Panadol', '4', '180000', 0),
(6, '', 'Julia Malmberg', 'Siuntio', '0400395507', '10', 'Gato', '3', '135000', 0),
(7, '', 'James Bond', 'Manchester England', '007', '11', 'Cup Minions', '6', '90000', 0);

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE IF NOT EXISTS `products` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `type` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `brief` varchar(350) COLLATE utf8_unicode_ci NOT NULL,
  `detail` text COLLATE utf8_unicode_ci NOT NULL,
  `ingredient` varchar(350) COLLATE utf8_unicode_ci NOT NULL,
  `price` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=13 ;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`id`, `name`, `type`, `brief`, `detail`, `ingredient`, `price`) VALUES
(1, 'Batik cake', 'Cake', 'Corn flour, butter, sugar, and vanilla', 'Angel food cake, or angel cake, is a type of sponge cake made with egg whites, flour, and sugar. A whipping agent, such as cream of tartar is commonly added. It differs from other cakes because it uses no butter. Its structure comes from whipped egg whites known as a protein foam. ', 'Sponge cake, cream', 10),
(2, 'Batik cake', 'Cake', 'Corn flour, butter, sugar, and vanilla', 'Angel food cake, or angel cake, is a type of sponge cake made with egg whites, flour, and sugar. A whipping agent, such as cream of tartar is commonly added. It differs from other cakes because it uses no butter. Its structure comes from whipped egg whites known as a protein foam. ', 'Sponge cake, cream', 10),
(3, 'Apple cake', 'Cake', 'Apple, caramel icing', 'Angel food cake, or angel cake, is a type of sponge cake made with egg whites, flour, and sugar. A whipping agent, such as cream of tartar is commonly added. It differs from other cakes because it uses no butter. Its structure comes from whipped egg whites known as a protein foam. ', 'Sponge cake, cream', 1),
(4, 'Applesauce cake', 'Cake', 'Prepared using apple sauce, flour and sugar as primary ingredients', 'Angel food cake, or angel cake, is a type of sponge cake made with egg whites, flour, and sugar. A whipping agent, such as cream of tartar is commonly added. It differs from other cakes because it uses no butter. Its structure comes from whipped egg whites known as a protein foam. ', 'Sponge cake, cream', 4),
(5, 'Aranygaluska', 'Cake', 'A cake with yeasty dough and vanilla custard', 'Angel food cake, or angel cake, is a type of sponge cake made with egg whites, flour, and sugar. A whipping agent, such as cream of tartar is commonly added. It differs from other cakes because it uses no butter. Its structure comes from whipped egg whites known as a protein foam. ', 'Sponge cake, cream', 7),
(6, 'Avocado cake', 'Cake', 'Prepared using avocado as a primary ingredient', 'Angel food cake, or angel cake, is a type of sponge cake made with egg whites, flour, and sugar. A whipping agent, such as cream of tartar is commonly added. It differs from other cakes because it uses no butter. Its structure comes from whipped egg whites known as a protein foam. ', 'Sponge cake, cream', 6),
(9, 'Batik cake', 'Cake', 'Corn flour, butter, sugar, and vanilla', 'Angel food cake, or angel cake, is a type of sponge cake made with egg whites, flour, and sugar. A whipping agent, such as cream of tartar is commonly added. It differs from other cakes because it uses no butter. Its structure comes from whipped egg whites known as a protein foam. ', 'Sponge cake, cream', 9),
(10, 'Batik cake', 'Cake', 'Corn flour, butter, sugar, and vanilla', 'Angel food cake, or angel cake, is a type of sponge cake made with egg whites, flour, and sugar. A whipping agent, such as cream of tartar is commonly added. It differs from other cakes because it uses no butter. Its structure comes from whipped egg whites known as a protein foam. ', 'Sponge cake, cream', 10),
(11, 'Boston cream pie', 'Cup', 'Prepared using banana as a primary ingredient', 'Angel food cake, or angel cake, is a type of sponge cake made with egg whites, flour, and sugar. A whipping agent, such as cream of tartar is commonly added. It differs from other cakes because it uses no butter. Its structure comes from whipped egg whites known as a protein foam. ', 'Sponge cake, cream', 5),
(12, 'Banoffee pie', 'Cup', '	Flour, sugar, ghee (clarified butter), coconut milk, egg yolk', 'Angel food cake, or angel cake, is a type of sponge cake made with egg whites, flour, and sugar. A whipping agent, such as cream of tartar is commonly added. It differs from other cakes because it uses no butter. Its structure comes from whipped egg whites known as a protein foam. ', 'Sponge cake, cream', 8),
(7, 'Bara brith', 'Cup', '	Chocolate or yellow cake, sugar mixture, various fillings', 'Angel food cake, or angel cake, is a type of sponge cake made with egg whites, flour, and sugar. A whipping agent, such as cream of tartar is commonly added. It differs from other cakes because it uses no butter. Its structure comes from whipped egg whites known as a protein foam. ', 'Sponge cake, cream', 9),
(8, 'Battenberg cake', 'Cup', 'Egg custard, chocolate', 'Angel food cake, or angel cake, is a type of sponge cake made with egg whites, flour, and sugar. A whipping agent, such as cream of tartar is commonly added. It differs from other cakes because it uses no butter. Its structure comes from whipped egg whites known as a protein foam. ', 'Sponge cake, cream', 3);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `role` int(10) NOT NULL DEFAULT '0',
  `full_name` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `address` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `phone` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `purchased` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=6 ;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `role`, `full_name`, `address`, `phone`, `purchased`) VALUES
(1, 'admin', 'superman0203', 1, 'Admin', 'Ahventie, Vaasa', '0465672627', 0),
(2, 'namle', 'superman0203', 0, '', 'Ahventie', '0465672627', 0),
(3, 'juliamalmberg', 'malmbergjulia', 0, 'Julia Malmberg', 'Siuntio', '0400395507', 0),
(4, '$newUser', '$newPass1Enc', 0, '$newFullName', '$newAddr', '$newPhone', 0),
(5, 'blabla', '123', 0, '', '', '', 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
