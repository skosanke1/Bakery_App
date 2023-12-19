-- Create the bakery_db
CREATE DATABASE IF NOT EXISTS bakery_db;
USE bakery_db;

-- Create the table for baked goods inventory
CREATE TABLE IF NOT EXISTS Inventory (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(255) NOT NULL,
    Quantity INT NOT NULL,
    Supplier VARCHAR(255) ,
    RetailPrice DECIMAL(10, 2) NOT NULL,
    WholesalePrice DECIMAL(10, 2) NOT NULL,
    UPC VARCHAR(12) NOT NULL
);

-- Sample bakery entries
INSERT INTO Inventory (Name, Quantity, Supplier, RetailPrice, WholesalePrice, UPC) VALUES
('Chocolate Cake', 50, 'ABC Bakery Supplies', 19.99, 14.99, '978012456789'),
('Blueberry Muffins', 100, 'XYZ Baking Distributors', 2.99, 1.99, '978023456790'),
('Cinnamon Rolls', 75, 'Bakery World', 4.50, 3.00, '978012346791'),
('Baguette', 200, 'Flour Power Co.', 3.99, 2.50, '978012345792'),
('Apple Pie', 30, 'Sweet Delights Distributors', 12.99, 8.99, '978123456793'),
('Croissants', 120, 'Global Ingredients', 1.75, 1.20, '978012456794'),
('Pumpkin Bread', 40, 'Bread Heaven', 7.99, 5.99, '978123456795'),
('Sugar Cookies', 150, 'Sweet Treats Suppliers', 0.99, 0.75, '978123456796'),
('Cheesecake', 25, 'Dairy Delightful', 24.99, 18.99, '978012356797'),
('Sourdough Bread', 180, 'Artisanal Flours', 5.49, 3.99, '978023456798');

-- Example bakery SQL statements

-- Select all baked goods:
SELECT * FROM Inventory;

-- Update the retail price of a specific item:
UPDATE Inventory SET RetailPrice = 22.99 WHERE Name = 'Chocolate Cake';

-- Increase the quantity of an item by 100:
UPDATE Inventory SET Quantity = Quantity + 100 WHERE Name = 'Blueberry Muffins';

-- Sort baked goods by retail price in descending order:
SELECT * FROM Inventory ORDER BY RetailPrice DESC;




