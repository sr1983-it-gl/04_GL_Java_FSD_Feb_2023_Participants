select S.SUPP_NAME, SP_RO_2.*,

CASE
	WHEN AverageRating = 5 THEN 'Excellent Service'
	WHEN AverageRating > 4 THEN 'Good Service'    
	WHEN AverageRating > 2 THEN 'Average Service'    
    ELSE 'Poor Service'
END As 'TypeOfService'
  from supplier S inner join (
select SUPP_ID, AVG(RAT_RATSTARS) as AverageRating from (
	select SP.SUPP_ID, RO.ORD_ID, RO.RAT_RATSTARS 
	from supplier_pricing SP inner join (
		select O.ORD_ID, O.PRICING_ID, R.RAT_RATSTARS from 
		`Order` O inner join Rating R ON
		O.ORD_ID = R.ORD_ID
	) as RO
	on SP.PRICING_ID = RO.PRICING_ID
) as SP_RO
group by supp_id
) as SP_RO_2
ON S.SUPP_ID = SP_RO_2.SUPP_ID;


======================

Procedure Creation - 'DisplaySupplierDetails'

==============================

call DisplaySupplierDetails();
