-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 25-08-2020 a las 18:22:10
-- Versión del servidor: 10.3.16-MariaDB
-- Versión de PHP: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `Facturacion`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulo`
--

CREATE TABLE `articulo` (
  `id_articulo` int(11) NOT NULL,
  `ref_articulo` varchar(30) NOT NULL,
  `descripcion` varchar(30) NOT NULL,
  `precio_venta` int(11) NOT NULL,
  `precio_costo` int(11) NOT NULL,
  `stock` int(11) NOT NULL,
  `cod_tipo_articulo` int(11) NOT NULL,
  `cod_proveedor` varchar(20) NOT NULL,
  `fecha_ingreso` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `articulo`
--

INSERT INTO `articulo` (`id_articulo`, `ref_articulo`, `descripcion`, `precio_venta`, `precio_costo`, `stock`, `cod_tipo_articulo`, `cod_proveedor`, `fecha_ingreso`) VALUES
(1, '--', '--', 0, 0, 1, 1, '12345', '2012-11-03'),
(2, '1234', 'Bota corta', 70000, 50000, 12, 19, '12345', '2012-10-11'),
(3, '2468', 'Botin ', 150000, 130000, 9, 19, '12345', '2012-09-01'),
(4, '0987', 'Tenis ', 120000, 100000, 18, 20, '12345', '18/6/2020'),
(5, '2050', 'Zandalias', 50000, 30000, 33, 21, '12345', '2012-11-01'),
(6, '1020', 'Jeans', 90000, 70000, 18, 24, '12345', '2012-10-02'),
(7, '2345', 'Camisas', 50000, 30000, 4, 22, '12345', '2012-10-20'),
(8, '0907', 'Chaquetas', 70000, 50000, 6, 24, '12345', '2012-11-02'),
(9, '0540', 'Chaquetas sudadera', 60000, 40000, 18, 23, '12345', '2012-10-23'),
(10, '5568', 'Pantalon sudadera', 60000, 40000, 17, 23, '12345', '2012-10-23'),
(11, '9913', 'Sudadera completa', 100000, 80000, 20, 23, '12345', '2012-10-23'),
(12, '3365', 'Camisetas', 30000, 20000, 30, 24, '12345', '13/6/2020'),
(17, '1993', 'pruebas', 10000, 5000, 9, 20, '12345', '29/6/2020');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudad`
--

CREATE TABLE `ciudad` (
  `Codigo_ciudad` int(11) NOT NULL,
  `Nombre_ciudad` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `ciudad`
--

INSERT INTO `ciudad` (`Codigo_ciudad`, `Nombre_ciudad`) VALUES
(1, 'POPAYAN'),
(2, 'CALI'),
(3, 'PASTO'),
(4, 'MEDELLIN'),
(5, 'BOGOTA'),
(6, 'BARRANQUILLA'),
(7, 'CARTAGENA'),
(8, 'ARAUCA'),
(9, 'BALBOA'),
(10, 'BELALCAZAR'),
(11, 'BETANIA'),
(12, 'BOLIVAR'),
(13, 'BUCARAMANGA'),
(14, 'BUENAVENTURA'),
(15, 'CUCUTA'),
(16, 'CALDAS'),
(17, 'CAQUETA'),
(18, 'CERRITO'),
(19, 'CHIA'),
(20, 'CORDOBA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL,
  `Documento` varchar(15) NOT NULL,
  `cod_tipo_documento` int(11) NOT NULL,
  `Nombres` varchar(20) NOT NULL,
  `Apellidos` varchar(20) NOT NULL,
  `Direccion` varchar(20) NOT NULL,
  `cod_ciudad` int(11) NOT NULL,
  `Telefono` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `Documento`, `cod_tipo_documento`, `Nombres`, `Apellidos`, `Direccion`, `cod_ciudad`, `Telefono`) VALUES
(1, '12345', 1, 'N/A', 'N/A', 'N/A', 2, 'N/A'),
(2, '66816119', 1, 'Ana Maria', 'Franco Cardenas', 'cra 41 D # 18 - 34', 2, '3240056');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalleFactura`
--

CREATE TABLE `detalleFactura` (
  `id_detalle` int(11) NOT NULL,
  `cod_factura` varchar(15) CHARACTER SET latin1 NOT NULL,
  `cod_articulo` int(11) NOT NULL,
  `cod_servicio` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `detalleFactura`
--

INSERT INTO `detalleFactura` (`id_detalle`, `cod_factura`, `cod_articulo`, `cod_servicio`, `cantidad`, `total`) VALUES
(1, 'FACT-00001', 1, 3, 1, 20000),
(2, 'FACT-00002', 2, 1, 1, 70000),
(3, 'FACT-00002', 3, 1, 1, 150000),
(4, 'FACT-00003', 17, 1, 1, 10000),
(5, 'FACT-00004', 1, 2, 1, 15000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `devolucion`
--

CREATE TABLE `devolucion` (
  `id_devolucion` int(11) NOT NULL,
  `id_detalle` int(11) NOT NULL,
  `Mot_devolucion` varchar(50) NOT NULL,
  `fec_devolucion` varchar(15) NOT NULL,
  `cant_devolucion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `devolucion`
--

INSERT INTO `devolucion` (`id_devolucion`, `id_detalle`, `Mot_devolucion`, `fec_devolucion`, `cant_devolucion`) VALUES
(1, 3, 'Cambio a nuevo producto', '30/5/2020', 1),
(2, 5, 'fdf', '17/6/2020', 1),
(3, 3, 'prueba', '17/6/2020', 1),
(4, 4, 'prueba', '18/6/2020', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturas`
--

CREATE TABLE `facturas` (
  `Nnm_factura` varchar(15) CHARACTER SET latin1 NOT NULL,
  `cod_cliente` int(11) NOT NULL,
  `Id_usuario` int(11) NOT NULL,
  `fecha_facturacion` varchar(15) NOT NULL,
  `cod_formapago` int(11) NOT NULL,
  `total_factura` int(11) NOT NULL,
  `IVA` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `facturas`
--

INSERT INTO `facturas` (`Nnm_factura`, `cod_cliente`, `Id_usuario`, `fecha_facturacion`, `cod_formapago`, `total_factura`, `IVA`) VALUES
('FACT-00001', 1, 1, '30/6/2020', 1, 20000, 3800),
('FACT-00002', 1, 1, '30/6/2020', 1, 220000, 41800),
('FACT-00003', 1, 1, '1/7/2020', 1, 10000, 1900),
('FACT-00004', 2, 1, '25/8/2020', 3, 15000, 2850);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `forma_de_pago`
--

CREATE TABLE `forma_de_pago` (
  `id_formapago` int(11) NOT NULL,
  `Descripcion_formapago` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `forma_de_pago`
--

INSERT INTO `forma_de_pago` (`id_formapago`, `Descripcion_formapago`) VALUES
(1, 'EFECTIVO'),
(2, 'BONO'),
(3, 'TARJETA DE CREDITO'),
(4, 'CHEQUE'),
(5, '--');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pago_tarjeta`
--

CREATE TABLE `pago_tarjeta` (
  `id_pag_tarjeta` int(11) NOT NULL,
  `id_tip_tarjeta` int(11) NOT NULL,
  `Nnm_factura` varchar(15) CHARACTER SET latin1 NOT NULL,
  `Num_aprovacion` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `No_documento` varchar(20) NOT NULL,
  `cod_tipo_documento` int(11) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Apellido` varchar(20) NOT NULL,
  `Nombre_comercial` varchar(20) NOT NULL,
  `direccion` varchar(20) DEFAULT NULL,
  `cod_ciudad` int(11) NOT NULL,
  `Telefono` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`No_documento`, `cod_tipo_documento`, `Nombre`, `Apellido`, `Nombre_comercial`, `direccion`, `cod_ciudad`, `Telefono`) VALUES
('12345', 4, 'sebas', 'marin', 'proveedor1', 'cra 41D# 18-34', 1, '3240056');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reportes`
--

CREATE TABLE `reportes` (
  `id_reporte` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `fec_reporte` varchar(20) CHARACTER SET latin1 NOT NULL,
  `val_ini_reporter` int(11) NOT NULL,
  `val_ven_reporte` int(11) NOT NULL,
  `val_usu_reporte` int(11) NOT NULL,
  `dife_reporte` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `reportes`
--

INSERT INTO `reportes` (`id_reporte`, `id_usuario`, `fec_reporte`, `val_ini_reporter`, `val_ven_reporte`, `val_usu_reporte`, `dife_reporte`) VALUES
(1, 1, '18/6/2020', 100000, 100000, 100000, 100000),
(2, 1, '19/6/2020', 100000, 70000, 170000, 0),
(4, 1, '27/6/2020', 105000, 405000, 300000, 210000),
(6, 1, '28/6/2020', 105000, 230000, 30000, 305000),
(7, 3, '1/7/2020', 100000, 0, 0, 0),
(8, 1, '25/8/2020', 205000, 15000, 220000, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Roles`
--

CREATE TABLE `Roles` (
  `codigo_rol` int(11) NOT NULL,
  `Descripcion_rol` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `Roles`
--

INSERT INTO `Roles` (`codigo_rol`, `Descripcion_rol`) VALUES
(1, 'ADMINISTRADOR'),
(2, 'VENDEDOR');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Rutas`
--

CREATE TABLE `Rutas` (
  `Id_ruta` int(11) NOT NULL,
  `Nomb_ruta` varchar(15) NOT NULL,
  `Desc_ruta` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `Rutas`
--

INSERT INTO `Rutas` (`Id_ruta`, `Nomb_ruta`, `Desc_ruta`) VALUES
(1, 'FACTURA', '/home/marco/Documentos/proyecto/Facturacion/facturacion/test/Plantilla/'),
(2, 'GFACTURA', '/home/marco/Documentos/proyecto/Facturacion/facturacion/test/Facturas/'),
(3, 'REPORTES', '/home/marco/Documentos/reportes/');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `id_servicio` int(11) NOT NULL,
  `ref_servicio` varchar(30) CHARACTER SET latin1 NOT NULL,
  `desc_servicio` varchar(200) NOT NULL,
  `valor_servicio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `servicio`
--

INSERT INTO `servicio` (`id_servicio`, `ref_servicio`, `desc_servicio`, `valor_servicio`) VALUES
(1, '--', '--', 0),
(2, '1234', 'Baño', 15000),
(3, '2468', 'Desparacitacion', 20000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_articulo`
--

CREATE TABLE `tipo_articulo` (
  `id_tipoarticulo` int(11) NOT NULL,
  `descripcion_articulo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipo_articulo`
--

INSERT INTO `tipo_articulo` (`id_tipoarticulo`, `descripcion_articulo`) VALUES
(1, '--'),
(19, 'ZAPATO FORMAL'),
(20, 'ZAPATO DEPORTIVO'),
(21, 'ZAPATO INFORMAL '),
(22, 'PRENDA FORMAL'),
(23, 'PRENDA DEPORTIVA'),
(24, 'PRENDA INFORMAL');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_de_documento`
--

CREATE TABLE `tipo_de_documento` (
  `id_tipo_documento` int(11) NOT NULL,
  `Descripcion` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipo_de_documento`
--

INSERT INTO `tipo_de_documento` (`id_tipo_documento`, `Descripcion`) VALUES
(1, 'CC'),
(2, 'TI'),
(3, 'RC'),
(4, 'NIT'),
(5, 'PASAPORTE'),
(6, 'CE'),
(7, 'RUT');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_tarjeta`
--

CREATE TABLE `tipo_tarjeta` (
  `id_tip_tarjeta` int(11) NOT NULL,
  `des_tip_tarjeta` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tipo_tarjeta`
--

INSERT INTO `tipo_tarjeta` (`id_tip_tarjeta`, `des_tip_tarjeta`) VALUES
(1, 'VISA'),
(2, 'MASTERCARD'),
(3, 'DINERSCLUB'),
(4, 'AMERICANEXPRESS');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `Id_usuario` int(11) NOT NULL,
  `Documento` varchar(15) NOT NULL,
  `Cod_tipo_documento` int(11) NOT NULL,
  `Nombres` varchar(30) NOT NULL,
  `Apellidos` varchar(30) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Direccion` varchar(30) NOT NULL,
  `Cod_ciudad` int(11) NOT NULL,
  `Telefono` varchar(20) NOT NULL,
  `Cod_rol` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`Id_usuario`, `Documento`, `Cod_tipo_documento`, `Nombres`, `Apellidos`, `Password`, `Direccion`, `Cod_ciudad`, `Telefono`, `Cod_rol`) VALUES
(1, '1144063427', 1, 'Marco Antonio', 'Marin', 'admin1234', 'Cra 41 D # 18-34', 2, '3240056', 1),
(3, '93072613625', 1, 'Santiago', 'Obando', 'santi123', 'Kra 41 D # 18 - 34', 2, '3350173', 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `articulo`
--
ALTER TABLE `articulo`
  ADD PRIMARY KEY (`id_articulo`),
  ADD KEY `ref_tipo_articulo_idx` (`cod_tipo_articulo`),
  ADD KEY `ref_prov_art_idx` (`cod_proveedor`);

--
-- Indices de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  ADD PRIMARY KEY (`Codigo_ciudad`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`),
  ADD KEY `cod_tipo_documento` (`cod_tipo_documento`),
  ADD KEY `cod_ciudad` (`cod_ciudad`);

--
-- Indices de la tabla `detalleFactura`
--
ALTER TABLE `detalleFactura`
  ADD PRIMARY KEY (`id_detalle`),
  ADD KEY `cod_servicio` (`cod_servicio`),
  ADD KEY `cod_articulo` (`cod_articulo`),
  ADD KEY `cod_factura` (`cod_factura`);

--
-- Indices de la tabla `devolucion`
--
ALTER TABLE `devolucion`
  ADD PRIMARY KEY (`id_devolucion`),
  ADD KEY `id_detalle` (`id_detalle`);

--
-- Indices de la tabla `facturas`
--
ALTER TABLE `facturas`
  ADD PRIMARY KEY (`Nnm_factura`),
  ADD KEY `cod_cliente` (`cod_cliente`),
  ADD KEY `Id_usuario` (`Id_usuario`),
  ADD KEY `cod_formapago` (`cod_formapago`);

--
-- Indices de la tabla `forma_de_pago`
--
ALTER TABLE `forma_de_pago`
  ADD PRIMARY KEY (`id_formapago`);

--
-- Indices de la tabla `pago_tarjeta`
--
ALTER TABLE `pago_tarjeta`
  ADD KEY `id_tip_tarjeta` (`id_tip_tarjeta`),
  ADD KEY `Nnm_factura` (`Nnm_factura`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`No_documento`),
  ADD KEY `ref_prov_ciudad_idx` (`cod_ciudad`),
  ADD KEY `proveedor_ibfk_1` (`cod_tipo_documento`);

--
-- Indices de la tabla `reportes`
--
ALTER TABLE `reportes`
  ADD PRIMARY KEY (`id_reporte`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- Indices de la tabla `Roles`
--
ALTER TABLE `Roles`
  ADD PRIMARY KEY (`codigo_rol`);

--
-- Indices de la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD PRIMARY KEY (`id_servicio`);

--
-- Indices de la tabla `tipo_articulo`
--
ALTER TABLE `tipo_articulo`
  ADD PRIMARY KEY (`id_tipoarticulo`);

--
-- Indices de la tabla `tipo_de_documento`
--
ALTER TABLE `tipo_de_documento`
  ADD PRIMARY KEY (`id_tipo_documento`);

--
-- Indices de la tabla `tipo_tarjeta`
--
ALTER TABLE `tipo_tarjeta`
  ADD PRIMARY KEY (`id_tip_tarjeta`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`Id_usuario`) USING BTREE,
  ADD KEY `Cod_rol` (`Cod_rol`),
  ADD KEY `Cod_tipo_documento` (`Cod_tipo_documento`),
  ADD KEY `Cod_ciudad` (`Cod_ciudad`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `articulo`
--
ALTER TABLE `articulo`
  MODIFY `id_articulo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  MODIFY `Codigo_ciudad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `detalleFactura`
--
ALTER TABLE `detalleFactura`
  MODIFY `id_detalle` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `devolucion`
--
ALTER TABLE `devolucion`
  MODIFY `id_devolucion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `forma_de_pago`
--
ALTER TABLE `forma_de_pago`
  MODIFY `id_formapago` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `reportes`
--
ALTER TABLE `reportes`
  MODIFY `id_reporte` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `servicio`
--
ALTER TABLE `servicio`
  MODIFY `id_servicio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `tipo_articulo`
--
ALTER TABLE `tipo_articulo`
  MODIFY `id_tipoarticulo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT de la tabla `tipo_de_documento`
--
ALTER TABLE `tipo_de_documento`
  MODIFY `id_tipo_documento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `tipo_tarjeta`
--
ALTER TABLE `tipo_tarjeta`
  MODIFY `id_tip_tarjeta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `Id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `articulo`
--
ALTER TABLE `articulo`
  ADD CONSTRAINT `ref_prov_art` FOREIGN KEY (`cod_proveedor`) REFERENCES `proveedor` (`No_documento`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ref_tipo_articulo` FOREIGN KEY (`cod_tipo_articulo`) REFERENCES `tipo_articulo` (`id_tipoarticulo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`cod_tipo_documento`) REFERENCES `tipo_de_documento` (`id_tipo_documento`),
  ADD CONSTRAINT `cliente_ibfk_2` FOREIGN KEY (`cod_ciudad`) REFERENCES `ciudad` (`Codigo_ciudad`);

--
-- Filtros para la tabla `detalleFactura`
--
ALTER TABLE `detalleFactura`
  ADD CONSTRAINT `detalleFactura_ibfk_1` FOREIGN KEY (`cod_factura`) REFERENCES `facturas` (`Nnm_factura`),
  ADD CONSTRAINT `detalleFactura_ibfk_2` FOREIGN KEY (`cod_articulo`) REFERENCES `articulo` (`id_articulo`),
  ADD CONSTRAINT `detalleFactura_ibfk_3` FOREIGN KEY (`cod_servicio`) REFERENCES `servicio` (`id_servicio`);

--
-- Filtros para la tabla `devolucion`
--
ALTER TABLE `devolucion`
  ADD CONSTRAINT `devolucion_ibfk_1` FOREIGN KEY (`id_detalle`) REFERENCES `detalleFactura` (`id_detalle`);

--
-- Filtros para la tabla `facturas`
--
ALTER TABLE `facturas`
  ADD CONSTRAINT `facturas_ibfk_1` FOREIGN KEY (`cod_cliente`) REFERENCES `cliente` (`id_cliente`),
  ADD CONSTRAINT `facturas_ibfk_2` FOREIGN KEY (`Id_usuario`) REFERENCES `usuario` (`Id_usuario`),
  ADD CONSTRAINT `facturas_ibfk_3` FOREIGN KEY (`cod_formapago`) REFERENCES `forma_de_pago` (`id_formapago`);

--
-- Filtros para la tabla `pago_tarjeta`
--
ALTER TABLE `pago_tarjeta`
  ADD CONSTRAINT `pago_tarjeta_ibfk_1` FOREIGN KEY (`id_tip_tarjeta`) REFERENCES `tipo_tarjeta` (`id_tip_tarjeta`),
  ADD CONSTRAINT `pago_tarjeta_ibfk_2` FOREIGN KEY (`Nnm_factura`) REFERENCES `facturas` (`Nnm_factura`);

--
-- Filtros para la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD CONSTRAINT `proveedor_ibfk_1` FOREIGN KEY (`cod_tipo_documento`) REFERENCES `tipo_de_documento` (`id_tipo_documento`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ref_prov_ciudad` FOREIGN KEY (`cod_ciudad`) REFERENCES `ciudad` (`Codigo_ciudad`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `reportes`
--
ALTER TABLE `reportes`
  ADD CONSTRAINT `reportes_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`Id_usuario`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`Cod_rol`) REFERENCES `Roles` (`codigo_rol`),
  ADD CONSTRAINT `usuario_ibfk_2` FOREIGN KEY (`Cod_tipo_documento`) REFERENCES `tipo_de_documento` (`id_tipo_documento`),
  ADD CONSTRAINT `usuario_ibfk_3` FOREIGN KEY (`Cod_ciudad`) REFERENCES `ciudad` (`Codigo_ciudad`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
