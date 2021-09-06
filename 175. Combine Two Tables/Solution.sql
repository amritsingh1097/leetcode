-- Runtime: 261 ms, faster than 97.19% of MySQL online submissions for Combine Two Tables.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Combine Two Tables.

select FirstName, LastName, City, State from Person P left join Address A on P.PersonId = A.PersonId;