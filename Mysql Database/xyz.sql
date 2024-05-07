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
-- Database: `xyz`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer1`
--

CREATE TABLE `customer1` (
  `cust_id` int(11) DEFAULT NULL,
  `cust_name` varchar(50) DEFAULT NULL,
  `cust_no` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer1`
--

INSERT INTO `customer1` (`cust_id`, `cust_name`, `cust_no`) VALUES
(1, 'Arumugam', 744242121),
(2, 'Rehan', 855745),
(3, 'Daksh', 4556656),
(4, 'Chaitanya', 454545212),
(5, 'Santosh', 4242412),
(6, 'Manish', 412125);

-- --------------------------------------------------------

--
-- Table structure for table `customer2`
--

CREATE TABLE `customer2` (
  `products` varchar(20) DEFAULT NULL,
  `cust_name` varchar(50) DEFAULT NULL,
  `cust_rating` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer2`
--

INSERT INTO `customer2` (`products`, `cust_name`, `cust_rating`) VALUES
('Ghee', 'Arumugam', 5),
('Curd', 'Rehan', 4),
('Wafers', 'Daksh', 4),
('Oil', 'Chaitanya', 5),
('Milk', 'Santosh', 3),
('Vegetables', 'Manish', 4);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `Emp_id` int(11) DEFAULT NULL,
  `Emp_name` varchar(50) DEFAULT NULL,
  `Salary` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`Emp_id`, `Emp_name`, `Salary`) VALUES
(2103, 'Arumugam', 50000),
(4112, 'Ajay', 40000),
(4254, 'Rahul', 35000),
(3212, 'Neha', 15000),
(6782, 'Arun', 20000),
(8654, 'Amritha', 41000),
(5673, 'Balu', 28000),
(1423, 'Riya', 50000),
(9023, 'Tara', 38000),
(7543, 'Raghav', 32000),
(5876, 'Utsav', 18000),
(3298, 'Rehan', 70000),
(4197, 'Harsh', 22000),
(5739, 'Yashasvi', 40000),
(8518, 'Vatsal', 36000);

-- --------------------------------------------------------

--
-- Table structure for table `emp_details`
--

CREATE TABLE `emp_details` (
  `emp_id` int(11) DEFAULT NULL,
  `emp_name` varchar(50) DEFAULT NULL,
  `supervisor_id` int(11) DEFAULT NULL,
  `emp_salary` int(11) DEFAULT NULL,
  `emp_rating` int(11) DEFAULT NULL,
  `emp_email` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `emp_details`
--

INSERT INTO `emp_details` (`emp_id`, `emp_name`, `supervisor_id`, `emp_salary`, `emp_rating`, `emp_email`) VALUES
(1, 'Arumugam', 805, 45000, 3, 'abcgmailcom'),
(2, 'Sahil', 806, 35000, 4, 'xyzgmailcom'),
(3, 'Ajaz', 807, 50000, 2, 'rezgmailcom'),
(4, 'Tara', 808, 15000, 5, 'erqgmailcom'),
(5, 'Jaimin', 809, 40000, 4, 'twqgmailcom'),
(6, 'Riya', 810, 48000, 4, 'saxgmailcom'),
(7, 'Ajay', 811, 41123, 3, 'fdagmailcom'),
(8, 'Harsh', 812, 55000, 5, 'hfdgmailcom');

-- --------------------------------------------------------

--
-- Table structure for table `people`
--

CREATE TABLE `people` (
  `Date` date NOT NULL,
  `LastName` varchar(250) NOT NULL,
  `FirstName` varchar(250) DEFAULT NULL,
  `Age` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `people`
--

INSERT INTO `people` (`Date`, `LastName`, `FirstName`, `Age`) VALUES
('2024-02-20', '[value-2]', '[value-3]', 0),
('2024-03-14', '', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `person`
--

CREATE TABLE `person` (
  `per_ID` int(20) DEFAULT NULL,
  `PersonName` varchar(50) DEFAULT NULL,
  `ContactNo` int(11) DEFAULT NULL,
  `PerID` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `supervisor_details`
--

CREATE TABLE `supervisor_details` (
  `supervisor_id` int(11) DEFAULT NULL,
  `supervisor_name` varchar(100) DEFAULT NULL,
  `contact_no` int(11) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `supervisor_details`
--

INSERT INTO `supervisor_details` (`supervisor_id`, `supervisor_name`, `contact_no`, `last_name`) VALUES
(805, 'Rahul', 7452123, 'Vaza'),
(806, 'Vimal', 4522112, 'Rathod'),
(807, 'Sameer ', 5646658, 'Chauhan'),
(808, 'Anirudh', 4211224, 'Dodiya'),
(809, 'Pradeep', 1232351, 'Gamit'),
(810, 'Nehal', 4213212, 'Chowdhary'),
(811, 'Minal', 4122333, 'Chauhan'),
(812, 'Prashant', 4774562, 'Modi');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `people`
--
ALTER TABLE `people`
  ADD PRIMARY KEY (`Date`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
