-- Cust_Details 

insert into cust_details (Id, Name, Gender, Address, Phone_No, Connection_Type, No_Of_Cylinders) values (1, 'Harish', 'M', '1-2, bglr', 1987654322, 14.2, 1); 
insert into cust_details (Id, Name, Gender, Address, Phone_No, Connection_Type, No_Of_Cylinders) values (2, 'Amisha', 'F', '32-12, bglr', 1614322387, 14.2, 1); 
insert into cust_details (Id, Name, Gender, Address, Phone_No, Connection_Type, No_Of_Cylinders) values (3, 'Ujjawal', 'M', '19-0, gurgaon', 1871614322, 14.2, 1); 
insert into cust_details (Id, Name, Gender, Address, Phone_No, Connection_Type, No_Of_Cylinders) values (4, 'Anu', 'F', '2-10, hyd', 1000614322, 19.0, 5); 
insert into cust_details (Id, Name, Gender, Address, Phone_No, Connection_Type, No_Of_Cylinders) values (5, 'Rakshitha', 'F', '3-1-3, chennai', 1614322551, 19.0, 10); insert into cust_details (Id, Name, Gender, Address, Phone_No, Connection_Type, No_Of_Cylinders) values (6,'Varuni', 'F', '10-4, gurgaon', 1432245789, 14.2, 1); 
insert into cust_details (Id, Name, Gender, Address, Phone_No, Connection_Type, No_Of_Cylinders) values (7,'Vamshi', 'M', '31-14, hyd', 14433245789, 19.0, 6);

-- Orders 
insert into orders (Id, Date, Cust_Id, Quantity, Payment_type, Status) values(1, '2021-10-01', 6, 1, 'online', 'cancelled'); 
insert into orders (Id, Date, Cust_Id, Quantity, Payment_type, Status) values(2, '2021-10-01', 3, 1, 'POD', 'Ordered'); 
insert into orders (Id, Date, Cust_Id, Quantity, Payment_type, Status) values(3, '2021-10-02', 5, 4, 'POD', 'Cancelled'); 
insert into orders (Id, Date, Cust_Id, Quantity, Payment_type, Status) values(4, '2021-10-03', 6, 1, 'POD', 'Ordered'); 
insert into orders (Id, Date, Cust_Id, Quantity, Payment_type, Status) values(5, '2021-10-04', 3, 1, 'Online', 'Ordered'); 
insert into orders (Id, Date, Cust_Id, Quantity, Payment_type, Status) values(6, '2021-11-05', 6, 1, 'Online', 'Ordered'); 
insert into orders (Id, Date, Cust_Id, Quantity, Payment_type, Status) values(7, '2021-11-06', 4, 4, 'Online', 'Ordered'); 
insert into orders (Id, Date, Cust_Id, Quantity, Payment_type, Status) values(8, '2021-11-07', 5, 9, 'POD', 'Ordered'); 
insert into orders (Id, Date, Cust_Id, Quantity, Payment_type, Status) values(9, '2021-11-09', 7, 5, 'Online', 'Ordered'); 

-- Cancelled Orders 
insert into cancelled_orders values(1, '2021-10-02', 'Out of Station'); 
insert into cancelled_orders values(3, '2021-10-03', 'Mistakenly Ordered'); 

-- Billing_details 
-- insert into billing_details(Date, Order_Id, Delivery_Status) values ('2021-10-03', 1, 'Delivered'); 
insert into billing_details(Inv_Id, Date, Order_Id, Delivery_Status) values (1, '2021-10-03', 2, 'Undelivered'); 
insert into billing_details(Inv_Id, Date, Order_Id, Delivery_Status) values (2, '2021-10-04', 4, 'Delivered'); 
insert into billing_details(Inv_Id, Date, Order_Id, Delivery_Status) values (3, '2021-10-06', 5, 'Delivered'); 
insert into billing_details(Inv_Id, Date, Order_Id, Delivery_Status) values (4, '2021-11-06', 6, 'Delivered'); 
insert into billing_details(Inv_Id, Date, Order_Id, Delivery_Status) values (5, '2021-11-06', 7, 'Delivered'); 
insert into billing_details(Inv_Id, Date, Order_Id, Delivery_Status) values (6, '2021-11-08', 8, 'Delivered'); 

-- Cancelled_Bills 
insert into cancelled_bills values(1, '2021-10-04', 'Insufficient Amount');

-- Pricing 
insert into pricing values(14.2, 'January', 2021, 925); insert into pricing values(19.0, 'January', 2021, 1223); insert into pricing values(5.0, 'January', 2021, 352); 
insert into pricing values(14.2, 'February', 2021, 931); insert into pricing values(19.0, 'February', 2021, 1025); insert into pricing values(5.0, 'February', 2021, 361); 
insert into pricing values(14.2, 'March', 2021, 910); insert into pricing values(19.0, 'March', 2021, 1225); insert into pricing values(5.0, 'March', 2021, 365); 
insert into pricing values(14.2, 'April', 2021, 942); insert into pricing values(19.0, 'April', 2021, 1300); insert into pricing values(5.0, 'April', 2021, 330); 
insert into pricing values(14.2, 'May', 2021, 942); insert into pricing values(19.0, 'May', 2021, 1280); insert into pricing values(5.0, 'May', 2021, 333); 
insert into pricing values(14.2, 'June', 2021, 958); insert into pricing values(19.0, 'June', 2021, 1283); insert into pricing values(5.0, 'June', 2021, 320); 
insert into pricing values(14.2, 'July', 2021, 950); insert into pricing values(19.0, 'July', 2021, 1295); insert into pricing values(5.0, 'July', 2021, 330); 
insert into pricing values(14.2, 'August', 2021, 947); insert into pricing values(19.0, 'August', 2021, 1298); insert into pricing values(5.0, 'August', 2021, 337); 
insert into pricing values(14.2, 'September', 2021, 963); insert into pricing values(19.0, 'September', 2021, 1306); insert into pricing values(5.0, 'September', 2021, 340); 
insert into pricing values(14.2, 'October', 2021, 960); insert into pricing values(19.0, 'October', 2021, 1310); insert into pricing values(5.0, 'October', 2021, 347); 
insert into pricing values(14.2, 'November', 2021, 970); insert into pricing values(19.0, 'November', 2021, 1313);
insert into pricing values(5.0, 'November', 2021, 350); 
insert into pricing values(14.2, 'December', 2021, 974); 
insert into pricing values(19.0, 'December', 2021, 1320); 
insert into pricing values(5.0, 'December', 2021, 362); 
insert into pricing values(14.2, 'January', 2022, 999); 
insert into pricing values(19.0, 'January', 2022, 1309); 
insert into pricing values(5.0, 'January', 2022, 359); 
