use supermercadoxy;
create table SuperMErcado(
Nit integer,
Nombre varchar(30) not null,
Ciudad varchar(30) not null,
primary key(Nit)
);

create table Administrador(
IdAdmin integer auto_increment,
Nombre varchar(30) not null,
Usuario varchar(30) not null,
Clave varchar(10) not null,
primary key(IdAdmin)
);

create table Producto(
CodigoBarras integer auto_increment,
Nombre varchar(30) not null,
CantidadInv integer not null,
Precio float not null,
primary key(CodigoBarras)
);

create table ProductoVendido(

codigobarras integer,
cantidad integer,
PrecioTotal integer,
foreign key(codigobarras) references Producto(CodigoBarras)
);

create table PuntoAtencion(
IdPunto integer, 
Nit integer not null,
IdAdmin integer not null, 
Direccion varchar(50) not null, 
primary key(IdPunto),
foreign key(Nit) references SuperMercado(Nit),
foreign key(IdAdmin) references Administrador(IdAdmin)
);
supermercadoxysupermercadoxy
create table Cliente(
IdCliente integer, 
IdPunto integer not null,
Nombre varchar(30) not null,
Direccion varchar(50) not null,
primary key(IdCliente),
foreign key(IdPunto) references PuntoAtencion(IdPunto)
);

create table Caja(
IdCaja integer, 
IdPunto integer not null,
DineroCaja float not null,
primary key(IdCaja),
foreign key(IdPunto) references PuntoAtencion(IdPunto)
);

create table Vendedor(
IdVendedor integer, 
IdCaja integer not null,
Nombre varchar(30) not null, 
Usuario varchar(30) not null,
Clave varchar(15) not null,
Productos_Vend integer not null,
Porcentaje double not null,
Sueldo float not null,
primary key(IdVendedor),
foreign key(IdCaja) references Caja(IdCaja)
);

create table Venta(
IdCompra integer auto_increment, 
IdVendedor integer not null, 
CodigoBarras integer not null,
CantidadComp integer not null,
EfectivoRecib float not null, 
Cambio float not null,
Fecha date not null,
primary key(IdCompra),
foreign key(IdVendedor) references Vendedor(IdVendedor),
foreign key(CodigoBarras) references Producto(CodigoBarras)
);


insert into SuperMErcado values (1supermercadoxysupermercadoxy2783, 'El Ahorro', 'Bogota'),
	(54735, 'Precios Bajos', 'Medellin'),
	(78214, 'La Alcancia', 'Cali');

insert into Administrador values (51634471, 'Jorge Rojas', 'jorgers71', 'Jo4471#'),
	(10204357811, 'Claudia Silva', 'claudias11', 'Ca811#');

insert into Vendedor values (1032502398, 4693045,'Camilo Diaz', 'camilod98', 'Ca2398#', 00, 00, 860.000),
	(525694823, 2873532, 'Juliana Rios', 'julianr23', 'Ju4823#', 00, 00, 655.000),
	(10234393118, 6503953,'Luisa Valverde', 'luisav18', 'Lu3118#', 00, 00, 860.000),
	(49567946, 5069211, 'Alejandro Pineda' 'alejandrop46', 'Al7946#', 00, 00, 769.000),
	(793415607, 7930518, 'Diego Gil', 'diegog07', 'Di5607#', 00, 00, 860.000);


insert into Producto values (5879311, 'Arroz', 67, 7900),
	(5659302, 'Lentejas', 53, 6500),
	(5794521, 'Sal', 78, 4300),
	(5707665, 'Azucar', 75, 5100),
	(5942314, 'Frijol', 81, 7800),
	(5546467, 'Aceite', 95, 6800),
	(5798678, 'Pasta', 78, 3900),
	(5596321, 'Cafe', 50, 5400),
	(5679898, 'Pan', 52, 4600),
	(5305542, 'Chocolate', 63, 6500),
	(5697875, 'Atun', 110, 6500),
	(5697933, 'Galletas', 56, 3500),
	(3497956, 'Salchichas', 52, 9800),
	(3296854, 'Jamon', 56, 7600),
	(3458697, 'Queso', 55, 6500),
	(3496754, 'Carne', 63, 10500),
	(3576554, 'Arepa', 87, 7500),
	(3226956, 'Pollo', 68, 12000),
	(3697858, 'Pescado', 70, 13200),
	(3568406, 'Leche', 76, 11000),
	(2785968, 'Shampoo', 88, 9700),
	(2586848, 'Jabon', 90, 6500),
	(2485876, 'Cepillo de dientes', 101, 4300),
	(2496969, 'Crema de dientes', 67, 7800),
	(2696856, 'Papel', 87, 12.000),
	(4338484, 'Detergente', 67, 15000),
	(4679675, 'Suavitel', 78, 11000),
	(4656811, 'Fabuloso', 66, 7600),
	(4768556, 'Papel cocina', 97, 6500),
	(4697224, 'Jabon para losa', 89, 7800);

insert into Cliente values (1032439213, 'Laura Ramirez', 405964, 'Cll 68 # 12a 52'),
	(575403146, 'Luis Jimenez', 239451, 'Cra 45 # 34 11'),
	(1023549760, 'Adriana Cortez', 305912, 'Cll 156 # 33 76'),
	(194326852, 'Valentina Ochoa', 206492, 'Cll 127 # 11 03'),
	(1032459041, 'Gabriel Fernandez', 302694, 'Cll 53 # 81 32 ');

insert into PuntoAtencion values (69403, 12783, 51634471, 'Cll 152 # 34 16'),
	(53942, 12783, 10204357811, 'Cll 53 # 67 08');
		
		
-- delete from producto;
select * from producto;