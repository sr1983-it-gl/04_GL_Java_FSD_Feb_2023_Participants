select id, Name, Connection_Type from cust_details;
select Cust_Id, Quantity from orders;

select cust_id as 'Customer ID', sum(quantity) as 'No Of Cylinders' from orders where status = 'Ordered'
group by cust_id;

select id as 'Cust ID', name, connection_type from cust_details;

-- select * from T1 inner join T2 ON T1.Id = T2.Id

select id, name, connection_type, O.No_Of_Cylinders from cust_details
As CD
INNER JOIN 
(
select cust_id as Id2, sum(quantity) as No_Of_Cylinders from orders where status = 'Ordered'
group by cust_id
)
As O
ON CD.Id = O.Id2;
