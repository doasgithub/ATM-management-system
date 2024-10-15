create database bankmanagementsystem;
show databases;
use bankmanagementsystem;
create table signup(   
     formno VARCHAR(20),
    name VARCHAR(20),
    fname VARCHAR(20),
    dob VARCHAR(20),
    gender VARCHAR(20),
    email VARCHAR(40),
    marital VARCHAR(20),
    address VARCHAR(40),
    city VARCHAR(20),
    pincode VARCHAR(20),
    state VARCHAR(20)
    );
    
  show tables;  
  select * from signup;
  CREATE TABLE signuptwo (
    formno VARCHAR(20),
    religion VARCHAR(50),
    category VARCHAR(50),
    income VARCHAR(50),
    education VARCHAR(50),
    occupation VARCHAR(50),
    pan VARCHAR(10),
    aadhar VARCHAR(12),
    seniorcitizen VARCHAR(3),
    existingaccount VARCHAR(3)
);
select * from signup;

CREATE TABLE signupthree (
    formno VARCHAR(20),
    atype VARCHAR(20),
    cardno VARCHAR(16),
    pin VARCHAR(4),
    facility VARCHAR(50)
);
select * from signupthree;

CREATE TABLE login (
    formno VARCHAR(20),
    cardno VARCHAR(16),
    pin VARCHAR(4)
);
select * from login;

create table bank(pin varchar(20) , date varchar(80), type varchar(20), amount varchar(50));
select * from bank;

