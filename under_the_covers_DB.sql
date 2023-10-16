use library;


CREATE TABLE Authors(
name VARCHAR(255),
authorID INT NOT NULL AUTO_INCREMENT,
dead BOOLEAN,
alias VARCHAR(255),
PRIMARY KEY (authorID)
);

CREATE TABLE Publishers(
company_name VARCHAR(255),
copyright BOOLEAN,
publisherID INT NOT NULL AUTO_INCREMENT,
PRIMARY KEY (publisherID)
);

CREATE TABLE Books (
hardcover boolean,
title VARCHAR(255),
issue INT,
bookID INT,
authorID INT,
publisherID INT,
isbn INT,
price DECIMAL,
FOREIGN KEY (authorID) REFERENCES Authors(authorID),
FOREIGN KEY (publisherID) REFERENCES Publishers(publisherID),
PRIMARY KEY (bookID)
);

CREATE TABLE Customers(
forename VARCHAR(255),
surname VARCHAR(255),
address VARCHAR(255),
dob DATE,
phone_number VARCHAR(255),
email VARCHAR(255),
customerID INT NOT NULL AUTO_INCREMENT,
PRIMARY KEY (customerID)
);


CREATE TABLE payments(
date_of_order DATE,
amount DECIMAL,
paymentID INT NOT NULL AUTO_INCREMENT,
PRIMARY KEY (paymentID)
);

CREATE TABLE Orders(
orderID INT NOT NULL AUTO_INCREMENT,
customerID INT,
order_date Date,
bookID INT,
paymentID INT,
FOREIGN KEY (bookID) REFERENCES Books(bookID),
FOREIGN KEY (paymentID) REFERENCES Payments(paymentID),
FOREIGN KEY (customerID) REFERENCES Customers(customerID),
PRIMARY KEY(orderID)
);

CREATE TABLE OrderDetails(
orderID INT,
bookID INT,
quantity INT,
price_per_book DECIMAL,
FOREIGN KEY (orderID) REFERENCES Orders(orderID)
);

CREATE TABLE Genres(
genreID INT NOT NULL AUTO_INCREMENT,
name VARCHAR(255),
fiction BOOLEAN,
PRIMARY KEY (genreID)
);