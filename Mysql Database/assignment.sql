-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 07, 2024 at 03:54 PM
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
-- Database: `assignment`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `CNM` int(11) NOT NULL,
  `CNAME` varchar(100) DEFAULT NULL,
  `CITY` varchar(100) DEFAULT NULL,
  `RATING` int(11) DEFAULT NULL,
  `SNo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`CNM`, `CNAME`, `CITY`, `RATING`, `SNo`) VALUES
(201, 'Hoffman', 'London', 100, 1001),
(202, 'Giovanne', 'Roe', 200, 1003),
(203, 'Liu', 'San Jose', 300, 1002),
(204, 'Grass', 'Barcelona', 100, 1002),
(206, 'Clemens', 'London', 300, 1007),
(207, 'Pereira', 'Roe', 100, 1004);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `Employee_id` int(11) DEFAULT NULL,
  `First_name` varchar(50) DEFAULT NULL,
  `Last_name` varchar(50) DEFAULT NULL,
  `Salary` int(11) DEFAULT NULL,
  `Joining_date` datetime DEFAULT NULL,
  `Department` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`Employee_id`, `First_name`, `Last_name`, `Salary`, `Joining_date`, `Department`) VALUES
(1, 'John', 'Abraham', 1000000, '2013-01-01 12:00:00', 'Banking'),
(2, 'Michael', 'Clarke', 800000, '2013-01-01 12:00:00', 'Insurance'),
(3, 'Roy', 'Thomas', 700000, '2013-02-01 12:00:00', 'Banking'),
(4, 'Tom', 'Jose', 600000, '2013-02-01 12:00:00', 'Insurance'),
(5, 'Jerry', 'Pinto', 650000, '2013-02-01 12:00:00', 'Insurance'),
(6, 'Philip', 'Mathew', 750000, '2013-01-01 12:00:00', 'Services'),
(7, 'TestName1', '123', 650000, '2013-01-01 12:00:00', 'Services'),
(8, 'TestName2', 'Lname%', 600000, '2013-02-01 12:00:00', 'Insurance');

--
-- Triggers `employee`
--
DELIMITER $$
CREATE TRIGGER `trg_InsertEmployee` AFTER INSERT ON `employee` FOR EACH ROW BEGIN
    INSERT INTO reminders 
    VALUES (NEW.employee_id, NEW.First_Name, NEW.Department); 
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `exam`
--

CREATE TABLE `exam` (
  `Rollno` int(11) DEFAULT NULL,
  `S_code` varchar(50) DEFAULT NULL,
  `Marks` int(11) DEFAULT NULL,
  `P_code` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `exam`
--

INSERT INTO `exam` (`Rollno`, `S_code`, `Marks`, `P_code`) VALUES
(1, 'CS11', 50, 'CS'),
(1, 'CS12', 60, 'CS'),
(2, 'EC101', 66, 'EC'),
(2, 'EC102', 70, 'EC'),
(3, 'EC101', 45, 'EC'),
(3, 'EC102', 50, 'EC');

-- --------------------------------------------------------

--
-- Table structure for table `incentive`
--

CREATE TABLE `incentive` (
  `Employee_ref_id` int(11) DEFAULT NULL,
  `Incentive_date` date DEFAULT NULL,
  `Incentive_amount` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `incentive`
--

INSERT INTO `incentive` (`Employee_ref_id`, `Incentive_date`, `Incentive_amount`) VALUES
(1, '2013-02-01', 5000),
(2, '2013-02-01', 3000),
(3, '2013-02-01', 4000),
(1, '2013-01-01', 4500),
(2, '2013-01-01', 3500);

-- --------------------------------------------------------

--
-- Table structure for table `item_mast`
--

CREATE TABLE `item_mast` (
  `PRO_ID` int(11) DEFAULT NULL,
  `PRO_NAME` varchar(100) DEFAULT NULL,
  `PRO_PRICE` float DEFAULT NULL,
  `PRO_COM` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `item_mast`
--

INSERT INTO `item_mast` (`PRO_ID`, `PRO_NAME`, `PRO_PRICE`, `PRO_COM`) VALUES
(101, 'Motherboard', 3200, 15),
(102, 'Key Board', 450, 16),
(103, 'ZIP Drive', 250, 14),
(104, 'Speaker', 550, 16),
(105, 'Monitor', 5000, 11),
(106, 'DVD Drive', 900, 12),
(107, 'CD Drive', 800, 12),
(108, 'Printer', 2600, 13),
(109, 'Refill cartridge', 350, 13),
(110, 'Mouse', 250, 12);

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `ord_no` int(11) DEFAULT NULL,
  `purch_amt` float DEFAULT NULL,
  `ord_date` date DEFAULT NULL,
  `customer_id` int(11) DEFAULT NULL,
  `salesman_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`ord_no`, `purch_amt`, `ord_date`, `customer_id`, `salesman_id`) VALUES
(70001, 150.5, '2012-10-05', 3005, 5002),
(70009, 270.65, '2012-09-10', 3001, 5005),
(70002, 65.26, '2012-10-05', 3002, 5001),
(70004, 110.5, '2012-08-17', 3009, 5003),
(70007, 948.5, '2012-09-10', 3005, 5002),
(70005, 2400.6, '2012-07-27', 3007, 5001),
(70008, 5760, '2012-09-10', 3002, 5001),
(70010, 1983.43, '2012-10-10', 3004, 5006),
(70003, 2480.4, '2012-10-10', 3009, 5003),
(70012, 250.45, '2012-06-27', 3008, 5002),
(70011, 75.29, '2012-08-17', 3003, 5007),
(70013, 3045.6, '2012-04-25', 3002, 5001);

-- --------------------------------------------------------

--
-- Table structure for table `reminders`
--

CREATE TABLE `reminders` (
  `id` int(11) DEFAULT NULL,
  `memberId` int(11) NOT NULL,
  `message` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `salesman_person`
--

CREATE TABLE `salesman_person` (
  `salesman_id` int(11) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `commision` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `salesman_person`
--

INSERT INTO `salesman_person` (`salesman_id`, `name`, `city`, `commision`) VALUES
(5001, 'James Hoog', 'New York', 0.15),
(5002, 'Nail Knite', 'Paris', 0.13),
(5005, 'Pit Alex', 'London', 0.11),
(5006, 'Mc Lyon', 'Paris', 0.14),
(5007, 'Paul Adam', 'Rome', 0.13),
(5003, 'Lauson Hen', 'San Jose', 0.12);

-- --------------------------------------------------------

--
-- Table structure for table `salesperson`
--

CREATE TABLE `salesperson` (
  `SNo` int(11) NOT NULL,
  `SNAME` varchar(50) DEFAULT NULL,
  `CITY` varchar(100) DEFAULT NULL,
  `COMM` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `salesperson`
--

INSERT INTO `salesperson` (`SNo`, `SNAME`, `CITY`, `COMM`) VALUES
(1001, 'Peel', 'London', '.12'),
(1002, 'Serres', 'San Jose', '.13'),
(1003, 'Axelrod', 'New York', '.1'),
(1004, 'Motika', 'London', '.11'),
(1007, 'Rafkin', 'Barcelona', '.15');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `Rollno` int(11) NOT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `Branch` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`Rollno`, `Name`, `Branch`) VALUES
(1, 'Jay', 'Computer Science'),
(2, 'Suhani', 'Electronic and Communications'),
(3, 'Kriti', 'Electronic and Communications');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`CNM`),
  ADD KEY `SNo` (`SNo`);

--
-- Indexes for table `exam`
--
ALTER TABLE `exam`
  ADD KEY `Rollno` (`Rollno`);

--
-- Indexes for table `reminders`
--
ALTER TABLE `reminders`
  ADD PRIMARY KEY (`memberId`);

--
-- Indexes for table `salesperson`
--
ALTER TABLE `salesperson`
  ADD PRIMARY KEY (`SNo`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`Rollno`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `customer`
--
ALTER TABLE `customer`
  ADD CONSTRAINT `customer_ibfk_1` FOREIGN KEY (`SNo`) REFERENCES `salesperson` (`SNo`);

--
-- Constraints for table `exam`
--
ALTER TABLE `exam`
  ADD CONSTRAINT `exam_ibfk_1` FOREIGN KEY (`Rollno`) REFERENCES `student` (`Rollno`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
