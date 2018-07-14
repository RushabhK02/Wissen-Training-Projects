create table REVIEWS( 
id int auto_increment primary key, 
author varchar(255),
review varchar(255),
stars int,
product_id int,
foreign key (product_id) references PRODUCTS(id));
