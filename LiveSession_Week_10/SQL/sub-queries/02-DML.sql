delete from gdp;

insert into gdp (ranking, economy, gdp) 
values (1, 'USA', 2094000);

insert into gdp (ranking, economy, gdp) 
values (2, 'CHINA', 1472000);

insert into gdp (ranking, economy, gdp) 
values (3, 'Japan', 506000);

-- select * from gdp;

delete from population;

insert into population (ranking, economy, population) values 
(1, 'China', 140);

insert into population (ranking, economy, population) values 
(2, 'India', 138);

insert into population (ranking, economy, population) values 
(3, 'USA', 32);

insert into population (ranking, economy, population) values 
(4, 'New-Country-1', 50000);

insert into population (ranking, economy, population) values 
(5, 'New-Country-2', 2094000);

insert into population (ranking, economy, population) values 
(6, 'New-Country-3', (2094000 + 1));

-- select * from population;


insert into coursestats (id, username, coursename, coursefee, courseduration) values (1, 'Sushma', 'Cloud', 30000, 60);

insert into coursestats (id, username, coursename, coursefee, courseduration) values (2, 'Ashok', 'Spark', 20000, 35);

insert into coursestats (id, username, coursename, coursefee, courseduration) values (3, 'Ashok', 'DevOps', 30000, 60);

insert into coursestats (id, username, coursename, coursefee, courseduration) values (4, 'Kiran', 'Testing', 5000, 30);

insert into coursestats (id, username, coursename, coursefee, courseduration) values (5, 'Kiran', 'Python', 10000, 40);

insert into coursestats (id, username, coursename, coursefee, courseduration) values (6, 'Kiran', 'C', 5000, 30);

insert into coursestats (id, username, coursename, coursefee, courseduration) values (7, 'Devdutt', 'DevOps', 30000, 60);

insert into coursestats (id, username, coursename, coursefee, courseduration) values (8, 'Vijay', 'ML', 50000, 90);

insert into coursestats (id, username, coursename, coursefee, courseduration) values (9, 'Ramana', 'Testing', 5000, 30);

