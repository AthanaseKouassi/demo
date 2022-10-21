DROP TABLE IF EXISTS users; 
CREATE TABLE users (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  birthdate DATE NOT NULL,
  country VARCHAR(250) NOT NULL,
  phone VARCHAR(20),
  genre VARCHAR(1)
);
 
INSERT INTO users (name, birthdate, country, phone, genre) VALUES
  ('Laurent', '2005-05-12', 'France', '0789541203','M'),
  ('Sophie', '1997-06-18', 'Belgique', '0145230023','F'),
  ('Agathe', '2000-11-25', 'France', '0658741277','F');