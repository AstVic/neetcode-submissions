-- Write your query below
SELECT name FROM customers AS c
FULL JOIN orders AS o ON c.id = o.customer_id
WHERE o.id IS NULL
