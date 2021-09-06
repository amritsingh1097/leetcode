-- Runtime: 174 ms, faster than 68.56% of MySQL online submissions for Not Boring Movies.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Not Boring Movies.

select * from Cinema where mod(id, 2) = 1 and description != 'boring' order by rating desc;