-- Eliminar la base de datos si existe
DROP DATABASE IF EXISTS bd_peliculas;

-- Crear la base de datos
CREATE DATABASE bd_peliculas;
USE bd_peliculas;

-- Tabla de clientes
CREATE TABLE cliente (
  idcliente INT NOT NULL AUTO_INCREMENT,
  clinombre VARCHAR(45) DEFAULT 'N/A', -- Opcional si no es socio
  cliapellido VARCHAR(45) DEFAULT 'N/A', -- Opcional si no es socio
  edad INT DEFAULT -1, -- Opcional si no es socio
  clicorreo VARCHAR(45) NOT NULL DEFAULT 'N/A', -- Opcional si no es socio
  clicontraseña VARCHAR(255) NOT NULL DEFAULT 'N/A', -- Opcional si no es socio
  tipo_documento VARCHAR(30) NOT NULL, 
  numero_documento VARCHAR(20) NOT NULL UNIQUE,
  departamento VARCHAR(45) DEFAULT 'N/A', -- Opcional si no es socio
  es_socio BOOLEAN NOT NULL DEFAULT FALSE,
  
  PRIMARY KEY (idcliente)
) ENGINE=InnoDB;

-- Insertar datos de prueba
INSERT INTO cliente (clinombre, cliapellido, edad, clicorreo, clicontraseña, tipo_documento, numero_documento, departamento, es_socio)
VALUES
('Juan', 'Pérez', 30, 'juan.perez@example.com', 'abc12345', 'DNI', '12345678', 'Lima', TRUE),
('María', 'Gómez', 25, 'maria.gomez@example.com', 'def67890', 'DNI', '87654321', 'Cusco', TRUE);

-- Insertar datos de prueba de cliente (NO SOCIO)
INSERT INTO cliente (tipo_documento, numero_documento, es_socio)
VALUES
('DNI', '98765432',  FALSE),
('Carnet de extranjería', 'E123456789', FALSE),
('Pasaporte', 'X1234567', FALSE),
('Rut', '12346679', FALSE),
('DNI', '11223344', FALSE);

-- Tabla de ventas
CREATE TABLE venta (
  idventa INT NOT NULL AUTO_INCREMENT,
  idcliente INT, -- Puede ser NULL si no es socio
  metodopago VARCHAR(20) NOT NULL,
  totalventa DOUBLE NOT NULL,
  fechahora DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  tipo_documento VARCHAR(20) NOT NULL, -- Para validaciones de no socios
  numero_documento VARCHAR(20) NOT NULL, -- Para validaciones de no socios
  numero_tarjeta CHAR(16), -- Solo para tarjetas
  fecha_vencimiento DATE, -- Solo para tarjetas
  cvv CHAR(3), -- Solo para tarjetas
  numero_celular VARCHAR(20), -- Solo para billeteras
  PRIMARY KEY (idventa),
  CONSTRAINT fk_cliente FOREIGN KEY (idcliente) REFERENCES cliente (idcliente)
) ENGINE=InnoDB;

-- Tabla de películas
CREATE TABLE pelicula (
  idpelicula INT NOT NULL AUTO_INCREMENT,
  pelititulo VARCHAR(70) NOT NULL,
  peligenero VARCHAR(15) NOT NULL,
  pelicensura VARCHAR(10) NOT NULL,
  pelilinkimagen VARCHAR(300) NOT NULL,
  pelidirector VARCHAR(45) NOT NULL,
  peliidioma VARCHAR(45) NOT NULL,
  pelidisponible VARCHAR(45) NOT NULL,
  pelidescripcion VARCHAR(500) NOT NULL,
  peliduracion VARCHAR(10) NOT NULL,
  peliprecio DOUBLE DEFAULT 0,

  PRIMARY KEY (idpelicula)
) ENGINE=InnoDB;

INSERT INTO pelicula (pelititulo, peligenero, pelicensura, pelilinkimagen, pelidirector, peliidioma, pelidisponible, pelidescripcion, peliduracion) 
VALUES
('Los Increíbles', 'Animación', 'APT', 'https://example.com/increibles.jpg', 'Brad Bird', 'Español', 'Sí', 'Una familia de superhéroes intenta equilibrar sus vidas normales mientras luchan contra el crimen.', '1h 55m'),
('Titanic', 'Drama', '+14', 'https://example.com/titanic.jpg', 'James Cameron', 'Inglés', 'Sí', 'Una épica historia de amor que florece a bordo del fatídico transatlántico.', '3h 15m'),
('Joker', 'Drama', '+18', 'https://example.com/joker.jpg', 'Todd Phillips', 'Inglés', 'Sí', 'Un hombre con problemas mentales se transforma en el villano icónico del universo de Batman.', '2h 2m'),
('Moana', 'Animación', 'APT', 'https://example.com/moana.jpg', 'Ron Clements', 'Español', 'Sí', 'Una joven polinesia emprende una misión para salvar a su isla con la ayuda de un semidiós.', '1h 47m'),
('Doctor Strange', 'Acción', '+14', 'https://example.com/doctor_strange.jpg', 'Scott Derrickson', 'Inglés', 'Sí', 'Un cirujano brillante pero arrogante se convierte en el hechicero supremo del universo.', '1h 55m'),
('Batman', 'Acción', '+14', 'https://example.com/batman.jpg', 'Matt Reeves', 'Inglés', 'Sí', 'El caballero oscuro lucha contra el crimen en Gotham City mientras enfrenta sus propios demonios internos.', '2h 56m'),
('Mufasa', 'Animación', 'APT', 'https://example.com/mufasa.jpg', 'Barry Jenkins', 'Español', 'Sí', 'La historia de cómo Mufasa ascendió al trono en la sabana africana.', '1h 30m'),
('Avengers: Endgame', 'Acción', '+14', 'https://example.com/endgame.jpg', 'Anthony y Joe Russo', 'Inglés', 'Sí', 'Los Vengadores se reúnen una última vez para revertir el daño causado por Thanos.', '3h 1m'),
('El tiempo que tenemos', 'Drama', '+14', 'https://example.com/el_tiempo.jpg', 'Isabel Coixet', 'Español', 'Sí', 'Un hombre reflexiona sobre su vida y las decisiones que lo llevaron a donde está.', '1h 40m'),
('Sonic 3', 'Animación', 'APT', 'https://example.com/sonic3.jpg', 'Jeff Fowler', 'Español', 'Sí', 'El veloz erizo azul enfrenta nuevas aventuras junto a sus amigos contra un villano temible.', '1h 50m'),
('Hasta el último hombre', 'Acción', '+18', 'https://example.com/ultimo_hombre.jpg', 'Mel Gibson', 'Inglés', 'Sí', 'Un médico militar que rechaza portar armas salva la vida de decenas durante la Segunda Guerra Mundial.', '2h 19m'),
('Spiderman', 'Acción', '+14', 'https://example.com/spiderman.jpg', 'Sam Raimi', 'Inglés', 'Sí', 'La historia del joven Peter Parker que se convierte en el superhéroe Spiderman.', '2h 1m');

-- Tabla de productos
CREATE TABLE productos (
  idproducto INT NOT NULL AUTO_INCREMENT,
  tipoproducto VARCHAR(45) NOT NULL,
  nombreproducto VARCHAR(45) NOT NULL,
  precioproducto DOUBLE NOT NULL,
  PRIMARY KEY (idproducto)
) ENGINE=InnoDB;

INSERT INTO productos (idproducto, tipoproducto, nombreproducto, precioproducto) VALUES
(1, 'bebidas', 'CCBebida Mediana OL', 13.00),
(2, 'bebidas', 'CCBebida Grande OL', 15.00),
(3, 'bebidas', 'Agua San Luis sin gas', 5.00),
(4, 'combo', 'Combo 2 Dulce OL CC', 23.00),
(5, 'combo', 'Combo 2 Salado OL CC', 26.50),
(6, 'combo', 'Combo 2 Mix OL CC', 29.00),
(7, 'combo', 'Com.2 Salado Dob.Gig', 43.00),
(8, 'combo', 'Com.2 Mix Dob.Gig. OL', 39.00),
(9, 'combo', 'Com.2 Dulce Dob.Gig. OL', 43.00);

-- Detalle de películas en una venta
CREATE TABLE detalleventa_peliculas (
  iddetalle INT NOT NULL AUTO_INCREMENT,
  idventa INT NOT NULL,
  pelicantidad INT NOT NULL,
  idpelicula INT NOT NULL,
  pelihora VARCHAR (7) NOT NULL, -- Hora de la película seleccionada
  subtotal DOUBLE NOT NULL,
  PRIMARY KEY (iddetalle),
  CONSTRAINT fk_detalleventa_venta FOREIGN KEY (idventa) REFERENCES venta (idventa),
  CONSTRAINT fk_detalleventa_pelicula FOREIGN KEY (idpelicula) REFERENCES pelicula (idpelicula)
) ENGINE=InnoDB;

-- Detalle de productos en una venta
CREATE TABLE detalleventa_productos (
  iddetalle INT NOT NULL AUTO_INCREMENT,
  idventa INT NOT NULL,
  idproducto INT NOT NULL,
  cantidad INT NOT NULL,
  subtotal DOUBLE NOT NULL,
  PRIMARY KEY (iddetalle),
  CONSTRAINT fk_detalleventa_productos_venta FOREIGN KEY (idventa) REFERENCES venta (idventa),
  CONSTRAINT fk_detalleventa_productos_producto FOREIGN KEY (idproducto) REFERENCES productos (idproducto)
) ENGINE=InnoDB;

-- Tabla de butacas
CREATE TABLE butacas (
  id INT AUTO_INCREMENT PRIMARY KEY,
  fila INT NOT NULL,
  columna INT NOT NULL,
  disponible BOOLEAN NOT NULL
);

-- Inserción de butacas iniciales
INSERT INTO butacas (fila, columna, disponible)
SELECT filas.fila, columnas.columna, true
FROM (
    SELECT 0 AS fila UNION SELECT 1 UNION SELECT 2 UNION SELECT 3 UNION SELECT 4 UNION SELECT 5 UNION SELECT 6 UNION SELECT 7 UNION SELECT 8
) AS filas,
(
    SELECT 0 AS columna UNION SELECT 1 UNION SELECT 2 UNION SELECT 3 UNION SELECT 4 UNION SELECT 5 UNION SELECT 6 UNION SELECT 7 UNION SELECT 8 UNION SELECT 9 UNION SELECT 10
) AS columnas;

-- Tabla de tarjetas simuladas para pruebas
CREATE TABLE tarjetas_simuladas (
  id INT AUTO_INCREMENT PRIMARY KEY,
  numero_tarjeta CHAR(16) NOT NULL UNIQUE,
  fecha_vencimiento DATE NOT NULL,
  cvv CHAR(3) NOT NULL,
  titular VARCHAR(100) NOT NULL
);

-- Inserción de tarjetas simuladas
INSERT INTO tarjetas_simuladas (numero_tarjeta, fecha_vencimiento, cvv, titular)
VALUES
('4111111111111111', '2025-12-31', '123', 'Juan Perez'),
('5500000000000004', '2026-08-30', '456', 'Maria Lopez');

-- Consulta de validación de tarjeta simulada
-- SELECT * FROM tarjetas_simuladas
-- WHERE numero_tarjeta = '4111111111111111'
--   AND fecha_vencimiento = '2025-12-31'
--   AND cvv = '123';