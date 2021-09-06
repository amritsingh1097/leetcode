-- Runtime: 195 ms, faster than 75.64% of MySQL online submissions for Swap Salary.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Swap Salary.

update Salary set sex = case sex when 'm' then 'f' else 'm' end;