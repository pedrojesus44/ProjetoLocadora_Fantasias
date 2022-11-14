-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 14-Nov-2022 às 04:58
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `clientes2`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cartao`
--

CREATE TABLE `cartao` (
  `numero_cartao` varchar(16) NOT NULL,
  `nome_titular` varchar(20) NOT NULL,
  `data_validade` varchar(5) NOT NULL,
  `cvv` int(3) NOT NULL,
  `bandeira_cartao` text NOT NULL,
  `id_pag` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `categoria`
--

CREATE TABLE `categoria` (
  `id_cat` int(4) NOT NULL,
  `tipo` text NOT NULL,
  `descricao` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientes`
--

CREATE TABLE `clientes` (
  `id_cli` int(4) NOT NULL,
  `email_cli` varchar(50) NOT NULL,
  `senha_cli` varchar(50) NOT NULL,
  `nome_cli` text NOT NULL,
  `data_nasc_cli` varchar(10) NOT NULL,
  `cep_cli` varchar(10) NOT NULL,
  `endereco_cli` text NOT NULL,
  `bairro_cli` text NOT NULL,
  `cidade_cli` text NOT NULL,
  `telefone_cli` varchar(16) NOT NULL,
  `cpf_cnpj` varchar(16) NOT NULL,
  `estado_cli` text NOT NULL,
  `apelido_nome_fantasia` varchar(30) NOT NULL,
  `tipo` enum('PF','PJ','ONG') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `clientes`
--

INSERT INTO `clientes` (`id_cli`, `email_cli`, `senha_cli`, `nome_cli`, `data_nasc_cli`, `cep_cli`, `endereco_cli`, `bairro_cli`, `cidade_cli`, `telefone_cli`, `cpf_cnpj`, `estado_cli`, `apelido_nome_fantasia`, `tipo`) VALUES
(1, 'A', '123', '', '', '', '', '', '', '', '', '', '', 'PF'),
(2, 'B', '456', '', '', '', '', '', '', '', '', '', '', 'PF');

-- --------------------------------------------------------

--
-- Estrutura da tabela `devolucao`
--

CREATE TABLE `devolucao` (
  `id_dev` int(4) NOT NULL,
  `situacao_prod_dev` longtext NOT NULL,
  `data_dev` varchar(10) NOT NULL,
  `id_cli` int(4) NOT NULL,
  `id_loc` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `dinheiro`
--

CREATE TABLE `dinheiro` (
  `troco` varchar(10) NOT NULL,
  `id_pag` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `id_fun` int(4) NOT NULL,
  `email_fun` varchar(50) NOT NULL,
  `senha_fun` int(20) NOT NULL,
  `nome_fun` text NOT NULL,
  `cargo_fun` text NOT NULL,
  `cod_fun` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`id_fun`, `email_fun`, `senha_fun`, `nome_fun`, `cargo_fun`, `cod_fun`) VALUES
(1, 'j', 123, 'jonas', 'vendedor', '555');

-- --------------------------------------------------------

--
-- Estrutura da tabela `item_locacao`
--

CREATE TABLE `item_locacao` (
  `id_pro` int(4) NOT NULL,
  `id_loc` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `locacao`
--

CREATE TABLE `locacao` (
  `id_loc` int(4) NOT NULL,
  `data_loc` varchar(10) NOT NULL,
  `id_cli` int(4) NOT NULL,
  `metodo_pag` text NOT NULL,
  `id_pag` int(4) NOT NULL,
  `hora_loc` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pagamento`
--

CREATE TABLE `pagamento` (
  `id_cli` int(4) NOT NULL,
  `id_pag` int(4) NOT NULL,
  `metodo_pag` text NOT NULL,
  `valor` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `id_pro` int(4) NOT NULL,
  `nome_pro` varchar(30) NOT NULL,
  `tipo_pro` varchar(15) NOT NULL,
  `tamanho_pro` varchar(10) NOT NULL,
  `id_cat` int(4) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`id_pro`, `nome_pro`, `tipo_pro`, `tamanho_pro`, `id_cat`) VALUES
(6, 'Fantasia do Pennywise', 'Terror', 'GG', NULL);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `cartao`
--
ALTER TABLE `cartao`
  ADD KEY `id_pag` (`id_pag`);

--
-- Índices para tabela `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id_cat`);

--
-- Índices para tabela `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id_cli`);

--
-- Índices para tabela `devolucao`
--
ALTER TABLE `devolucao`
  ADD PRIMARY KEY (`id_dev`),
  ADD KEY `id_cli` (`id_cli`);

--
-- Índices para tabela `dinheiro`
--
ALTER TABLE `dinheiro`
  ADD KEY `id_pag` (`id_pag`);

--
-- Índices para tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`id_fun`);

--
-- Índices para tabela `locacao`
--
ALTER TABLE `locacao`
  ADD PRIMARY KEY (`id_loc`),
  ADD KEY `id_cli` (`id_cli`);

--
-- Índices para tabela `pagamento`
--
ALTER TABLE `pagamento`
  ADD PRIMARY KEY (`id_pag`),
  ADD KEY `id_cli` (`id_cli`);

--
-- Índices para tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`id_pro`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id_cat` int(4) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id_cli` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `devolucao`
--
ALTER TABLE `devolucao`
  MODIFY `id_dev` int(4) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `id_fun` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `locacao`
--
ALTER TABLE `locacao`
  MODIFY `id_loc` int(4) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `pagamento`
--
ALTER TABLE `pagamento`
  MODIFY `id_pag` int(4) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `id_pro` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `cartao`
--
ALTER TABLE `cartao`
  ADD CONSTRAINT `cartao_ibfk_1` FOREIGN KEY (`id_pag`) REFERENCES `pagamento` (`id_pag`);

--
-- Limitadores para a tabela `devolucao`
--
ALTER TABLE `devolucao`
  ADD CONSTRAINT `devolucao_ibfk_1` FOREIGN KEY (`id_cli`) REFERENCES `clientes` (`id_cli`);

--
-- Limitadores para a tabela `dinheiro`
--
ALTER TABLE `dinheiro`
  ADD CONSTRAINT `dinheiro_ibfk_1` FOREIGN KEY (`id_pag`) REFERENCES `pagamento` (`id_pag`);

--
-- Limitadores para a tabela `locacao`
--
ALTER TABLE `locacao`
  ADD CONSTRAINT `locacao_ibfk_1` FOREIGN KEY (`id_cli`) REFERENCES `clientes` (`id_cli`);

--
-- Limitadores para a tabela `pagamento`
--
ALTER TABLE `pagamento`
  ADD CONSTRAINT `pagamento_ibfk_1` FOREIGN KEY (`id_cli`) REFERENCES `clientes` (`id_cli`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
