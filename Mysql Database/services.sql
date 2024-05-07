-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 07, 2024 at 03:56 PM
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
-- Database: `services`
--

-- --------------------------------------------------------

--
-- Table structure for table `bookings`
--

CREATE TABLE `bookings` (
  `id` int(10) UNSIGNED NOT NULL,
  `provider_id` int(10) UNSIGNED NOT NULL,
  `fname` varchar(255) NOT NULL,
  `lname` varchar(255) NOT NULL,
  `contact` varchar(20) NOT NULL,
  `adder` varchar(255) NOT NULL,
  `date` date NOT NULL,
  `payment` varchar(30) NOT NULL,
  `queries` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bookings`
--

INSERT INTO `bookings` (`id`, `provider_id`, `fname`, `lname`, `contact`, `adder`, `date`, `payment`, `queries`) VALUES
(1, 2, 'Arumugam', 'Pandaram', '234542123', 'CTM', '2024-04-26', 'cash', 'No Queries'),
(2, 3, 'Arjun', 'Raval', '3434124232', 'Vadodara Circle', '2024-04-30', 'cash', ''),
(3, 5, 'Mihir', 'Vagadiya', '4954895834', 'L.g Ground', '2024-04-30', 'cash', ''),
(4, 2, 'Devarsh', 'Dabhi', '5456466465', 'Ahmedabad', '2024-04-30', 'cash', ''),
(5, 5, 'Yash', 'Patel', '4134343144', 'Ahmedabad', '2024-05-01', 'cash', 'xyz');

-- --------------------------------------------------------

--
-- Table structure for table `providers`
--

CREATE TABLE `providers` (
  `id` int(10) UNSIGNED NOT NULL,
  `name` varchar(255) NOT NULL,
  `contact` varchar(20) NOT NULL,
  `descr` varchar(1000) NOT NULL,
  `adder1` varchar(255) NOT NULL,
  `adder2` varchar(255) NOT NULL,
  `city` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `photo` varchar(255) NOT NULL,
  `profession` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `providers`
--

INSERT INTO `providers` (`id`, `name`, `contact`, `descr`, `adder1`, `adder2`, `city`, `password`, `photo`, `profession`) VALUES
(2, 'Rohit Rathod', '7456321234', 'I am electrician and I am from ahmedabad', 'Maninagar', 'Vatva, Ahmedabad', 'Ahmedabad', 'rohit@123', '66305b5309e05.jpg', 'electrician'),
(3, 'Sameer Rizvi', '2349450030', 'I am Plumber', 'Vadodara', 'Vadodara', 'Vadodara', 'sameer@123', '662b06ba1673e.jpg', 'electrician'),
(4, 'Het', '7456212336', 'I am electrician', 'Rajkot Road', 'Rajkot', 'Rajkot', 'het@123', '662b03dbe8543.jpg', 'electrician'),
(5, 'Prashant', '3434023012', 'I am plumber', 'Maninagar', 'Ahmedabad', 'Ahmedabad', 'prashant@123', '662b04a04974c.jpg', 'plumber'),
(6, 'Manav', '5466544564', 'I am Mobile Repairer', 'Bapunagar', 'Ahmedabad', 'Ahmedabad', 'manav@123', '662b04e213c0e.jpg', 'mobile'),
(7, 'Rajeev', '3904929043', 'I am electrician', 'Amreli Road', 'Amreli', 'Amreli', 'rajeev@123', '662b0588c1800.jpg', 'electrician'),
(8, 'Yash', '3423421442', 'I am mobile repairer', 'Amreli Bazaar', 'Amreli', 'Amreli', 'yash@123', '662b05bfa8303.jpg', 'mobile'),
(9, 'Tarun', '3423442103', 'I am plumber', 'Amreli Circle', 'Amreli', 'Amreli', 'tarun@123', '662b05f166e15.jpg', 'plumber'),
(10, 'Mihir', '3034213123', 'I am Electrician and I am from Anand', 'Anand Road', 'Anand', 'Anand', 'mihir@123', '6630b210499af.jpg', 'electrician'),
(11, 'Manish', '123456789', 'Xyz', 'Anand Circle', 'Anand', 'Anand', 'manish@123', '6630b263e0ded.jpg', 'plumber');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bookings`
--
ALTER TABLE `bookings`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `providers`
--
ALTER TABLE `providers`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bookings`
--
ALTER TABLE `bookings`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `providers`
--
ALTER TABLE `providers`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
