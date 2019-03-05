-- phpMyAdmin SQL Dump
-- version 4.0.4.2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 05-03-2019 a las 08:17:47
-- Versión del servidor: 5.6.13
-- Versión de PHP: 5.4.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `bdpersonas`
--
CREATE DATABASE IF NOT EXISTS `bdpersonas` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `bdpersonas`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personas`
--

CREATE TABLE IF NOT EXISTS `personas` (
  `Nombre` varchar(15) NOT NULL,
  `Edad` int(3) NOT NULL,
  `Profesión` varchar(15) NOT NULL,
  `Telefono` int(9) NOT NULL,
  PRIMARY KEY (`Nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `personas`
--

INSERT INTO `personas` (`Nombre`, `Edad`, `Profesión`, `Telefono`) VALUES
('Aaaaaaaa', 1, 'aaaaaaaaaa', 98),
('hdg', 1, 'kbgjef', 2),
('j', 1, 'j', 1),
('julen', 20, 'estudiane', 987654321),
('k', 54, 'k', 45215),
('q', 34, 'dqawd', 12423354);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
