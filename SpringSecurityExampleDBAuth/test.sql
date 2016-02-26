-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 26, 2016 at 01:07 PM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 7.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `test`
--

-- --------------------------------------------------------

--
-- Table structure for table `comp_authorities`
--

CREATE TABLE `comp_authorities` (
  `username` varchar(50) NOT NULL,
  `authority` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `comp_authorities`
--

INSERT INTO `comp_authorities` (`username`, `authority`) VALUES
('rajesh', 'ROLE_ADMIN'),
('rabindra', 'ROLE_USER');

-- --------------------------------------------------------

--
-- Table structure for table `comp_users`
--

CREATE TABLE `comp_users` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `enabled` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `comp_users`
--

INSERT INTO `comp_users` (`username`, `password`, `enabled`) VALUES
('rabindra', '3f5857a46bd6f55f25f66d886c27e77495e6caa4', 1),
('rajesh', '7752275e1c8f83887a7250a33fbb2f146cc3babb', 1);

-- --------------------------------------------------------

--
-- Table structure for table `person`
--

CREATE TABLE `person` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `person`
--

INSERT INTO `person` (`id`, `name`) VALUES
(1, 'person-1'),
(2, 'person-2'),
(3, 'person-3'),
(4, 'person-4'),
(5, 'person-5'),
(6, 'person-6'),
(7, 'person-7'),
(8, 'person-8');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_student`
--

CREATE TABLE `tbl_student` (
  `ID` int(11) NOT NULL,
  `NAME` varchar(200) NOT NULL,
  `EMAIL` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_student`
--

INSERT INTO `tbl_student` (`ID`, `NAME`, `EMAIL`) VALUES
(16, 'Rajesh.Sethi India', 'rajesh.sethi@india.com'),
(23, 'Rajesh Sethi', 'rajesh.sethi@india.com'),
(24, 'Rajesh Sethi', 'rajesh.sethi@india.com'),
(25, 'Rajesh Sethi', 'rajesh.sethi@india.com'),
(26, 'Rajesh Sethi', 'rajesh.sethi@india.com'),
(27, 'Rajesh Sethi', 'rajesh.sethi@india.com'),
(28, 'Rajesh', 'kumarsethi.rajesh@gmail.com'),
(29, 'Rajesh Sethi', 'rajesh.sethi@india.com'),
(30, 'Rajesh', 'kumarsethi.rajesh@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `comp_users`
--
ALTER TABLE `comp_users`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `person`
--
ALTER TABLE `person`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_student`
--
ALTER TABLE `tbl_student`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `person`
--
ALTER TABLE `person`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `tbl_student`
--
ALTER TABLE `tbl_student`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
