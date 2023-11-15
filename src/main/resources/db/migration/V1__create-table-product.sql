create table product (
	id int primary key unique not null,
	name text not null,
	price_in_cents int not null
);