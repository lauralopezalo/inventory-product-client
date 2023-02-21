DROP SCHEMA IF EXISTS inventory_service;
CREATE SCHEMA inventory_service;
USE inventory_service;

INSERT INTO inventory (serial_number, quantity) VALUES 
(1, 50),
(2, 10),
(3, 15)
;

DROP SCHEMA IF EXISTS product;
CREATE SCHEMA product;
USE product;

INSERT INTO product (serial_number, product_name, price) VALUES 
(1, "shirt", 15.00),
(2, "pants", 30.00),
(3, "socks", 1.50)
;

SELECT * FROM product;
SELECT * FROM inventory;

