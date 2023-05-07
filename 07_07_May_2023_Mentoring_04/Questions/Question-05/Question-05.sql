select Cust_Id, sum(Quantity) as 'All_Deliveries' from orders
group by cust_id;


select Cust_Id, sum(Quantity) as 'Successfully_Delivered' from orders
as O 
INNER JOIN (
select Order_Id from billing_details where Delivery_Status = 'Delivered'
)
as BD
on BD.Order_Id = O.Id
group by Cust_Id ;

select * from orders where cust_id = 5;

select * from billing_details where Order_Id in (
select id from orders where cust_id = 5
);


select Cust_Id, Successfully_Delivered, 
CASE
	WHEN Successfully_Delivered >= 8 THEN 'Highly Valued'
    WHEN Successfully_Delivered BETWEEN 5 AND 7 THEN 'Moderately Valued'
    ELSE 'Low Valued'
END as 'Value of Customer'
FROM

(
select Cust_Id, sum(Quantity) as Successfully_Delivered
from orders
as O 
INNER JOIN (
select Order_Id from billing_details where Delivery_Status = 'Delivered'
)
as BD
on BD.Order_Id = O.Id
group by Cust_Id 
)
As O_BD;




