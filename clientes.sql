-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 18-Out-2022 às 14:12
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `clientes`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbclientes`
--

CREATE TABLE `tbclientes` (
  `cod` int(255) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `dt_nasc` varchar(10) NOT NULL,
  `telefone` varchar(14) NOT NULL,
  `email` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbclientes`
--

INSERT INTO `tbclientes` (`cod`, `nome`, `dt_nasc`, `telefone`, `email`) VALUES
(1, 'Antonio', '17/03/1939', '1111-1111', 'antonio@antonio.com.br'),
(2, 'Edna', '27/03/1969', '2222-2222', 'edna@edna.com.br'),
(3, 'Gustavo', '27/05/2000', '3333-3333', 'hustavo@gustavo.com.br'),
(4, 'aaaaaaa', '01/01/2001', '4444-4444', 'aaa@aaa.com.br'),
(5, 'bbbbb', '02/02/2002', '5555-5555', 'bbb@bbb.com.br');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbusuario`
--

CREATE TABLE `tbusuario` (
  `usuario` varchar(50) NOT NULL,
  `senha` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbusuario`
--

INSERT INTO `tbusuario` (`usuario`, `senha`) VALUES
('A', '123'),
('B', '456');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tbclientes`
--
ALTER TABLE `tbclientes`
  ADD PRIMARY KEY (`cod`);

--
-- Índices para tabela `tbusuario`
--
ALTER TABLE `tbusuario`
  ADD PRIMARY KEY (`senha`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tbclientes`
--
ALTER TABLE `tbclientes`
  MODIFY `cod` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
