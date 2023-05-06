Select * from Population where economy = (select economy from GDP WHERE ranking = 1);

Select * from Population where economy = ALL (select economy from GDP WHERE ranking <= 10);

Select * from Population where Population <= ANY (select Gdp from GDP WHERE ranking <= 10);

Select * from Population where economy IN (select economy from GDP WHERE ranking <= 10);




