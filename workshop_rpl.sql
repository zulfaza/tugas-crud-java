-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 16, 2021 at 11:25 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `workshop_rpl`
--

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `id` int(11) NOT NULL,
  `name` varchar(191) NOT NULL,
  `email` varchar(191) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`id`, `name`, `email`) VALUES
(1, 'Vanna Caudle', 'vcaudle0@skype.com'),
(2, 'Rozanna Stuttman', 'rstuttman1@sun.com'),
(3, 'Pru Koschke', 'pkoschke2@stumbleupon.com'),
(4, 'Roderich Bucksey', 'rbucksey3@tmall.com'),
(5, 'Iorgo Mingus', 'imingus4@mozilla.org'),
(6, 'Marcie Ing', 'ming5@ted.com'),
(7, 'Gwendolyn Simeoli', 'gsimeoli6@bing.com'),
(8, 'Vonny O\'Ruane', 'voruane7@last.fm'),
(9, 'Austine Ricold', 'aricold8@si.edu'),
(10, 'Ursala Duck', 'uduck9@example.com'),
(11, 'Devi Soeiro', 'dsoeiroa@360.cn'),
(12, 'Sammy Gildroy', 'sgildroyb@instagram.com'),
(13, 'Skyler Brockhouse', 'sbrockhousec@state.gov'),
(14, 'Tamas Crilley', 'tcrilleyd@irs.gov'),
(15, 'Gunar Slyne', 'gslynee@wired.com'),
(16, 'Parsifal Aartsen', 'paartsenf@wix.com'),
(17, 'Lian Brito', 'lbritog@list-manage.com'),
(18, 'Ynes Tomczykowski', 'ytomczykowskih@prweb.com'),
(19, 'Kariotta Male', 'kmalei@shop-pro.jp'),
(20, 'Emiline Qualtro', 'equaltroj@nifty.com'),
(21, 'Willy Matussow', 'wmatussowk@epa.gov'),
(22, 'Reggy Cristofolini', 'rcristofolinil@gizmodo.com'),
(23, 'Kata Crossgrove', 'kcrossgrovem@newyorker.com'),
(24, 'Dyanna O\'Hartagan', 'dohartagann@soundcloud.com'),
(25, 'Gael Smaling', 'gsmalingo@opensource.org');

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `id` int(11) NOT NULL,
  `name` varchar(191) NOT NULL,
  `price` varchar(191) NOT NULL,
  `stock` varchar(191) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`id`, `name`, `price`, `stock`) VALUES
(1, 'Chocolate - Sugar Free Semi Choc', '9977', '85'),
(2, 'Veal - Inside', '4319', '25'),
(3, 'Iced Tea - Lemon, 340ml', '8488', '53'),
(4, 'Wine - Cousino Macul Antiguas', '3828', '59'),
(5, 'Garbage Bags - Black', '8837', '33'),
(6, 'Kahlua', '2667', '81'),
(7, 'Cup - 4oz Translucent', '3651', '10'),
(8, 'Bay Leaf Ground', '4663', '4'),
(9, 'Stainless Steel Cleaner Vision', '8733', '38'),
(10, 'Wine - Duboeuf Beaujolais', '4049', '43'),
(11, 'Parsley - Dried', '7288', '31'),
(12, 'Calypso - Black Cherry Lemonade', '3581', '99'),
(13, 'Puree - Strawberry', '7117', '10'),
(14, 'Broom Handle', '6997', '29'),
(15, 'Uniform Linen Charge', '8717', '47'),
(16, 'Halibut - Steaks', '5659', '79'),
(17, 'Pork - Hock And Feet Attached', '2634', '79'),
(18, 'Bread - Frozen Basket Variety', '9113', '29'),
(19, 'Wine La Vielle Ferme Cote Du', '8015', '93'),
(20, 'Potatoes - Idaho 100 Count', '4135', '19'),
(21, 'Lentils - Red, Dry', '2650', '87'),
(22, 'Chocolate - Milk', '8295', '97'),
(23, 'Pasta - Rotini, Colour, Dry', '3611', '1'),
(24, 'Table Cloth 62x120 Colour', '3446', '39'),
(25, 'Chicken - Base', '3612', '40');

-- --------------------------------------------------------

--
-- Table structure for table `sellers`
--

CREATE TABLE `sellers` (
  `id` int(11) NOT NULL,
  `name` varchar(191) NOT NULL,
  `email` varchar(191) NOT NULL,
  `location` varchar(191) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sellers`
--

INSERT INTO `sellers` (`id`, `name`, `email`, `location`) VALUES
(1, 'Zacharia Shirer', 'zshirer0@ca.gov', 'Sausa'),
(2, 'Fons Kerton', 'fkerton1@reference.com', 'Nantes'),
(3, 'George Radden', 'gradden2@msu.edu', 'Kangalassy'),
(4, 'Silvain Malek', 'smalek3@yahoo.co.jp', 'Moijabana'),
(5, 'Pris Faulkes', 'pfaulkes4@soundcloud.com', 'Mocímboa'),
(6, 'Armin Coomer', 'acoomer5@stanford.edu', 'Dinititi'),
(7, 'Serena Patty', 'spatty6@auda.org.au', 'Ayía Triás'),
(8, 'Merilee Curryer', 'mcurryer7@yandex.ru', 'Gafanha da Encarnação'),
(9, 'Janene Oxberry', 'joxberry8@noaa.gov', 'Ergates'),
(10, 'Ester Zannetti', 'ezannetti9@hhs.gov', 'Tanggu'),
(11, 'Karena Fidock', 'kfidocka@homestead.com', 'Al Hadā'),
(12, 'Anastasie Figliovanni', 'afigliovannib@abc.net.au', 'Bela Vista'),
(13, 'Terrill Grivori', 'tgrivoric@home.pl', 'Неготино'),
(14, 'Audie Fripp', 'afrippd@wired.com', 'Sale'),
(15, 'Debora McGillivrie', 'dmcgillivriee@merriam-webster.com', 'Tsushima'),
(16, 'Dinah Gardner', 'dgardnerf@elegantthemes.com', 'Ilama'),
(17, 'Caralie Simpkiss', 'csimpkissg@edublogs.org', 'Jinshi'),
(18, 'Ali Biernat', 'abiernath@nih.gov', 'Mondokan'),
(19, 'Alexandros Gosneye', 'agosneyei@amazon.co.uk', 'Circa'),
(20, 'Martguerita Brader', 'mbraderj@engadget.com', 'Haukipudas'),
(21, 'Cosme Cockrem', 'ccockremk@rediff.com', 'San Andres'),
(22, 'Myrta Breed', 'mbreedl@livejournal.com', 'Velikooktyabr’skiy'),
(23, 'Wakefield de Nore', 'wdem@oakley.com', 'Živinice'),
(24, 'Dorthea McTeer', 'dmcteern@free.fr', 'Huocheng'),
(25, 'Nerita Sinfield', 'nsinfieldo@gnu.org', 'Raglan');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sellers`
--
ALTER TABLE `sellers`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customers`
--
ALTER TABLE `customers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `sellers`
--
ALTER TABLE `sellers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
