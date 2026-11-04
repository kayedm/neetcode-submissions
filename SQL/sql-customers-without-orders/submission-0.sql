-- Write your query below
select customers.name from customers left join orders ON customers.id=orders.customer_id where orders.id IS NULL;