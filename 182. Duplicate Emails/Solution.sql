-- Runtime: 268 ms, faster than 93.39% of MySQL online submissions for Duplicate Emails.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Duplicate Emails.

select Email from Person group by Email having COUNT(Email) > 1;