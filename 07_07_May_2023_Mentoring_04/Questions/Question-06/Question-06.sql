
select Id as CustomerID, Name as CustomerName, O_BD.OrderId, O_BD.Inv_Id as InvoiceID, O_BD.DeliveryDate  from cust_details
as CD 
INNER JOIN (
select id as OrderId, cust_id, BD.Inv_Id, BD.DeliveryDate from orders 
as O
INNER JOIN (
select Inv_Id, Date as DeliveryDate, Order_Id from billing_details where Delivery_Status = 'Delivered'
)
as BD
on O.id = BD.Order_Id
)
as O_BD
on CD.Id = O_BD.cust_id;


