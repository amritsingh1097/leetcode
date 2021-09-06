-- Runtime: 351 ms, faster than 99.69% of MySQL online submissions for Customers Who Never Order.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Customers Who Never Order.

select Name as Customers from Customers where Id NOT IN (select CustomerId from Orders);