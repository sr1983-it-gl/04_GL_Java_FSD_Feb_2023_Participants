select p.PRO_ID, p.PRO_NAME, o.ORD_DATE from product p
inner join supplier_pricing sp
ON p.PRO_ID = sp.pro_ID
inner join `order` o
on sp.PRICING_ID = o.PRICING_ID
where o.ORD_DATE > "2021-10-05"; 




