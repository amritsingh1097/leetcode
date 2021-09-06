// Runtime: 1 ms, faster than 99.76% of Java online submissions for Fizz Buzz.
// Memory Usage: 39.9 MB, less than 82.86% of Java online submissions for Fizz Buzz.

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        
        for (int i = 1; i <= n; ++i) {
            if (i % 3 == 0 && i % 5 == 0)   answer.add("FizzBuzz");
            else if (i % 3 == 0)    answer.add("Fizz");
            else if (i % 5 == 0)    answer.add("Buzz");
            else    answer.add(String.valueOf(i));
        }
        
        return answer;
    }
}


// Runtime: 1 ms, faster than 99.51% of Java online submissions for Fizz Buzz.
// Memory Usage: 40 MB, less than 73.81% of Java online submissions for Fizz Buzz.

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        
        for (int i = 1; i <= n; ++i) {
            StringBuilder sb =  new StringBuilder();;
            
            if (i % 3 == 0) sb.append("Fizz");
            if (i % 5 == 0) sb.append("Buzz");
            
            if (sb.length() == 0)  sb.append(i);
            
            answer.add(sb.toString());
        }
        
        return answer;
    }
}


// Optimized approach using HashMap
// Useful if there are multiple conditions to check
// Runtime: 3 ms, faster than 32.80% of Java online submissions for Fizz Buzz.
// Memory Usage: 40.6 MB, less than 23.65% of Java online submissions for Fizz Buzz.

class Solution {
    public List<String> fizzBuzz(int n) {
        Map<Integer, String> mp = new HashMap<>(){{
            put(3, "Fizz");
            put(5, "Buzz");
        }};
        List<String> answer = new ArrayList<>();
        
        for (int i = 1; i <= n; ++i) {
            StringBuilder sb =  new StringBuilder();
            
            for (Integer k : mp.keySet()) {
                if (i % k == 0)
                    sb.append(mp.get(k));
            }
            
            if (sb.length() == 0)  sb.append(i);
            
            answer.add(sb.toString());
        }
        
        return answer;
    }
}