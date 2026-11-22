-- Base de datos de ZonaNueve
-- Ejecuta este archivo una vez en MySQL (Workbench, phpMyAdmin o consola).

CREATE DATABASE IF NOT EXISTS zonanueve
    CHARACTER SET utf8mb4
    COLLATE utf8mb4_spanish_ci;

USE zonanueve;

CREATE TABLE IF NOT EXISTS productos (
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre      VARCHAR(100)  NOT NULL,
    precio      DECIMAL(10,2) NOT NULL,
    descripcion VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS usuarios (
    id              BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre          VARCHAR(100) NOT NULL,
    numero_telefono VARCHAR(20),
    email           VARCHAR(150) UNIQUE
);

-- Productos del menú (index.html)
INSERT INTO productos (nombre, precio, descripcion) VALUES
('Hamburguesa Regular',        17900, 'Hamburguesas'),
('Hamburguesa Tocinetuda',     21900, 'Hamburguesas'),
('Hamburguesa Mega Queso',     25900, 'Hamburguesas'),
('Hamburguesa Mixta',          22900, 'Hamburguesas'),
('Salchipapas Tradicionales',  12900, 'Salchipapas'),
('Salchipapas Quesudas',       19900, 'Salchipapas'),
('Bombón de pollo',            19900, 'Salchipapas'),
('Bombón de pollo doble',      26900, 'Salchipapas'),
('Picadas regulares',          24900, 'Picadas'),
('Picadas pro',                30900, 'Picadas'),
('Picadas pro Max',            35900, 'Picadas'),
('Papas Pulled pork',          25900, 'Papas Signature'),
('Papas Chicken',              22900, 'Papas Signature'),
('Papas Bacon Cheddar',        17900, 'Papas Signature'),
('Papas z9',                   39900, 'Papas Signature'),
('Perro Tradicional',          15900, 'Perros Calientes'),
('Perro z9',                   22900, 'Perros Calientes'),
('Coca Cola',                   5000, 'Bebidas'),
('Coca Cola zero',              5000, 'Bebidas'),
('Colombiana',                  5000, 'Bebidas'),
('Manzana',                     5000, 'Bebidas'),
('Sprite',                      5000, 'Bebidas'),
('Soda',                        5000, 'Bebidas'),
('Mr Tea',                      5000, 'Bebidas'),
('Del valle Naranja',           5000, 'Bebidas'),
('Agua Natural',                3900, 'Bebidas'),
('Agua Saborizada',             3900, 'Bebidas'),
('Coca Cola familiar',         10000, 'Bebidas Familiares'),
('Manzana familiar',           10000, 'Bebidas Familiares'),
('Colombiana familiar',        10000, 'Bebidas Familiares'),
('Del Valle familiar',         10000, 'Bebidas Familiares');
