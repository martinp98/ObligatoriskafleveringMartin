CREATE TABLE IF NOT EXISTS car(
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(250),
max_speed int
);

CREATE TABLE IF NOT EXISTS category(
id INT AUTO_INCREMENT PRIMARY KEY,
description VARCHAR(250)
);

CREATE TABLE IF NOT EXISTS engine(
id INT AUTO_INCREMENT PRIMARY KEY,
description VARCHAR(250)
);
INSERT INTO category (description) VALUES ('Racecar');
INSERT INTO category (description) VALUES ('SUV');

INSERT INTO engine (description) VALUES ('BENZIN MOTOR');
INSERT INTO engine (description) VALUES ('DIESEL MOTOR');
INSERT INTO engine (description) VALUES ('EL MOTOR');

INSERT INTO car (name, max_speed) VALUES
('Toyota Aygo', 160),
('Bugatti Chiron', 500);

INSERT INTO car_categories(car_id, category_id) VALUES
(1, 1),
(1, 2),
(2, 2);
