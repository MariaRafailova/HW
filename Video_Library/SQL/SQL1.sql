create database video_library;
use video_library;

create table clients(
	cl_ID int(4) primary key auto_increment not null, 
	name varchar(100) not null,
	contact varchar(50) not null
	);
	
	insert into clients(name,contact) values
		("Pesho", "+359888456321"),
		("Gosho", "g.goshev@gmail.com"),
		("Penka", "+359235689741"),
		("Lili", "+359123456987"),
		("Eli", "e_lka@abv.bg"),
		("Bobi", "+35926498713, bboianov@abv.bg");
		
create table movies(
	m_ID int(4) primary key auto_increment not null,
	title varchar(500),
	countM int(10)
	);
	
	insert into movies(title,countM) values
		("Star Wars: The Last Jedi",10),
		("Spider-Man",5),
		("it",8),
		("Jumanji",2),
		("Beauty and the Beast",3);
	
create table client_movie(
		cl_ID int(4),
		m_ID int(4),
		date varchar,
		foreign key (cl_ID) references clients(cl_ID), 
		foreign key (m_ID) references movies(m_ID)
		);
		
		insert into client_movie(cl_ID,m_ID,date) values
			(1,1,'2018-01-03'),
			(1,2,'2018-01-03'),
			(3,5,'2018-01-04'),
			(6,3,'2018-01-05');
		

			
	

