-- Runtime: 165 ms, faster than 89.77% of MySQL online submissions for Second Highest Salary.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Second Highest Salary.

select (select distinct Salary from Employee order by Salary desc limit 1 offset 1) as SecondHighestSalary;