select C.CAT_ID, C.CAT_NAME, 
Min(SP_P.MinPrice) as 'MinPrice'
 from Category C inner join (
	select P.*, SP.MinPrice from product P inner join (
		select pro_id, min(SUPP_PRICE) as MinPrice from supplier_pricing 
		group by pro_id
	) as SP
	on P.pro_id = SP.PRO_ID
) as SP_P
on C.CAT_ID = SP_P.CAT_ID
group by SP_P.CAT_ID
