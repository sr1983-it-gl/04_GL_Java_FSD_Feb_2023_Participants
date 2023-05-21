select * from supplier where SUPP_ID IN (
select supp_id from supplier_pricing group by SUPP_ID
having count(SUPP_ID) > 1
)
