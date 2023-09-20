-- 코드를 입력하세요
select * from (SELECT  date_format(SALES_DATE,'%Y-%m-%d') AS SALES_DATE,PRODUCT_ID,USER_ID,SALES_AMOUNT
FROM ONLINE_SALE 
where Sales_date like '2022-03-%'
union all
SELECT  date_format(SALES_DATE,'%Y-%m-%d') AS SALES_DATE,product_id, null as USER_ID, Sales_amount
FROM OFFLINE_SALE
WHERE SALES_DATE like '2022-03-%') u
order by sales_date,product_id,user_id;