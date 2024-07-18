drop database if exists agenda;
create database agenda;
use agenda;

CREATE TABLE `agenda`.`contacto` (
  `id` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `foto` TEXT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `agenda`.`telefono` (
  `numero` VARCHAR(11) NOT NULL,
  `compania` VARCHAR(45) NULL,
  `idcontacto` INT NULL,
  PRIMARY KEY (`numero`),
    FOREIGN KEY (`idcontacto`)
    REFERENCES `agenda`.`contacto` (`id`));

INSERT INTO `agenda`.`contacto` (`id`, `nombre`, `apellido`, `email`, `foto`) VALUES ('1', 'Juan', 'Perez', 'juan@gmail.com', './src/Imagenes/gatito.jpg');
INSERT INTO `agenda`.`contacto` (`id`, `nombre`, `apellido`, `email`, `foto`) VALUES ('2', 'Maria', 'Lopez', 'maria@gmail.com', './src/Imagenes/hollowknight.jpg');
INSERT INTO `agenda`.`contacto` (`id`, `nombre`, `apellido`, `email`, `foto`) VALUES ('3', 'Carlos', 'Sanchez', 'carlos@gmail.com', './src/Imagenes/zorro.jpg');

INSERT INTO `agenda`.`telefono` (`numero`, `compania`, `idcontacto`) VALUES ('1234567891', 'Movistar', '1');
INSERT INTO `agenda`.`telefono` (`numero`, `compania`, `idcontacto`) VALUES ('9876543211', 'Telcel', '1');
INSERT INTO `agenda`.`telefono` (`numero`, `compania`, `idcontacto`) VALUES ('5556667771', 'AT&T', '1');
INSERT INTO `agenda`.`telefono` (`numero`, `compania`, `idcontacto`) VALUES ('2223334441', 'Unefon', '2');
INSERT INTO `agenda`.`telefono` (`numero`, `compania`, `idcontacto`) VALUES ('1112223331', 'Virgin Mobile', '2');
INSERT INTO `agenda`.`telefono` (`numero`, `compania`, `idcontacto`) VALUES ('3334445551', 'Telcel', '2');
INSERT INTO `agenda`.`telefono` (`numero`, `compania`, `idcontacto`) VALUES ('4445556661', 'AT&T', '3');
INSERT INTO `agenda`.`telefono` (`numero`, `compania`, `idcontacto`) VALUES ('6667778881', 'Bait', '3');
INSERT INTO `agenda`.`telefono` (`numero`, `compania`, `idcontacto`) VALUES ('8889990001', 'Movistar', '3');
