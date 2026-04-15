--Question: Write a query to list the first_name of every customer along with the item they purchased.

select c.first_name , o.item from customers c
join orders o on
c.customer_id = o.customer_id


--Question: Find the total amount spent by each customer. Display their first_name and the total sum. Ensure customers who haven't bought anything show as 0 or NULL.

select c.first_name,c.last_name , sum(o.amount) from customers c
join orders o on
c.customer_id = o.customer_id
group by c.customer_id,c.first_name

--Question: Identify the names of customers who have not placed any orders.

SELECT c.first_name, c.last_name
FROM Customers c
LEFT JOIN Orders o ON c.customer_id = o.customer_id
WHERE o.order_id IS NULL;

--Question: List the first_name, the item purchased, and the status of their shipping for all orders.

select c.first_name || ' ' || c.last_name AS fullname, o.item, s.status from customers c
join orders o on c.customer_id = o.customer_id
join shippings s on o.customer_id = s.customer

--Question: Show the first_name and country of customers who have a 'Pending' shipping status.
select c.first_name || ' ' || c.last_name as fullname, c.country from customers c
join shippings s on c.customer_id = s.customer
where s.status = 'Pending'

--Question: Which country has the highest total order amount?

select c.country, sum(o.amount) as total_amount from customers c
join orders o on c.customer_id = o.customer_id
group by c.country
order by total_amount desc
limit 1