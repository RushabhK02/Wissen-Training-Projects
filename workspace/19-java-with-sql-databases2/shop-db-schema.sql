

create database shop;
use shop;

create table shop.PRODUCTS(
	id int primary key,
	name varchar(200),
	price double,
	makeDate date,
	image varchar(200),
	description varchar(256)
);