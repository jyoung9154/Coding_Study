SELECT 

a.product_code,
sum(a.price * b.sales_amount) as sales

From product as a join offline_sale as b on a.product_id = b.product_id
group by a.product_code
order by sales desc, product_code asc;
