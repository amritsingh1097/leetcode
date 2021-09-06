-- Runtime: 282 ms, faster than 95.01% of MySQL online submissions for Employees Earning More Than Their Managers.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Employees Earning More Than Their Managers.

select E.Name as Employee from Employee E join Employee M on E.ManagerId = M.Id and E.Salary > M.Salary;