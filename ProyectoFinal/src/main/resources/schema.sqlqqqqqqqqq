drop table Bicicleta if exists;
drop table Cateegoria if exists;
drop sequence if exists hibernate_sequence;

create sequence hibernate_sequence start with 100 increment by 1;



create table Bicicleta (
	id bigint not null, 
	marcaModelo varchar(512),
	descripcion clob, 
	year varchar(6), 
	hombre boolean,
	mujer boolean,
	talla varchar(6),
	precio float not null,
	imagen varchar(512), 
	nombre varchar(512), 
	pvp float not null, 
	categoria_id bigint, 
	primary key (id)
);


create table Categoria (
	id bigint not null,  
	nombre varchar(512), 
	primary key (id)
);

alter table Bicicleta add constraint fk_bicicleta_categoria foreign key (categoria_id) references Categoria;
